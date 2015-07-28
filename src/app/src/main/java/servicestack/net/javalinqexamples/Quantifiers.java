package servicestack.net.javalinqexamples;

import com.android.internal.util.Predicate;

import java.util.List;

import servicestack.net.javalinqexamples.support.Group;
import servicestack.net.javalinqexamples.support.Log;
import servicestack.net.javalinqexamples.support.Product;

import static servicestack.net.javalinqexamples.support.Data.getProductList;
import static servicestack.net.javalinqexamples.support.Func.*;


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
