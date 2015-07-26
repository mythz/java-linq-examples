package servicestack.net.javalinqexamples;

import com.android.internal.util.Predicate;

import java.util.ArrayList;

import servicestack.net.javalinqexamples.support.Log;
import servicestack.net.javalinqexamples.support.Product;

import static servicestack.net.javalinqexamples.support.Data.getProductsList;
import static servicestack.net.javalinqexamples.support.Func.filter;
import static servicestack.net.javalinqexamples.support.Func.toList;

/**
 * Created by mythz on 7/26/2015.
 */
public class Restrictions {

    public void linq1(){
        int[] numbers = new int[]{ 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

        ArrayList<Integer> lowNums = filter(toList(numbers), new Predicate<Integer>() {
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
        ArrayList<Product> products = getProductsList();

        ArrayList<Product> soldOutProducts = filter(products, new Predicate<Product>() {
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
        ArrayList<Product> products = getProductsList();

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

    }
}
