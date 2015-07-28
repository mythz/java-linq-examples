package servicestack.net.javalinqexamples;

import com.android.internal.util.Predicate;

import java.util.Arrays;
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
public class MiscOperators {

    public void linq94(){
        int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
        int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

        List<Integer> allNumbers = concat(toList(numbersA), toList(numbersB));

        Log.d("All numbers from both arrays:");
        for (Integer n : allNumbers){
            Log.d(n);
        }
    }

    public void linq95(){
        List<Customer> customers = getCustomerList();
        List<Product> products = getProductList();

        List<String> customerNames = map(customers, new Function<Customer, String>() {
            @Override
            public String apply(Customer c) {
                return c.companyName;
            }
        });

        List<String> productNames = map(products, new Function<Product, String>() {
            @Override
            public String apply(Product p) {
                return p.productName;
            }
        });

        List<String> allNames = concat(customerNames, productNames);

        Log.d("Customer and product names:");
        for (String n : allNames){
            Log.d(n);
        }
    }

    public void linq96(){
        String[] wordsA = new String[] { "cherry", "apple", "blueberry" };
        String[] wordsB = new String[] { "cherry", "apple", "blueberry" };

        boolean match = Arrays.equals(wordsA, wordsB);

        Log.d("The sequences match: " + match);
    }

    public void linq97(){
        String[] wordsA = new String[] { "cherry", "apple", "blueberry" };
        String[] wordsB = new String[] { "cherry", "blueberry", "cherry" };

        boolean match = Arrays.equals(wordsA, wordsB);

        Log.d("The sequences match: " + match);
    }
}
