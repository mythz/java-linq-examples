package servicestack.net.javalinqexamples;

import static net.servicestack.func.Func.*;
import static servicestack.net.javalinqexamples.support.Data.dateFmt;
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
public class Restrictions {

    public void linq1(){
        int[] numbers = new int[]{ 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        List<Integer> lowNums = filter(toList(numbers), new Predicate<Integer>() {
            @Override
            public boolean apply(Integer n) {
                return n < 5;
            }
        });

        Log.d("Numbers < 5:");
        for (int n : lowNums){
            Log.d(n);
        }
    }

    public void linq2(){
        List<Product> products = getProductList();

        List<Product> soldOutProducts = filter(products, new Predicate<Product>() {
            @Override
            public boolean apply(Product p) {
                return p.unitsInStock == 0;
            }
        });

        Log.d("Sold out products:");
        for (Product p : soldOutProducts) {
            Log.d(p.productName + " is sold out!");
        }
    }

    public void linq3(){
        List<Product> products = getProductList();

        ArrayList<Product> expensiveInStockProducts = filter(products, new Predicate<Product>() {
            @Override
            public boolean apply(Product p) {
                return p.unitsInStock > 0 && p.unitPrice > 3.00;
            }
        });

        Log.d("In-stock products that cost more than 3.00:");
        for (Product p : expensiveInStockProducts) {
            Log.d(p.productName + " is in stock and costs more than 3.00.");
        }
    }

    public void linq4(){
        List<Customer> customers = getCustomerList();

        List<Customer> waCustomers = filter(customers, new Predicate<Customer>() {
            @Override
            public boolean apply(Customer c) {
                return "WA".equals(c.region);
            }
        });

        Log.d("Customers from Washington and their orders:");
        for (Customer c : waCustomers){
            Log.d("Customer " + c.customerId + " " + c.companyName);
            for (Order o : c.orders){
                Log.d("  Order " + o.orderId + ": " + dateFmt(o.orderDate));
            }
        }
    }

    public void linq5(){
        String[] digits = new String[]{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        List<String> shortDigits = filteri(digits, new PredicateIndex<String>() {
            @Override
            public boolean apply(String s, int i) {
                return s.length() < i;
            }
        });

        Log.d("Short digits:");
        for (String d : shortDigits){
            Log.d("The word " + d + " is shorter than its value.");
        }
    }
}
