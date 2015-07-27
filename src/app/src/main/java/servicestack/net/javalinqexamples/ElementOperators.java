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
public class ElementOperators {

    public void linq58(){
        List<Product> products = getProductList();

        Product product12 = first(products, new Predicate<Product>() {
            @Override
            public boolean apply(Product p) {
                return p.productId == 12;
            }
        });

        Log.d(product12);
    }

    public void linq59(){
        String[] strings = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        String startsWithO = first(strings, new Predicate<String>() {
            @Override
            public boolean apply(String s) {
                return s.charAt(0) == 'o';
            }
        });

        Log.d("A string starting with 'o': " + startsWithO);
    }

    public void linq61(){
        int[] numbers = { };

        int firstNumOrDefault = first(toList(numbers), 0);

        Log.d(firstNumOrDefault);
    }

    public void linq62(){
        List<Product> products = getProductList();

        Product product789 = first(products, new Predicate<Product>() {
            @Override
            public boolean apply(Product p) {
                return p.productId == 789;
            }
        });

        Log.d("Product 789 exists: " + (product789 != null));
    }

    public void linq64(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        Integer fourthLowNum = filter(toList(numbers), new Predicate<Integer>() {
                @Override
                public boolean apply(Integer n) {
                    return n > 5;
                }
            })
            .get(1);  // second number is index 1 because sequences use 0-based indexing

        Log.d("Second number > 5: " + fourthLowNum);
    }
}
