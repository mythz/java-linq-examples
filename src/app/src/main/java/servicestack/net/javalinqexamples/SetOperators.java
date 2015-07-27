package servicestack.net.javalinqexamples;

import com.android.internal.util.Predicate;

import java.util.Date;
import java.util.List;
import java.util.Set;

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
public class SetOperators {

    public void linq46(){
        int[] factorsOf300 = new int[] { 2, 2, 3, 5, 5 };

        List<Integer> uniqueFactors = distinct(toList(factorsOf300));

        Log.d("Prime factors of 300:");
        for (Integer f : uniqueFactors){
            Log.d(f);
        }
    }

    public void linq47(){
        List<Product> products = getProductList();

        List<String> categoryNames = distinct(
            map(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            }));

        Log.d("Category names:");
        for (String n : categoryNames){
            Log.d(n);
        }
    }

    public void linq48(){
        int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
        int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

        List<Integer> uniqueNumbers = union(toList(numbersA), toList(numbersB));

        Log.d("Unique numbers from both arrays:");
        for (Integer n : uniqueNumbers){
            Log.d(n);
        }
    }

    public void linq49(){
        List<Product> products = getProductList();
        List<Customer> customers = getCustomerList();

        List<Character> productFirstChars = map(products, new Function<Product, Character>() {
            @Override
            public Character apply(Product p) {
                return p.productName.charAt(0);
            }
        });

        List<Character> customerFirstChars = map(customers, new Function<Customer, Character>() {
            @Override
            public Character apply(Customer c) {
                return c.companyName.charAt(0);
            }
        });

        List<Character> uniqueFirstChars = union(productFirstChars, customerFirstChars);

        Log.d("Unique first letters from Product names and Customer names:");
        for (Character ch : uniqueFirstChars){
            Log.d(ch);
        }
    }

    public void linq50(){
        int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
        int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

        List<Integer> commonNumbers = intersect(toList(numbersA), toList(numbersB));

        Log.d("Common numbers shared by both arrays:");
        for (Integer n : commonNumbers){
            Log.d(n);
        }
    }

    public void linq51(){
        List<Product> products = getProductList();
        List<Customer> customers = getCustomerList();

        List<Character> productFirstChars = map(products, new Function<Product, Character>() {
            @Override
            public Character apply(Product p) {
                return p.productName.charAt(0);
            }
        });

        List<Character> customerFirstChars = map(customers, new Function<Customer, Character>() {
            @Override
            public Character apply(Customer c) {
                return c.companyName.charAt(0);
            }
        });

        List<Character> commonFirstChars = intersect(productFirstChars, customerFirstChars);

        Log.d("Common first letters from Product names and Customer names:");
        for (Character ch : commonFirstChars){
            Log.d(ch);
        }
    }

    public void linq52(){
        int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
        int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

        List<Integer> aOnlyNumbers = difference(toList(numbersA), toList(numbersB));

        Log.d("Numbers in first array but not second array:");
        for(Integer n: aOnlyNumbers){
            Log.d(n);
        }
    }

    public void linq53(){
        List<Product> products = getProductList();
        List<Customer> customers = getCustomerList();

        List<Character> productFirstChars = map(products, new Function<Product, Character>() {
            @Override
            public Character apply(Product p) {
                return p.productName.charAt(0);
            }
        });

        List<Character> customerFirstChars = map(customers, new Function<Customer, Character>() {
            @Override
            public Character apply(Customer c) {
                return c.companyName.charAt(0);
            }
        });

        List<Character> productOnlyFirstChars = difference(productFirstChars, customerFirstChars);

        Log.d("First letters from Product names, but not from Customer names:");
        for (Character ch : productOnlyFirstChars){
            Log.d(ch);
        }
    }
}
