package servicestack.net.javalinqexamples.support;

import com.android.internal.util.Predicate;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mythz on 7/26/2015.
 */
public class Func {
    public static interface Each<T> {
        public void apply(T t);
    }

    public static interface Function<T,R> {
        public R apply(T t);
    }

    public static interface Reducer<T,E> {
        public E reduce(E prev, T item);
    }

    public static <T,R> ArrayList<R> map(T[] xs, Function<T,R> f) { return map(toList(xs), f); }

    public static <T,R> ArrayList<R> map(Iterable<T> xs, Function<T,R> f) {
        ArrayList<R> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            R ret = f.apply(x);
            to.add(ret);
        }
        return to;
    }

    public static <T> void each(T[] xs, Each<T> f) { each(toList(xs), f); }

    public static <T> void each(Iterable<T> xs, Each<T> f) {
        if (xs == null) return;
        for (T x : xs) {
            f.apply(x);
        }
    }

    public static ArrayList<Integer> toList(int... xs){
        ArrayList<Integer> to = new ArrayList<>();
        for (int x : xs) {
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> toList(T... xs){
        ArrayList<T> to = new ArrayList<>();
        for (T x : xs) {
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> toList(Iterable<T> xs){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> filter(T[] xs, Predicate<T> predicate){ return filter(toList(xs), predicate); }

    public static <T> ArrayList<T> filter(Iterable<T> xs, Predicate<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            if (predicate.apply(x)){
                to.add(x);
            }
        }
        return to;
    }

    public static <T> T first(T[] xs, Predicate<T> predicate){ return first(toList(xs), predicate); }

    public static <T> T first(Iterable<T> xs, Predicate<T> predicate){
        if (xs == null) return null;

        for (T x : xs) {
            if (predicate.apply(x)){
                return x;
            }
        }
        return null;
    }

    public static <T> T first(T[] xs) { return xs == null || xs.length == 0 ? null : xs[0]; }

    public static <T> T first(Iterable<T> xs){
        if (xs == null) return null;

        for (T x : xs) {
            return x;
        }
        return null;
    }

    public static <T> T last(T[] xs, Predicate<T> predicate){
        return last(toList(xs), predicate);
    }

    public static <T> T last(Iterable<T> xs, Predicate<T> predicate){
        if (xs == null) return null;

        for (T x : reverse(xs)) {
            if (predicate.apply(x)){
                return x;
            }
        }
        return null;
    }

    public static <T> T last(T[] xs) {
        return xs == null ? null : xs[xs.length - 1];
    }

    public static <T> T last(Iterable<T> xs){
        if (xs == null) return null;

        T last = null;
        for (T x : xs) {
            last = x;
        }
        return last;
    }

    public static <T> boolean contains(T[] xs, Predicate<T> predicate){ return contains(toList(xs), predicate); }

    public static <T> boolean contains(Iterable<T> xs, Predicate<T> predicate){
        return first(xs, predicate) != null;
    }

    public static <T> ArrayList<T> skip(T[] xs, int skip){ return skip(toList(xs), skip); }

    public static <T> ArrayList<T> skip(Iterable<T> xs, int skip){
        int i = 0;
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            if (i++ >= skip){
                to.add(x);
            }
        }
        return to;
    }

    public static <T> ArrayList<T> skip(T[] xs, Predicate<T> predicate){ return skip(toList(xs), predicate); }

    public static <T> ArrayList<T> skip(Iterable<T> xs, Predicate<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            if (predicate.apply(x)){
                to.add(x);
            }
        }
        return to;
    }

    public static <T> ArrayList<T> take(T[] xs, Predicate<T> predicate){ return take(toList(xs), predicate);}

    public static <T> ArrayList<T> take(Iterable<T> xs, Predicate<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            if (predicate.apply(x)){
                return to;
            }
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> take(T[] xs, int take){ return take(toList(xs), take); }

    public static <T> ArrayList<T> take(Iterable<T> xs, int take){
        int i = 0;
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            if (i++ >= take){
                return to;
            }
            to.add(x);
        }
        return to;
    }

    public static <T> boolean any(T[] xs, Predicate<T> predicate){ return any(toList(xs), predicate); }

    public static <T> boolean any(Iterable<T> xs, Predicate<T> predicate){
        if (xs == null) return false;

        for (T x : xs) {
            if (predicate.apply(x)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean all(T[] xs, Predicate<T> predicate){ return all(toList(xs), predicate); }

    public static <T> boolean all(Iterable<T> xs, Predicate<T> predicate){
        if (xs == null) return false;

        for (T x : xs) {
            if (!predicate.apply(x)){
                return false;
            }
        }
        return true;
    }

    public static <T> ArrayList<T> expand(T[]... xss){
        ArrayList<T> to = new ArrayList<>();
        if (xss == null) return to;

        for (T[] xs : xss) {
            for (T x : xs){
                to.add(x);
            }
        }
        return to;
    }

    public static <T> ArrayList<T> expand(Iterable<T>... xss){
        ArrayList<T> to = new ArrayList<>();
        if (xss == null) return to;

        for (Iterable<T> xs : xss) {
            for (T x : xs){
                to.add(x);
            }
        }
        return to;
    }

    public static <T> T elementAt(T[] xs, int index){ return elementAt(toList(xs), index); }

    public static <T> T elementAt(Iterable<T> xs, int index){
        if (xs == null) return null;

        int i = 0;
        for (T x : xs){
            if (i++ == index){
                return x;
            }
        }
        return null;
    }

    public static <T> ArrayList<T> reverse(T[] xs){ return reverse(toList(xs)); }

    public static <T> ArrayList<T> reverse(Iterable<T> xs){
        if (xs == null) return new ArrayList<T>();

        ArrayList<T> clone = toList(xs);
        Collections.reverse(clone);
        return clone;
    }

    public static <T,E> E reduce(T[] xs, E initialValue, Reducer<T,E> reducer){ return reduce(toList(xs), initialValue, reducer); }

    public static <T,E> E reduce(Iterable<T> xs, E initialValue, Reducer<T,E> reducer){
        if (xs == null) return initialValue;

        E currentValue = initialValue;
        for (T x : xs){
            currentValue = reducer.reduce(currentValue, x);
        }
        return currentValue;
    }

    public static <T,E> E reduceRight(T[] xs, E initialValue, Reducer<T,E> reducer){ return reduceRight(toList(xs), initialValue, reducer); }

    public static <T,E> E reduceRight(Iterable<T> xs, E initialValue, Reducer<T,E> reducer){
        return reduce(reverse(xs), initialValue, reducer);
    }

    public static <T> String join(T[] xs, String separator){ return join(toList(xs), separator); }

    public static <T> String join(Iterable<T> xs, String separator){
        StringBuilder sb = new StringBuilder();
        if (xs == null) return sb.toString();

        for (T x : xs){
            if (sb.length() > 0)
                sb.append(separator);
            sb.append(x);
        }
        return sb.toString();
    }
}
