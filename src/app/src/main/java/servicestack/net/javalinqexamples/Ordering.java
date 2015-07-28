package servicestack.net.javalinqexamples;

import static net.servicestack.func.Func.*;
import static servicestack.net.javalinqexamples.support.Data.getCustomerList;
import static servicestack.net.javalinqexamples.support.Data.getProductList;

import net.servicestack.client.Log;
import net.servicestack.func.Function;
import net.servicestack.func.Group;
import net.servicestack.func.Predicate;
import net.servicestack.func.Predicate2;
import net.servicestack.func.Reducer;
import net.servicestack.func.Tuple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Order;
import servicestack.net.javalinqexamples.support.Product;

/**
 * Created by mythz on 7/26/2015.
 */
public class Ordering {

    public void linq28(){
        String[] words = new String[] { "cherry", "apple", "blueberry" };

        List<String> sortedWords = orderBy(words);

        Log.d("The sorted list of words:");
        for (String w : sortedWords){
            Log.d(w);
        }
    }

    public void linq29(){
        String[] words = new String[] { "cherry", "apple", "blueberry" };

        List<String> sortedWords = orderBy(words, new Function<String, Comparable>() {
            @Override
            public Comparable apply(String s) {
                return s.length();
            }
        });

        Log.d("The sorted list of words (by length):");
        for (String w : sortedWords){
            Log.d(w);
        }
    }

    public void linq30(){
        List<Product> products = getProductList();

        List<Product> sortedProducts = orderBy(products, new Function<Product, Comparable>() {
            @Override
            public Comparable apply(Product p) {
                return p.productName;
            }
        });

        for (Product p : sortedProducts){
            Log.d(p);
        }
    }

    public void linq31(){
        String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

        List<String> sortedWords = orderBy(words, String.CASE_INSENSITIVE_ORDER);

        for (String w : sortedWords){
            Log.d(w);
        }
    }

    public void linq32(){
        double[] doubles = new double[] { 1.7, 2.3, 1.9, 4.1, 2.9 };

        List<Double> sortedDoubles = orderByDesc(toList(doubles));

        Log.d("The doubles from highest to lowest:");
        for (Double d : sortedDoubles){
            Log.d(d);
        }
    }

    public void linq33(){
        List<Product> products = getProductList();

        List<Product> sortedProducts = orderByDesc(products, new Function<Product, Integer>(){
            @Override
            public Integer apply(Product p) {
                return p.unitsInStock;
            }
        });

        for (Product p : sortedProducts){
            Log.d(p);
        }
    }

    public void linq34(){
        String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

        List<String> sortedWords = orderByDesc(words, String.CASE_INSENSITIVE_ORDER);

        for (String w : sortedWords){
            Log.d(w);
        }
    }

    public void linq35(){
        String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        List<String> sortedDigits = orderBy(orderBy(digits), new Function<String, Comparable>() {
            @Override
            public Comparable apply(String s) {
                return s.length();
            }
        });

        Log.d("Sorted digits:");
        for (String d : sortedDigits){
            Log.d(d);
        }
    }

    public void linq36(){
        String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

        List<String> sortedWords = orderBy(orderBy(words, String.CASE_INSENSITIVE_ORDER), new Function<String, Comparable>() {
            @Override
            public Comparable apply(String s) {
                return s.length();
            }
        });

        for (String w : sortedWords){
            Log.d(w);
        }
    }

    public void linq37(){
        List<Product> products = getProductList();

        List<Product> sortedProducts = orderByAll(products,
            new Comparator<Product>() {
                @Override
                public int compare(Product a, Product b) {
                    return a.category.compareTo(b.category);
                }
            },
            new Comparator<Product>() {
                @Override
                public int compare(Product a, Product b) {
                    return b.unitPrice.compareTo(a.unitPrice);
                }
            }
        );

        for (Product p : sortedProducts){
            Log.d(p);
        }
    }

    public void linq38(){
        String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

        List<String> sortedWords = orderByAll(words,
            new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return Integer.compare(a.length(), b.length());
                }
            },
            new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return String.CASE_INSENSITIVE_ORDER.compare(b,a);
                }
            });

        for (String w : sortedWords){
            Log.d(w);
        }
    }

    public void linq39(){
        String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        List<String> reversedIDigits = reverse(filter(digits, new Predicate<String>() {
            @Override
            public boolean apply(String d) {
                return d.charAt(1) == 'i';
            }
        }));

        Log.d("A backwards list of the digits with a second character of 'i':");
        for (String d : reversedIDigits){
            Log.d(d);
        }
    }
}
