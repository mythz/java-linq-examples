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
import java.util.Map;

import servicestack.net.javalinqexamples.support.Customer;
import servicestack.net.javalinqexamples.support.Product;

/**
 * Created by mythz on 7/26/2015.
 */
public class Conversion {

    public void linq54(){
        double[] doubles = new double[] { 1.7, 2.3, 1.9, 4.1, 2.9 };

        List<Double> sortedDoubles = orderByDesc(toList(doubles));

        Double[] doublesArray = toArray(sortedDoubles, Double.class);

        Log.d("Every other double from highest to lowest:");
        for (int d = 0; d < doublesArray.length; d += 2){
            Log.d(doublesArray[d]);
        }
    }

    public void linq55(){
        String[] words = new String[] { "cherry", "apple", "blueberry" };

        List<String> sortedWords = orderBy(words);
        List<String> wordList = toList(sortedWords);

        Log.d("The sorted word list:");
        for (String w : wordList){
            Log.d(w);
        }
    }

    public void linq56(){
        List<Tuple<String,Integer>> scoreRecords = toList(
            new Tuple<>("Alice", 50),
            new Tuple<>("Bob", 40),
            new Tuple<>("Cathy", 45)
        );

        Map<String,Tuple<String,Integer>> scoreRecordsDict = toDictionary(scoreRecords, new Function<Tuple<String, Integer>, String>() {
            @Override
            public String apply(Tuple<String, Integer> t) {
                return t.A;
            }
        });

        Log.d("Bob's score: " + scoreRecordsDict.get("Bob"));
    }

    public void linq57(){
        Object[] numbers = new Object[] { null, 1.0, "two", 3, "four", 5, "six", 7.0 };

        List<Double> doubles = ofType(toList(numbers), Double.class);

        Log.d("Numbers stored as doubles:");
        for (Double d : doubles){
            Log.d(d);
        }
    }
}
