package servicestack.net.javalinqexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import servicestack.net.javalinqexamples.support.Log;
import servicestack.net.javalinqexamples.support.LogProvider;
import servicestack.net.javalinqexamples.support.LogType;


public class MainActivity extends Activity {

    public class TextViewLogProvider extends LogProvider {
        TextView textView;

        public TextViewLogProvider(TextView textView){
            super(null, true);
            this.textView = textView;
        }

        @Override
        public void println(LogType type, Object message) {
            textView.setText(textView.getText() + "\n" + message.toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMain = (TextView)findViewById(R.id.txtMain);
        Log.Instance = new TextViewLogProvider(txtMain);

        Log.i("101 Java LINQ Examples:");
        Run(new Restrictions());
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
