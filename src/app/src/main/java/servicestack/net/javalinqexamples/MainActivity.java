package servicestack.net.javalinqexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import servicestack.net.javalinqexamples.support.Data;
import servicestack.net.javalinqexamples.support.Log;
import servicestack.net.javalinqexamples.support.LogProvider;
import servicestack.net.javalinqexamples.support.LogType;


public class MainActivity extends Activity {

    public class StringBuilderLogProvider extends LogProvider {
        StringBuilder sb;

        public StringBuilderLogProvider(StringBuilder sb){
            super(null, true);
            this.sb = sb;
        }

        @Override
        public void println(LogType type, Object message) {
            sb.append("\n" + message.toString());
        }
    }

    StringBuilder sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = new StringBuilder();
        Log.Instance = new StringBuilderLogProvider(sb);
        Data.init(getResources());

        Log.i("101 Java LINQ Examples:");
//        Run(new Restrictions());
//        Run(new Projections());
//        Run(new Partitioning());
//        Run(new Ordering());
        Run(new Grouping());
    }

    void Run(Object linqExamples){
        Class cls = linqExamples.getClass();
        Method[] methods = cls.getMethods();
        for (Method method : methods){
            if (method.getDeclaringClass() != cls || method.getParameterTypes().length != 0)
                continue;

            Log.i("\n" + method.getName().toUpperCase() + ":");
            try {
                method.invoke(linqExamples);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        TextView txtMain = (TextView)findViewById(R.id.txtMain);
        txtMain.setText(sb.toString());

        final ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
