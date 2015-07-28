package servicestack.net.javalinqexamples;

import static net.servicestack.func.Func.*;
import static servicestack.net.javalinqexamples.support.Data.getCustomerList;
import static servicestack.net.javalinqexamples.support.Data.getProductList;

import net.servicestack.client.Log;
import net.servicestack.func.Function;
import net.servicestack.func.Group;
import net.servicestack.func.Predicate;
import net.servicestack.func.Reducer;
import net.servicestack.func.Tuple;

import java.util.ArrayList;
import java.util.List;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Product;

/**
 * Created by mythz on 7/26/2015.
 */
public class AggregateOperators {

    public void linq73(){
        int[] factorsOf300 = new int[] { 2, 2, 3, 5, 5 };

        int uniqueFactors = distinct(toList(factorsOf300)).size();

        Log.d("There are " + uniqueFactors + " unique factors of 300.");
    }

    public void linq74(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        int oddNumbers = count(toList(numbers), new Predicate<Integer>() {
            @Override
            public boolean apply(Integer n) {
                return n % 2 == 1;
            }
        });

        Log.d("There are " + oddNumbers + " odd numbers in the list.");
    }

    public void linq76(){
        List<Customer> customers = getCustomerList();

        List<Tuple<String, Integer>> orderCounts =
            map(customers, new Function<Customer, Tuple<String, Integer>>() {
                @Override
                public Tuple<String, Integer> apply(Customer c) {
                    return new Tuple<>(c.customerId, c.orders.size());
                }
            });

        for (Tuple<?,?> t : orderCounts){
            Log.d(t);
        }
    }

    public void linq77(){
        List<Product> products = getProductList();

        List<Tuple<String,Integer>> categoryCounts =
            map(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Function<Group<String, Product>, Tuple<String,Integer>>() {
                    @Override
                    public Tuple<String, Integer> apply(Group<String, Product> g) {
                        return new Tuple<>(g.key, g.items.size());
                    }
                }
            );

        for (Tuple<?,?> t : categoryCounts){
            Log.d(t);
        }
    }

    public void linq78(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        double numSum = sum(numbers);

        Log.d("The sum of the numbers is " + numSum);
    }

    public void linq79(){
        String[] words = new String[] { "cherry", "apple", "blueberry" };

        Integer totalChars = sum(toList(words), new Function<String, Integer>() {
            @Override
            public Integer apply(String w) {
                return w.length();
            }
        });

        Log.d("There are a total of " + totalChars + " characters in these words.");
    }

    public void linq80(){
        List<Product> products = getProductList();

        List<Tuple<String, Integer>> categories =
            map(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                })
                , new Function<Group<String,Product>, Tuple<String, Integer>>() {
                    @Override
                    public Tuple<String, Integer> apply(Group<String, Product> g) {
                        return new Tuple<>(g.key, sum(g, new Function<Product, Integer>() {
                            @Override
                            public Integer apply(Product p) {
                                return p.unitsInStock;
                            }
                        }));
                    }
                }
            );

        for (Tuple<?,?> t : categories){
            Log.d(t);
        }
    }

    public void linq81(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        int minNum = min(numbers);

        Log.d("The minimum number is " +  minNum);
    }

    public void linq82(){
        String[] words = new String[] { "cherry", "apple", "blueberry" };

        int shortestWord = min(words, new Function<String, Integer>() {
            @Override
            public Integer apply(String w) {
                return w.length();
            }
        });

        Log.d("The shortest word is " + shortestWord + " characters long.");
    }

    public void linq83(){
        List<Product> products = getProductList();

        List<Tuple<String,Double>> categories =
            map(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Function<Group<String, Product>, Tuple<String, Double>>() {
                    @Override
                    public Tuple<String, Double> apply(Group<String, Product> g) {
                        return new Tuple<>(g.key, minDouble(g, new Function<Product, Double>() {
                            @Override
                            public Double apply(Product p) {
                                return p.unitPrice;
                            }
                        }));
                    }
                }
            );

        for (Tuple<?,?> t : categories){
            Log.d(t);
        }
    }

    public void linq84(){
        List<Product> products = getProductList();

        List<Tuple<String,ArrayList<Product>>> categories =
            map(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Function<Group<String, Product>, Tuple<String, ArrayList<Product>>>() {
                    @Override
                    public Tuple<String, ArrayList<Product>> apply(Group<String, Product> g) {
                        final double minPrice = minDouble(g, new Function<Product, Double>() {
                            @Override
                            public Double apply(Product p) {
                                return p.unitPrice;
                            }
                        });
                        return new Tuple<>(
                            g.key,
                            filter(g.items, new Predicate<Product>() {
                                @Override
                                public boolean apply(Product p) {
                                    return p.unitPrice == minPrice;
                                }
                            })
                        );
                    }
                }
            );

        for (Tuple<String,ArrayList<Product>> t : categories){
            Log.d(t.A + ": ");
            Log.d(t.B);
        }
    }

    public void linq85(){
        int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        int maxNum = max(numbers);

        Log.d("The maximum number is " + maxNum);
    }

    public void linq86(){
        String[] words = new String[] { "cherry", "apple", "blueberry" };

        int longestLength = max(words, new Function<String, Integer>() {
            @Override
            public Integer apply(String w) {
                return w.length();
            }
        });

        Log.d("The longest word is " + longestLength + " characters long.");
    }

    public void linq87(){
        List<Product> products = getProductList();

        ArrayList<Tuple<String, Double>> categories =
            map(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Function<Group<String, Product>, Tuple<String, Double>>() {
                    @Override
                    public Tuple<String, Double> apply(Group<String, Product> g) {
                        return new Tuple<>(
                            g.key,
                            maxDouble(g, new Function<Product, Double>() {
                                @Override
                                public Double apply(Product p) {
                                    return p.unitPrice;
                                }
                            })
                        );
                    }
                }
            );

        for (Tuple<?,?> t : categories){
            Log.d(t);
        }
    }

    public void linq88(){
        List<Product> products = getProductList();

        List<Tuple<String,ArrayList<Product>>> categories =
            map(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Function<Group<String, Product>, Tuple<String, ArrayList<Product>>>() {
                    @Override
                    public Tuple<String, ArrayList<Product>> apply(Group<String, Product> g) {
                        final double maxPrice = maxDouble(g, new Function<Product, Double>() {
                            @Override
                            public Double apply(Product p) {
                                return p.unitPrice;
                            }
                        });
                        return new Tuple<>(
                            g.key,
                            filter(g.items, new Predicate<Product>() {
                                @Override
                                public boolean apply(Product p) {
                                    return p.unitPrice == maxPrice;
                                }
                            })
                        );
                    }
                }
            );

        for (Tuple<String,ArrayList<Product>> t : categories){
            Log.d(t.A + ": ");
            Log.d(t.B);
        }
    }

    public void linq89(){
        int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        double averageNum = avg(numbers);

        Log.d("The average number is " + averageNum);
    }

    public void linq90(){
        String[] words = new String[] { "cherry", "apple", "blueberry" };

        double averageLength = avg(words, new Function<String, Integer>() {
            @Override
            public Integer apply(String w) {
                return w.length();
            }
        });

        Log.d("The average word length is " + averageLength + " characters.");
    }

    public void linq91(){
        List<Product> products = getProductList();

        ArrayList<Tuple<String, Double>> categories =
            map(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Function<Group<String, Product>, Tuple<String, Double>>() {
                    @Override
                    public Tuple<String, Double> apply(Group<String, Product> g) {
                        return new Tuple<>(
                            g.key,
                            avgDouble(g, new Function<Product, Double>() {
                                @Override
                                public Double apply(Product p) {
                                    return p.unitPrice;
                                }
                            })
                        );
                    }
                }
            );

        for (Tuple<?,?> t : categories){
            Log.d(t);
        }
    }

    public void linq92(){
        double[] doubles = new double[]  { 1.7, 2.3, 1.9, 4.1, 2.9 };

        double product = reduce(toList(doubles), 1d, new Reducer<Double, Double>() {
            @Override
            public Double reduce(Double runningProduct, Double nextFactor) {
                return runningProduct * nextFactor;
            }
        });

        Log.d("Total product of all numbers: " + product);
    }

    public void linq93(){
        double startBalance = 100.0;

        int[] attemptedWithdrawals = new int[] { 20, 10, 40, 50, 10, 70, 30 };

        double endBalance =
            reduce(
                toList(attemptedWithdrawals),
                startBalance,
                new Reducer<Integer, Double>() {
                    @Override
                    public Double reduce(Double balance, Integer nextWithdrawal) {
                        return (nextWithdrawal <= balance) ? (balance - nextWithdrawal) : balance;
                    }
                }
            );

        Log.d("Ending balance: " + endBalance);
    }
}
