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
public class Grouping {

    public void linq40(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Tuple<Integer, Group<Integer,Integer>>> numberGroups = map(
            groupBy(toList(numbers), new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer n){
                    return n % 5;
                }
            }),
            new Function<Group<Integer, Integer>, Tuple<Integer, Group<Integer,Integer>>>() {
                @Override
                public Tuple<Integer, Group<Integer,Integer>> apply(Group<Integer, Integer> g){
                    return new Tuple<>(g.key, g);
                }
            });

        for (Tuple<Integer, Group<Integer,Integer>> g : numberGroups){
            Log.d("Numbers with a remainder of " + g.A + " when divided by 5:");
            for (Integer n : g.B){
                Log.d(n);
            }
        }
    }

    public void linq41(){
        String[] words = new String[] { "blueberry", "chimpanzee", "abacus", "banana", "apple", "cheese" };

        List<Tuple<Character, Group<Character,String>>> wordGroups = map(
            groupBy(toList(words), new Function<String, Character>() {
                @Override
                public Character apply(String s){
                    return s.charAt(0);
                }
            }),
            new Function<Group<Character, String>, Tuple<Character, Group<Character,String>>>() {
                @Override
                public Tuple<Character, Group<Character,String>> apply(Group<Character,String> g){
                    return new Tuple<>(g.key, g);
                }
            });

        for (Tuple<Character, Group<Character,String>> g : wordGroups){
            Log.d("Words that start with the letter '" + g.A + "':");
            for (String w : g.B){
                Log.d(w);
            }
        }
    }

    public void linq42(){
        List<Product> products = getProductList();

        List<Tuple<String,Group<String,Product>>> orderGroups = map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p){
                    return p.category;
                }
            }),
            new Function<Group<String,Product>, Tuple<String, Group<String,Product>>>() {
                @Override
                public Tuple<String, Group<String,Product>> apply(Group<String,Product> g){
                    return new Tuple<>(g.key, g);
                }
            });

        for (Tuple<String,Group<String,Product>> x : orderGroups){
            Log.d(x.B);
        }
    }

    public void linq43(){
        List<Customer> customers = getCustomerList();

        List<Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>>> customerOrderGroups =
            map(customers, new Function<Customer, Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>>>() {
                @Override
                public Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>> apply(Customer c) {
                    return new Tuple<>( //Yay Type Inference!
                        c.companyName,
                        map(groupBy(c.orders, new Function<Order, Integer>() {
                                @Override
                                public Integer apply(Order o) {
                                    return o.orderDate.getYear() + 1900;
                                }
                            }),
                            new Function<Group<Integer, Order>, Tuple<Integer, ArrayList<Group<Integer, Order>>>>() {
                                @Override
                                public Tuple<Integer, ArrayList<Group<Integer, Order>>> apply(Group<Integer, Order> yg) {
                                    return new Tuple<>( //Yay Type Inference!
                                        yg.key,
                                        groupBy(yg.items, new Function<Order, Integer>() {
                                            @Override
                                            public Integer apply(Order o) {
                                                return o.orderDate.getMonth() + 1;
                                            }
                                        })
                                    );
                                }
                            }
                        )
                    );
                }
            });

        for (Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>> g : customerOrderGroups){
            Log.d("\n# " + g.A);
            for (Tuple<Integer, ArrayList<Group<Integer, Order>>> yg : g.B){
                Log.d(yg.A + ": ");
                for (Group<Integer, Order> mg : yg.B){
                    Log.d("  " + mg.key + ": ");
                    for (Order o : mg){
                        Log.d("    " + o);
                    }
                }
            }
        }
    }

    public void linq44(){
        String[] anagrams = new String[] { "from   ", " salt", " earn ", "  last   ", " near ", " form  " };

        List<Group<String, String>> orderGroups = groupBy(toList(anagrams),
                new Function<String, String>() {
                    @Override
                    public String apply(String w) {
                        return w.trim();
                    }
                },
                new Predicate2<String, String>() {
                    @Override
                    public boolean apply(String a, String b) {
                        char[] aChars = a.toCharArray();
                        char[] bChars = b.toCharArray();
                        Arrays.sort(aChars);
                        Arrays.sort(bChars);
                        return Arrays.equals(aChars, bChars);
                    }
                });

        for (Group<String, String> g : orderGroups){
            StringBuilder sb = new StringBuilder();
            for (String w : g){
                if (sb.length() > 0)
                    sb.append(", ");

                sb.append("'").append(w).append("'");
            }
            Log.d("[ " + sb + " ]");
        }
    }

    public void linq45(){
        String[] anagrams = new String[] { "from   ", " salt", " earn ", "  last   ", " near ", " form  " };

        List<Group<String, String>> orderGroups = groupBy(toList(anagrams),
                new Function<String, String>() {
                    @Override
                    public String apply(String w) {
                        return w.trim();
                    }
                },
                new Predicate2<String, String>() {
                    @Override
                    public boolean apply(String a, String b) {
                        char[] aChars = a.toCharArray();
                        char[] bChars = b.toCharArray();
                        Arrays.sort(aChars);
                        Arrays.sort(bChars);
                        return Arrays.equals(aChars, bChars);
                    }
                },
                new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                });

        for (Group<String, String> g : orderGroups){
            StringBuilder sb = new StringBuilder();
            for (String w : g){
                if (sb.length() > 0)
                    sb.append(", ");

                sb.append("'").append(w).append("'");
            }
            Log.d("[ " + sb + " ]");
        }
    }
}
