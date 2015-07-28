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
import java.util.List;
import java.util.Map;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Order;
import servicestack.net.javalinqexamples.support.Product;


/**
 * Created by mythz on 7/26/2015.
 */
public class Quantifiers {

    public void linq67(){
        String[] words = new String[] { "believe", "relief", "receipt", "field" };

        boolean iAfterE = any(words, new Predicate<String>() {
            @Override
            public boolean apply(String w) {
                return w.contains("ei");
            }
        });

        Log.d("There is a word that contains in the list that contains 'ei': " + iAfterE);
    }

    public void linq69(){
        List<Product> products = getProductList();

        List<Tuple<String, Group<String,Product>>> productGroups =
            map(
                filter(
                    groupBy(products, new Function<Product, String>() {
                        @Override
                        public String apply(Product p) {
                            return p.category;
                        }
                    }),
                    new Predicate<Group<String, Product>>() {
                        @Override
                        public boolean apply(Group<String, Product> g) {
                            return any(g, new Predicate<Product>() {
                                @Override
                                public boolean apply(Product p) {
                                    return p.unitsInStock == 0;
                                }
                            });
                        }
                    })
                , new Function<Group<String, Product>, Tuple<String, Group<String, Product>>>() {
                    @Override
                    public Tuple<String, Group<String, Product>> apply(Group<String, Product> g) {
                        return new Tuple<>(g.key, g);
                    }
                }
            );

        for (Tuple<String, Group<String,Product>> t : productGroups){
            Log.d(t.B);
        }
    }

    public void linq70(){
        int[] numbers = new int[] { 1, 11, 3, 19, 41, 65, 19 };

        boolean onlyOdd = all(toList(numbers), new Predicate<Integer>() {
            @Override
            public boolean apply(Integer n) {
                return n % 2 == 1;
            }
        });

        Log.d("The list contains only odd numbers: " + onlyOdd);
    }

    public void linq72(){
        List<Product> products = getProductList();

        List<Tuple<String, Group<String,Product>>> productGroups =
            map(
                filter(
                    groupBy(products, new Function<Product, String>() {
                        @Override
                        public String apply(Product p) {
                            return p.category;
                        }
                    }),
                    new Predicate<Group<String, Product>>() {
                        @Override
                        public boolean apply(Group<String, Product> g) {
                            return all(g, new Predicate<Product>() {
                                @Override
                                public boolean apply(Product p) {
                                    return p.unitsInStock > 0;
                                }
                            });
                        }
                    })
                , new Function<Group<String, Product>, Tuple<String, Group<String, Product>>>() {
                    @Override
                    public Tuple<String, Group<String, Product>> apply(Group<String, Product> g) {
                        return new Tuple<>(g.key, g);
                    }
                }
            );

        for (Tuple<String, Group<String,Product>> t : productGroups){
            Log.d(t.B);
        }
    }
}
