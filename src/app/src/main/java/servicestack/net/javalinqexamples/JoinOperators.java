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
public class JoinOperators {

    public void linq102(){
        String[] categories = new String[]{
            "Beverages",
            "Condiments",
            "Vegetables",
            "Dairy Products",
            "Seafood" };

        List<Product> products = getProductList();

        List<Tuple<String, String>> q =
            map(
                join(toList(categories), products, new Predicate2<String, Product>() {
                    @Override
                    public boolean apply(String c, Product p) {
                        return c.equals(p.category);
                    }
                }),
                new Function<Tuple<String, Product>, Tuple<String, String>>() {
                    @Override
                    public Tuple<String, String> apply(Tuple<String, Product> t) {
                        return new Tuple<>(t.A, t.B.productName);
                    }
                }
            );

        for (Tuple<String,String> v : q){
            Log.d(v.A + ": " + v.B);
        }
    }

    public void linq103(){
        String[] categories = new String[]{
            "Beverages",
            "Condiments",
            "Vegetables",
            "Dairy Products",
            "Seafood" };

        List<Product> products = getProductList();

        List<Tuple<String,ArrayList<Product>>> q =
            map(
                joinGroup(toList(categories), products, new Predicate2<String, Product>() {
                    @Override
                    public boolean apply(String c, Product p) {
                        return c.equals(p.category);
                    }
                }),
                new Function<Group<String, Tuple<String, Product>>, Tuple<String, ArrayList<Product>>>() {
                    @Override
                    public Tuple<String, ArrayList<Product>> apply(Group<String, Tuple<String, Product>> g) {
                        return new Tuple<>(
                            g.key,
                            map(g.items, new Function<Tuple<String,Product>, Product>() {
                                @Override
                                public Product apply(Tuple<String, Product> t) {
                                    return t.B;
                                }
                            })
                        );
                    }
                }
            );

        for (Tuple<String,ArrayList<Product>> v : q){
            Log.d(v.A + ":");
            for (Product p : v.B){
                Log.d("   " + p.productName);
            }
        }
    }

    public void linq104(){
        String[] categories = new String[]{
            "Beverages",
            "Condiments",
            "Vegetables",
            "Dairy Products",
            "Seafood" };

        List<Product> products = getProductList();

        List<Tuple<String,String>> q =
            expand(
                map(
                    joinGroup(toList(categories), products, new Predicate2<String, Product>() {
                        @Override
                        public boolean apply(String c, Product p) {
                            return c.equals(p.category);
                        }
                    }),
                    new Function<Group<String, Tuple<String, Product>>, List<Tuple<String, String>>>() {
                        @Override
                        public List<Tuple<String, String>> apply(Group<String, Tuple<String, Product>> g) {
                            return map(g.items, new Function<Tuple<String, Product>, Tuple<String, String>>() {
                                @Override
                                public Tuple<String, String> apply(Tuple<String, Product> t) {
                                    return new Tuple<>(t.A, t.B.productName);
                                }
                            });
                        }
                    }
                )
            );

        for (Tuple<String,String> v : q){
            Log.d(v.B + ": " + v.A);
        }
    }

    public void linq105(){
        String[] categories = new String[]{
            "Beverages",
            "Condiments",
            "Vegetables",
            "Dairy Products",
            "Seafood" };

        final List<Product> products = getProductList();

        List<Tuple<String,String>> q =
            expand(
                map(toList(categories), new Function<String, List<Tuple<String, String>>>() {
                    @Override
                    public List<Tuple<String, String>> apply(final String c) {
                        List<Product> catProducts = filter(products, new Predicate<Product>() {
                            @Override
                            public boolean apply(Product p) {
                                return c.equals(p.category);
                            }
                        });
                        return catProducts.isEmpty()
                            ? toList(new Tuple<>(c, "(No products)"))
                            : map(catProducts, new Function<Product, Tuple<String, String>>() {
                            @Override
                            public Tuple<String, String> apply(Product p) {
                                return new Tuple<>(c, p.productName);
                            }
                        });
                    }
                })
            );

        for (Tuple<String,String> v : q){
            Log.d(v.B + ": " + v.A);
        }
    }
}
