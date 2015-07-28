package servicestack.net.javalinqexamples;

import static net.servicestack.func.Func.*;
import static servicestack.net.javalinqexamples.support.Data.getCustomerList;
import static servicestack.net.javalinqexamples.support.Data.getProductList;

import net.servicestack.client.Log;
import net.servicestack.func.Function;
import net.servicestack.func.FunctionResult;
import net.servicestack.func.Group;
import net.servicestack.func.Predicate;
import net.servicestack.func.Predicate2;
import net.servicestack.func.Reducer;
import net.servicestack.func.Tuple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Order;
import servicestack.net.javalinqexamples.support.Product;


/**
 * Created by mythz on 7/26/2015.
 */
public class QueryExecution {

    public void linq099(){
        final int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        final int[] i = {0};
        List<FunctionResult<Integer>> q =
            map(toList(numbers), new Function<Integer, FunctionResult<Integer>>() {
                @Override
                public FunctionResult<Integer> apply(Integer n) {
                    return new FunctionResult<Integer>() {
                        @Override
                        public Integer apply() {
                            return ++i[0];
                        }
                    };
                }
            });

        for (FunctionResult<Integer> f : q){
            Integer v = f.apply();
            Log.d("v = " + v + ", i = " + i[0]);
        }
    }

    public void linq100(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        final int[] i = {0};
        List<Integer> q = map(toList(numbers), new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return ++i[0];
            }
        });

        for (Integer v : q){
            Log.d("v = " + v + ", i = " + i[0]);
        }
    }

    public void linq101(){
        final int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        FunctionResult<List<Integer>> lowNumbers =
            new FunctionResult<List<Integer>>() {
                @Override
                public List<Integer> apply() {
                    return filter(toList(numbers), new Predicate<Integer>() {
                        @Override
                        public boolean apply(Integer n) {
                            return n <= 3;
                        }
                    });
                }
            };

        Log.d("First run numbers <= 3:");
        for (Integer n : lowNumbers.apply()){
            Log.d(n);
        }

        for (int i = 0; i < 10; i++){
            numbers[i] = -numbers[i];
        }

        Log.d("Second run numbers <= 3:");
        for (Integer n : lowNumbers.apply()){
            Log.d(n);
        }
    }
}
