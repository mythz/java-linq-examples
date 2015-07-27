package servicestack.net.javalinqexamples;

import com.android.internal.util.Predicate;

import java.util.Date;
import java.util.List;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Func;
import servicestack.net.javalinqexamples.support.Log;
import servicestack.net.javalinqexamples.support.Order;
import servicestack.net.javalinqexamples.support.Product;

import static servicestack.net.javalinqexamples.support.Data.getCustomerList;
import static servicestack.net.javalinqexamples.support.Data.getProductList;
import static servicestack.net.javalinqexamples.support.Func.*;


/**
 * Created by mythz on 7/26/2015.
 */
public class GenerationOperators {

    public void linq65(){
        List<Tuple<Integer, String>> numbers = map(toList(range(100, 150)), new Function<Integer, Tuple<Integer, String>>() {
            @Override
            public Tuple<Integer, String> apply(Integer n) {
                return new Tuple<>(n, n % 2 == 1 ? "odd" : "even");
            }
        });

        for (Tuple<Integer,String> n : numbers){
            Log.d("The number " + n.A + " is " + n.B);
        }
    }

    public void linq66(){
        int[] numbers = repeat(7, 10);

        for (int n : numbers){
            Log.d(n);
        }
    }
}
