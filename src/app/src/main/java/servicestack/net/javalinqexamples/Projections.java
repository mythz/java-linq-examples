package servicestack.net.javalinqexamples;

import static net.servicestack.func.Func.*;
import static servicestack.net.javalinqexamples.support.Data.getCustomerList;
import static servicestack.net.javalinqexamples.support.Data.getProductList;

import net.servicestack.client.Log;
import net.servicestack.func.Function;
import net.servicestack.func.FunctionIndex;
import net.servicestack.func.Group;
import net.servicestack.func.Predicate;
import net.servicestack.func.Predicate2;
import net.servicestack.func.Reducer;
import net.servicestack.func.Tuple;
import net.servicestack.func.Tuple3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Order;
import servicestack.net.javalinqexamples.support.Product;

/**
 * Created by mythz on 7/26/2015.
 */
public class Projections {

    public void linq06(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Integer> numsPlusOne = map(toList(numbers), new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i + 1;
            }
        });

        Log.d("Numbers + 1:");
        for (Integer n : numsPlusOne){
            Log.d(n);
        }
    }

    public void linq07(){
        List<Product> products = getProductList();

        List<String> productNames = map(products, new Function<Product, String>() {
            @Override
            public String apply(Product p) {
                return p.productName;
            }
        });

        Log.d("Product Names:");
        for (String productName : productNames){
            Log.d(productName);
        }
    }

    public void linq08(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };
        final String[] strings = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        List<String> textNums = map(toList(numbers), new Function<Integer, String>() {
            @Override
            public String apply(Integer n) {
                return strings[n];
            }
        });

        Log.d("Number strings:");
        for (String s : textNums){
            Log.d(s);
        }
    }

    public void linq09(){
        String[] words = new String[]{ "aPPLE", "BlUeBeRrY", "cHeRry" };

        List<Tuple<String,String>> upperLowerWords = map(words, new Function<String, Tuple<String,String>>(){
            @Override
            public Tuple<String,String> apply(String w) {
                return new Tuple<>(w.toUpperCase(), w.toLowerCase());
            }
        });

        for (Tuple<String,String> ul : upperLowerWords){
            Log.d("Uppercase: " + ul.A + ", Lowercase: " + ul.B);
        }
    }

    public void linq10(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };
        final String[] strings = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        List<Tuple<String, Boolean>> digitOddEvens = map(toList(numbers), new Function<Integer, Tuple<String, Boolean>>() {
            @Override
            public Tuple<String, Boolean> apply(Integer n) {
                return new Tuple<>(strings[n], n % 2 == 0);
            }
        });

        for (Tuple<String,Boolean> d : digitOddEvens){
            Log.d("The digit " + d.A + " is " + (d.B ? "even" : "odd") + ".");
        }
    }

    public void linq11(){
        List<Product> products = getProductList();

        List<Tuple3<String,String,Double>> productInfos = map(products, new Function<Product, Tuple3<String, String, Double>>() {
            @Override
            public Tuple3<String, String, Double> apply(Product p) {
                return new Tuple3<>(p.productName, p.category, p.unitPrice);
            }
        });

        Log.d("Product Info:");
        for (Tuple3<String,String,Double> productInfo : productInfos){
            Log.d(productInfo.A + " is in the category " + productInfo.B + " and costs " + productInfo.C + " per unit.");
        }
    }

    public void linq12(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Tuple<Integer,Boolean>> numsInPlace = mapi(toList(numbers), new FunctionIndex<Integer, Tuple<Integer, Boolean>>() {
            @Override
            public Tuple<Integer, Boolean> apply(Integer num, int index) {
                return new Tuple<>(num, num == index);
            }
        });

        Log.d("Number: In-place?");
        for (Tuple<Integer,Boolean> n : numsInPlace){
            Log.d(n.A + ": " + n.B);
        }
    }

    public void linq13(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };
        final String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        List<String> lowNums = map(
            filter(toList(numbers), new Predicate<Integer>() {
                @Override
                public boolean apply(Integer n) {
                    return n < 5;
                }
            }),
            new Function<Integer, String>() {
                @Override
                public String apply(Integer n){
                    return digits[n];
                }
            });

        Log.d("Numbers < 5:");
        for (String num : lowNums){
            Log.d(num);
        }
    }

    public void linq14(){
        int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
        final int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

        List<Tuple<Integer,Integer>> pairs = expand(
            map(toList(numbersA), new Function<Integer,List<Tuple<Integer,Integer>>>() {
                @Override
                public List<Tuple<Integer,Integer>> apply(final Integer a) {
                    return map(filter(toList(numbersB), new Predicate<Integer>() {
                        @Override
                        public boolean apply(Integer b) {
                            return a < b;
                        }
                    }), new Function<Integer, Tuple<Integer,Integer>>() {
                        @Override
                        public Tuple<Integer, Integer> apply(Integer b) {
                            return new Tuple<>(a,b);
                        }
                    });
                }
            })
        );

        Log.d("Pairs where a < b:");
        for (Tuple<Integer,Integer> pair : pairs){
            Log.d(pair.A + " is less than " + pair.B);
        }
    }

    public void linq15(){
        List<Customer> customers = getCustomerList();

        List<Tuple3<String, Integer, Double>> orders = expand(
            map(customers, new Function<Customer, List<Tuple3<String, Integer, Double>>>() {
                @Override
                public List<Tuple3<String, Integer, Double>> apply(final Customer c) {
                    return map(filter(c.orders, new Predicate<Order>() {
                        @Override
                        public boolean apply(Order o) {
                            return o.total < 500;
                        }
                    }), new Function<Order, Tuple3<String, Integer, Double>>() {
                        @Override
                        public Tuple3<String, Integer, Double> apply(Order o) {
                            return new Tuple3<>(c.customerId, o.orderId, o.total);
                        }
                    });
                }
            })
        );

        for (Tuple3<?,?,?> o : orders){
            Log.d(o);
        }
    }

    public void linq16(){
        List<Customer> customers = getCustomerList();

        final Date date = new Date(98, 0, 1); //= 1998-01-01

        List<Tuple3<String, Integer, Date>> orders = expand(
            map(customers, new Function<Customer, List<Tuple3<String, Integer, Date>>>() {
                @Override
                public List<Tuple3<String, Integer, Date>> apply(final Customer c) {
                    return map(filter(c.orders, new Predicate<Order>() {
                        @Override
                        public boolean apply(Order o) {
                            return o.orderDate.after(date);
                        }
                    }), new Function<Order, Tuple3<String, Integer, Date>>() {
                        @Override
                        public Tuple3<String, Integer, Date> apply(Order o) {
                            return new Tuple3<>(c.customerId, o.orderId, o.orderDate);
                        }
                    });
                }
            })
        );

        for (Tuple3<?,?,?> o : orders){
            Log.d(o);
        }
    }

    public void linq17(){
        List<Customer> customers = getCustomerList();

        List<Tuple3<String, Integer, Double>> orders = expand(
                map(customers, new Function<Customer, List<Tuple3<String, Integer, Double>>>() {
                    @Override
                    public List<Tuple3<String, Integer, Double>> apply(final Customer c) {
                        return map(filter(c.orders, new Predicate<Order>() {
                            @Override
                            public boolean apply(Order o) {
                                return o.total >= 2000;
                            }
                        }), new Function<Order, Tuple3<String, Integer, Double>>() {
                            @Override
                            public Tuple3<String, Integer, Double> apply(Order o) {
                                return new Tuple3<>(c.customerId, o.orderId, o.total);
                            }
                        });
                    }
                })
        );

        for (Tuple3<?,?,?> o : orders){
            Log.d(o);
        }
    }

    public void linq18(){
        List<Customer> customers = getCustomerList();

        final Date cutoffDate = new Date(97,0,1); //1997-01-01

        List<Tuple<String, Integer>> orders = expand(
            map(
                filter(customers, new Predicate<Customer>() {
                    @Override
                    public boolean apply(Customer c) {
                        return "WA".equals(c.region);
                    }
                })
                , new Function<Customer, List<Tuple<String, Integer>>>() {
                @Override
                public List<Tuple<String, Integer>> apply(final Customer c) {
                    return map(filter(c.orders, new Predicate<Order>() {
                        @Override
                        public boolean apply(Order o) {
                            return o.orderDate.after(cutoffDate);
                        }
                    }), new Function<Order, Tuple<String, Integer>>() {
                        @Override
                        public Tuple<String, Integer> apply(Order o) {
                            return new Tuple<>(c.customerId, o.orderId);
                        }
                    });
                }
            })
        );

        for (Tuple<?,?> o : orders){
            Log.d(o);
        }
    }

    public void linq19(){
        List<Customer> customers = getCustomerList();

        List<String> customerOrders = expand(
          mapi(customers, new FunctionIndex<Customer, List<String>>() {
              @Override
              public List<String> apply(Customer cust, final int custIndex) {
                  return map(cust.orders, new Function<Order, String>() {
                      @Override
                      public String apply(Order o) {
                          return "Customer #" + (custIndex + 1) + " has an order with OrderID " + o.orderId;
                      }
                  });
              }
          })
        );

        for (String x : customerOrders){
            Log.d(x);
        }
    }
}
