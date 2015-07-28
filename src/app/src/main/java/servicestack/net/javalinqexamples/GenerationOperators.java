package servicestack.net.javalinqexamples;

import static net.servicestack.func.Func.*;
import static servicestack.net.javalinqexamples.support.Data.getCustomerList;
import static servicestack.net.javalinqexamples.support.Data.getProductList;

import net.servicestack.client.Log;
import net.servicestack.func.Function;
import net.servicestack.func.Group;
import net.servicestack.func.Predicate;
import net.servicestack.func.Reducer;
import net.servicestack.func.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Product;


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
