package servicestack.net.javalinqexamples.support;

import com.android.internal.util.Predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

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

    public static interface FunctionIndex<T,R> {
        public R apply(T t, int i);
    }

    public static interface Reducer<T,E> {
        public E reduce(E prev, T item);
    }

    public static interface PredicateIndex<T> {

        boolean apply(T t, int i);
    }

    public static class Tuple<A,B> {
        public A A;
        public B B;
        public Tuple(A a, B b) {
            A = a;
            B = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tuple)) return false;
            Tuple<?, ?> tuple = (Tuple<?, ?>) o;
            if (A != null ? !A.equals(tuple.A) : tuple.A != null) return false;
            return !(B != null ? !B.equals(tuple.B) : tuple.B != null);
        }

        @Override
        public int hashCode() {
            int result = A != null ? A.hashCode() : 0;
            result = 31 * result + (B != null ? B.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "(" + A + ", " + B + ")";
        }
    }

    public static class Tuple3<A,B,C> {
        public A A;
        public B B;
        public C C;

        public Tuple3(A a, B b, C c) {
            A = a;
            B = b;
            C = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tuple3)) return false;
            Tuple3<?, ?, ?> tuple3 = (Tuple3<?, ?, ?>) o;
            if (A != null ? !A.equals(tuple3.A) : tuple3.A != null) return false;
            if (B != null ? !B.equals(tuple3.B) : tuple3.B != null) return false;
            return !(C != null ? !C.equals(tuple3.C) : tuple3.C != null);
        }

        @Override
        public int hashCode() {
            int result = A != null ? A.hashCode() : 0;
            result = 31 * result + (B != null ? B.hashCode() : 0);
            result = 31 * result + (C != null ? C.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "(" + A + ", " + B + ", " + C + ")";
        }
    }

    public static ArrayList<Integer> toList(int... xs){
        ArrayList<Integer> to = new ArrayList<>();
        for (int x : xs) {
            to.add(x);
        }
        return to;
    }

    public static ArrayList<Double> toList(double... xs){
        ArrayList<Double> to = new ArrayList<>();
        for (double x : xs) {
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

    //Skip cloning if possible
    public static <T> ArrayList<T> asList(Iterable<T> xs){
        return xs != null && ArrayList.class.isInstance(xs)
            ? (ArrayList<T>)xs
            : toList(xs);
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

    public static <T,R> ArrayList<R> mapi(T[] xs, FunctionIndex<T,R> f) { return mapi(toList(xs), f); }

    public static <T,R> ArrayList<R> mapi(Iterable<T> xs, FunctionIndex<T,R> f) {
        ArrayList<R> to = new ArrayList<>();
        if (xs == null) return to;

        int i = 0;
        for (T x : xs) {
            R ret = f.apply(x, i++);
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

    public static <T> ArrayList<T> filteri(T[] xs, PredicateIndex<T> predicate){ return filteri(toList(xs), predicate); }

    public static <T> ArrayList<T> filteri(Iterable<T> xs, PredicateIndex<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        int i = 0;
        for (T x : xs) {
            if (predicate.apply(x, i++)){
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

    public static <T> ArrayList<T> skipWhile(T[] xs, Predicate<T> predicate){ return skipWhile(toList(xs), predicate); }

    public static <T> ArrayList<T> skipWhile(Iterable<T> xs, Predicate<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        boolean started = false;
        for (T x : xs) {
            if (!started && predicate.apply(x)){
                continue;
            }

            started = true;
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> skipWhilei(Iterable<T> xs, PredicateIndex<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        int i = 0;
        boolean started = false;
        for (T x : xs) {
            if (!started && predicate.apply(x, i++)){
                continue;
            }

            started = true;
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> takeWhile(T[] xs, Predicate<T> predicate){ return takeWhile(toList(xs), predicate);}

    public static <T> ArrayList<T> takeWhile(Iterable<T> xs, Predicate<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        for (T x : xs) {
            if (!predicate.apply(x)){
                return to;
            }
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> takeWhilei(Iterable<T> xs, PredicateIndex<T> predicate){
        ArrayList<T> to = new ArrayList<>();
        if (xs == null) return to;

        int i = 0;
        for (T x : xs) {
            if (!predicate.apply(x, i++)){
                return to;
            }
            to.add(x);
        }
        return to;
    }

    public static <T> ArrayList<T> take(T[] xs, int take) {
        return take(toList(xs), take); }

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

    public static <T> ArrayList<T> expand(Iterable<List<T>> xss){
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

    //Already cloned
    private static <T> ArrayList<T> asReversed(ArrayList<T> xs){
        if (xs == null) return new ArrayList<T>();
        Collections.reverse(xs);
        return xs;
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

    public static <T extends Comparable<? super T>> ArrayList<T> orderBy(T[] xs){ return orderBy(toList(xs)); }

    public static <T extends Comparable<? super T>> ArrayList<T> orderBy(Iterable<T> xs){ return orderBy(toList(xs)); }

    private static <T extends Comparable<? super T>> ArrayList<T> orderBy(ArrayList<T> cloned){
        Collections.sort(cloned);
        return cloned;
    }

    public static <T, R extends Comparable<? super R>> ArrayList<T> orderBy(T[] xs, final Function<T, R> f){ return orderBy(toList(xs), f); }

    public static <T, R extends Comparable<? super R>> ArrayList<T> orderBy(Iterable<T> xs, final Function<T, R> f){ return orderBy(toList(xs), f); }

    private static <T, R extends Comparable<? super R>> ArrayList<T> orderBy(ArrayList<T> cloned, final Function<T,R> f){
        Collections.sort(cloned, new Comparator<T>() {
            @Override
            public int compare(T a, T b) {
                R aVal = f.apply(a);
                R bVal = f.apply(b);

                if (aVal == null && bVal == null)
                    return 0;
                if (aVal == null)
                    return -1;
                if (bVal == null)
                    return 1;

                return aVal.compareTo(bVal);
            }
        });

        return cloned;
    }

    public static <T> ArrayList<T> orderBy(T[] xs, Comparator<T> comparer){ return orderBy(toList(xs), comparer); }

    public static <T> ArrayList<T> orderBy(Iterable<T> xs, Comparator<T> comparer){ return orderBy(toList(xs), comparer); }

    private static <T> ArrayList<T> orderBy(ArrayList<T> cloned, Comparator<T> comparer){
        Collections.sort(cloned, comparer);
        return cloned;
    }

    public static <T, R extends Comparable<? super R>> ArrayList<T> orderByDesc(T[] xs, final Function<T, R> f){ return asReversed(orderBy(toList(xs), f)); }

    public static <T, R extends Comparable<? super R>> ArrayList<T> orderByDesc(Iterable<T> xs, final Function<T, R> f){ return asReversed(orderBy(toList(xs), f)); }

    public static <T extends Comparable<? super T>> List<T> orderByDesc(T[] xs){ return asReversed(orderBy(toList(xs))); }

    public static <T extends Comparable<? super T>> List<T> orderByDesc(Iterable<T> xs){ return asReversed(orderBy(toList(xs))); }

    public static <T> List<T> orderByDesc(T[] xs, Comparator<T> comparer){ return asReversed(orderBy(toList(xs), comparer)); }

    public static <T> List<T> orderByDesc(Iterable<T> xs, Comparator<T> comparer){ return asReversed(orderBy(toList(xs), comparer)); }


    public static <T> ArrayList<T> orderByAll(T[] xs, Comparator<T>... comparers){ return orderByAll(toList(xs), comparers); }

    public static <T> ArrayList<T> orderByAll(Iterable<T> xs, Comparator<T>... comparers){ return orderByAll(toList(xs), comparers); }

    private static <T> ArrayList<T> orderByAll(ArrayList<T> cloned, final Comparator<T>... comparers){
        Collections.sort(cloned, new Comparator<T>() {
            @Override
            public int compare(T a, T b) {
                for (Comparator<T> c : comparers){
                    int cmp = c.compare(a,b);
                    if (cmp != 0){
                        return cmp;
                    }
                }
                return 0;
            }
        });
        return cloned;
    }
}
