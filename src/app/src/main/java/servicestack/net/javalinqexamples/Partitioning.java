package servicestack.net.javalinqexamples;

import static net.servicestack.func.Func.*;
import static servicestack.net.javalinqexamples.support.Data.getCustomerList;
import static servicestack.net.javalinqexamples.support.Data.getProductList;

import net.servicestack.client.Log;
import net.servicestack.func.Function;
import net.servicestack.func.Group;
import net.servicestack.func.Predicate;
import net.servicestack.func.Predicate2;
import net.servicestack.func.PredicateIndex;
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
public class Partitioning {

    public void linq20() {
        int[] numbers = new int[]{5, 4, 1, 3, 9, 8, 6, 7, 2, 0};

        List<Integer> first3Numbers = take(toList(numbers), 3);

        Log.d("First 3 numbers:");
        for (Integer n : first3Numbers) {
            Log.d(n);
        }
    }

    public void linq21() {
        List<Customer> customers = getCustomerList();

        List<Tuple3<String, Integer, Date>> first3WAOrders =
            take(
                expand(
                    map(filter(customers, new Predicate<Customer>() {
                        @Override
                        public boolean apply(Customer c) {
                            return "WA".equals(c.region);
                        }
                    }),
                    new Function<Customer, List<Tuple3<String, Integer, Date>>>() {
                        @Override
                        public List<Tuple3<String, Integer, Date>> apply(final Customer c) {
                            return map(c.orders, new Function<Order, Tuple3<String, Integer, Date>>() {
                                @Override
                                public Tuple3<String, Integer, Date> apply(Order o) {
                                    return new Tuple3<>(c.customerId, o.orderId, o.orderDate);
                                }
                            });
                        }
                    })
                ),
            3);

        Log.d("First 3 orders in WA:");
        for (Tuple3<?, ?, ?> o : first3WAOrders) {
            Log.d(o);
        }
    }

    public void linq22() {
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Integer> allButFirst4Numbers = skip(toList(numbers), 4);

        Log.d("All but first 4 numbers:");
        for (Integer n : allButFirst4Numbers){
            Log.d(n);
        }
    }

    public void linq23() {
        List<Customer> customers = getCustomerList();

        List<Tuple3<String, Integer, Date>> allButFirst2Orders =
            skip(
                expand(
                    map(filter(customers, new Predicate<Customer>() {
                            @Override
                            public boolean apply(Customer c) {
                                return "WA".equals(c.region);
                            }
                        }),
                        new Function<Customer, List<Tuple3<String, Integer, Date>>>() {
                            @Override
                            public List<Tuple3<String, Integer, Date>> apply(final Customer c) {
                                return map(c.orders, new Function<Order, Tuple3<String, Integer, Date>>() {
                                    @Override
                                    public Tuple3<String, Integer, Date> apply(Order o) {
                                        return new Tuple3<>(c.customerId, o.orderId, o.orderDate);
                                    }
                                });
                            }
                        })
                    ),
                2);

        Log.d("All but first 2 orders in WA:");
        for (Tuple3<?, ?, ?> o : allButFirst2Orders) {
            Log.d(o);
        }
    }

    public void linq24() {
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Integer> firstNumbersLessThan6 = takeWhile(toList(numbers), new Predicate<Integer>() {
            @Override
            public boolean apply(Integer n) {
                return n < 6;
            }
        });

        Log.d("First numbers less than 6:");
        for (Integer n : firstNumbersLessThan6){
            Log.d(n);
        }
    }

    public void linq25() {
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Integer> firstSmallNumbers = takeWhilei(toList(numbers), new PredicateIndex<Integer>() {
            @Override
            public boolean apply(Integer n, int index) {
                return n >= index;
            }
        });

        Log.d("First numbers not less than their position:");
        for (Integer n : firstSmallNumbers){
            Log.d(n);
        }
    }

    public void linq26() {
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Integer> allButFirst3Numbers = skipWhile(toList(numbers), new Predicate<Integer>() {
            @Override
            public boolean apply(Integer n) {
                return n % 3 != 0;
            }
        });

        Log.d("All elements starting from first element divisible by 3:");
        for (Integer n : allButFirst3Numbers){
            Log.d(n);
        }
    }

    public void linq27() {
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Integer> laterNumbers = skipWhilei(toList(numbers), new PredicateIndex<Integer>() {
            @Override
            public boolean apply(Integer n, int index) {
                return n >= index;
            }
        });

        Log.d("All elements starting from first element less than its position:");
        for (Integer n : laterNumbers){
            Log.d(n);
        }
    }
}
