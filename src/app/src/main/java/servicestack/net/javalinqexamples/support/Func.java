package servicestack.net.javalinqexamples.support;

import com.android.internal.util.Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

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

    public static interface Predicate2<T1,T2> {
        public boolean apply(T1 a, T2 b);
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

    @SafeVarargs
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

    public static <T> T[] toArray(Iterable<T> xs, Class<T> cls) { return toArray(toList(xs), cls);}

    @SuppressWarnings("unchecked")
    public static <T> T[] toArray(List<T> list, Class<T> cls) {
        T[] array = (T[])Array.newInstance(cls, list.size());
        return list.toArray(array);
    }

    public static <K,V> HashMap<K,V> toDictionary(K k1, V v1) {
        HashMap<K,V> to = new HashMap<>();
        to.put(k1, v1);
        return to;
    }

    public static <K,V> HashMap<K,V> toDictionary(K k1, V v1, K k2, V v2) {
        HashMap<K,V> to = new HashMap<>();
        to.put(k1, v1);
        to.put(k2, v2);
        return to;
    }

    public static <K,V> HashMap<K,V> toDictionary(K k1, V v1, K k2, V v2, K k3, V v3) {
        HashMap<K,V> to = new HashMap<>();
        to.put(k1, v1);
        to.put(k2, v2);
        to.put(k3, v3);
        return to;
    }

    public static <K,V> HashMap<K,V> toDictionary(Tuple<K,V>... xs) {
        HashMap<K,V> to = new HashMap<>();
        for (Tuple<K,V> x : xs){
            to.put(x.A, x.B);
        }
        return to;
    }

    public static <K, T> HashMap<K,T> toDictionary(Iterable<T> xs, Function<T,K> f) {
        HashMap<K,T> to = new HashMap<>();
        for (T x : xs){
            K key = f.apply(x);
            to.put(key, x);
        }
        return to;
    }

    public static <T> ArrayList<T> ofType(Iterable xs, Class<T> cls){
        ArrayList<T> to = new ArrayList<T>();
        for (Object x : xs){
            if (cls.isInstance(x))
                to.add((T)x);
        }
        return to;
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

    public static <T> T first(Iterable<T> xs) { return first(xs, (T) null); }

    public static <T> T first(Iterable<T> xs, T defaultValue){
        if (xs == null)
            return defaultValue;

        for (T x : xs) {
            return x;
        }
        return defaultValue;
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

    @SafeVarargs
    public static <T> ArrayList<T> orderByAll(T[] xs, Comparator<T>... comparers){ return orderByAll(toList(xs), comparers); }

    @SafeVarargs
    public static <T> ArrayList<T> orderByAll(Iterable<T> xs, Comparator<T>... comparers){ return orderByAll(toList(xs), comparers); }

    @SafeVarargs
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

    public static <Key,Item> ArrayList<Group<Key,Item>> groupBy(
            Iterable<Item> xs,
            Function<Item, Key> f)
    {
        return groupBy(xs, f, null, null);
    }

    public static <Key,Item> ArrayList<Group<Key,Item>> groupBy(
            Iterable<Item> xs,
            Function<Item, Key> f,
            Predicate2<Key,Key> matchWith            )
    {
        return groupBy(xs, f, matchWith, null);
    }

    public static <Key,Item> ArrayList<Group<Key,Item>> groupBy(
        Iterable<Item> xs,
        Function<Item, Key> f,
        Predicate2<Key,Key> matchWith,
        Function<Item,Item> valueAs)
    {
        ArrayList<Item> to = new ArrayList<>();

        Map<Key, Group<Key,Item>> map = new HashMap<>();

        for (Item x : xs){
            Item e = x;
            Key val = f.apply(e);
            Key key = val;

            if (matchWith != null) {
                for (Key k : map.keySet()){
                    if (matchWith.apply(val, k)) {
                        key = k;
                        break;
                    }
                }
            }

            if (valueAs != null) {
                e = valueAs.apply(e);
            }

            Group<Key,Item> group;
            if (!map.containsKey(key)){
                map.put(key, group = new Group<Key, Item>(key));
            } else {
                group = map.get(key);
            }

            group.add(e);
        }

        return toList(map.values());
    }

    public static <T> ArrayList<T> distinct(T[] xs){ return distinct(toList(xs)); }

    public static <T> ArrayList<T> distinct(Iterable<T> xs){
        HashSet<T> to = new HashSet<T>();
        for (T x : xs){
            to.add(x);
        }
        return toList(to);
    }

    @SafeVarargs
    public static <T> ArrayList<T> union(T[]... xss){
        ArrayList<T> to = new ArrayList<T>();
        for (T[] xs : xss){
            for (T x : xs){
                if (!to.contains(x))
                    to.add(x);
            }
        }
        return to;
    }

    @SafeVarargs
    public static <T> ArrayList<T> union(Iterable<T>... xss){
        ArrayList<T> to = new ArrayList<T>();
        for (Iterable<T> xs : xss){
            for (T x : xs){
                if (!to.contains(x))
                    to.add(x);
            }
        }
        return to;
    }

    @SafeVarargs
    public static <T> ArrayList<T> concat(T[]... xss){
        ArrayList<T> to = new ArrayList<T>();
        for (T[] xs : xss){
            for (T x : xs){
                to.add(x);
            }
        }
        return to;
    }

    @SafeVarargs
    public static <T> ArrayList<T> concat(Iterable<T>... xss){
        ArrayList<T> to = new ArrayList<T>();
        for (Iterable<T> xs : xss){
            for (T x : xs){
                to.add(x);
            }
        }
        return to;
    }

    @SafeVarargs
    public static <T> ArrayList<T> intersect(T[]... xss){ return intersect(expand(xss));}

    @SafeVarargs
    public static <T> ArrayList<T> intersect(Iterable<T>... xss){
        ArrayList<T> first = null;
        for (Iterable<T> xs : xss) {
            if (first == null) {
                first = union(xs);
                continue;
            }
            retainOnly(first, toList(xs));
        }
        return first;
    }

    public static <T> void retainOnly(List<T> source, List<T> occurrances){
        for (int i = source.size() - 1; i >= 0; i--) {
            if (!occurrances.contains(source.get(i))){
                source.remove(i);
            }
        }
    }

    @SafeVarargs
    public static <T> ArrayList<T> difference(T[] original, T[]... xss){ return difference(toList(original), expand(xss)); }

    @SafeVarargs
    public static <T> ArrayList<T> difference(Iterable<T> source, Iterable<T>... xss){ return difference(toList(source), expand(xss)); }

    @SafeVarargs
    public static <T> ArrayList<T> difference(List<T> source, List<T>... xss){
        ArrayList<T> to = new ArrayList<T>();
        for (List<T> xs : xss){
            for (T x : source){
                if (!xs.contains(x) && !to.contains(x)){
                    to.add(x);
                }
            }
        }
        return to;
    }

    public static int[] range(int begin, int end){
        if (end >= begin) {
            int[] to = new int[++end - begin];
            for (int i=0; begin < end; ){
                to[i++] = begin++;
            }
            return to;
        } else {
            int[] to = new int[++begin - end];
            for (int i=0; end < begin; ){
                to[i++] = end++;
            }
            return to;
        }
    }

    public static int[] repeat(int repeatedValue, int count){
        int[] to = new int[count];
        for (int i = 0; i < count; i++) {
            to[i] = repeatedValue;
        }
        return to;
    }


    public static <T> int count(T[] xs, Predicate<T> predicate){ return count(toList(xs), predicate); }

    public static <T> int count(Iterable<T> xs, Predicate<T> predicate){
        if (xs == null) return 0;

        int count = 0;
        for (T x : xs) {
            if (predicate.apply(x)){
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] xs){ return sum(toList(xs), (Predicate<Integer>) null); }

    public static int sum(int[] xs, Predicate<Integer> predicate){ return sum(toList(xs), predicate); }

    public static Integer sum(Iterable<Integer> xs){ return sum(xs, (Predicate<Integer>)null); }

    public static Integer sum(Iterable<Integer> xs, Predicate<Integer> predicate){
        if (xs == null) return 0;

        int sum = 0;
        for (Integer x : xs) {
            if (predicate == null || predicate.apply(x)){
                sum += x;
            }
        }
        return sum;
    }

    public static <T> Integer sum(T[] xs, Function<T,Integer> f){ return sum(toList(xs), f); }

    public static <T> Integer sum(Iterable<T> xs, Function<T,Integer> f){
        if (xs == null) return 0;

        int sum = 0;
        for (T x : xs) {
            sum += f.apply(x);
        }
        return sum;
    }

    public static double sumDouble(double[] xs){ return sumDouble(toList(xs), (Predicate<Double>) null); }

    public static double sumDouble(double[] xs, Predicate<Double> predicate){ return sumDouble(toList(xs), predicate); }

    public static Double sumDouble(Iterable<Double> xs){ return sumDouble(xs, (Predicate<Double>) null); }

    public static Double sumDouble(Iterable<Double> xs, Predicate<Double> predicate){
        if (xs == null) return 0d;

        double sum = 0;
        for (Double x : xs) {
            if (predicate == null || predicate.apply(x)){
                sum += x;
            }
        }
        return sum;
    }

    public static <T> Double sumDouble(T[] xs, Function<T, Double> f){ return sumDouble(toList(xs), f); }

    public static <T> Double sumDouble(Iterable<T> xs, Function<T, Double> f){
        if (xs == null) return 0d;

        double sum = 0;
        for (T x : xs) {
            sum += f.apply(x);
        }
        return sum;
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

    public static int min(int[] xs){ return min(toList(xs), (Predicate<Integer>) null); }

    public static int min(int[] xs, Predicate<Integer> predicate){ return min(toList(xs), predicate); }

    public static Integer min(Iterable<Integer> xs){ return min(xs, (Predicate<Integer>) null); }

    public static Integer min(Iterable<Integer> xs, Predicate<Integer> predicate){
        if (xs == null) return null;

        Integer min = null;
        for (Integer x : xs) {
            if (predicate == null || predicate.apply(x)){
                if (min == null || x < min)
                    min = x;
            }
        }
        return min;
    }

    public static <T> Integer min(T[] xs, Function<T,Integer> f){ return min(toList(xs), f); }

    public static <T> Integer min(Iterable<T> xs, Function<T,Integer> f){
        if (xs == null) return null;

        Integer min = null;
        for (T t : xs) {
            Integer x = f.apply(t);
            if (min == null || x < min)
                min = x;
        }
        return min;
    }

    public static double minDouble(double[] xs){ return minDouble(toList(xs), (Predicate<Double>) null); }

    public static double minDouble(double[] xs, Predicate<Double> predicate){ return minDouble(toList(xs), predicate); }

    public static Double minDouble(Iterable<Double> xs){ return minDouble(xs, (Predicate<Double>) null); }

    public static Double minDouble(Iterable<Double> xs, Predicate<Double> predicate){
        if (xs == null) return null;

        Double min = null;
        for (Double x : xs) {
            if (predicate == null || predicate.apply(x)){
                if (min == null || x < min)
                    min = x;
            }
        }
        return min;
    }

    public static <T> Double minDouble(T[] xs, Function<T, Double> f){ return minDouble(toList(xs), f); }

    public static <T> Double minDouble(Iterable<T> xs, Function<T, Double> f){
        if (xs == null) return null;

        Double min = null;
        for (T t : xs) {
            Double x = f.apply(t);
            if (min == null || x < min)
                min = x;
        }
        return min;
    }

    public static int max(int[] xs){ return max(toList(xs), (Predicate<Integer>) null); }

    public static int max(int[] xs, Predicate<Integer> predicate){ return max(toList(xs), predicate); }

    public static Integer max(Iterable<Integer> xs){ return max(xs, (Predicate<Integer>) null); }

    public static Integer max(Iterable<Integer> xs, Predicate<Integer> predicate){
        if (xs == null) return null;

        Integer max = null;
        for (Integer x : xs) {
            if (predicate == null || predicate.apply(x)){
                if (max == null || x > max)
                    max = x;
            }
        }
        return max;
    }

    public static <T> Integer max(T[] xs, Function<T,Integer> f){ return max(toList(xs), f); }

    public static <T> Integer max(Iterable<T> xs, Function<T,Integer> f){
        if (xs == null) return null;

        Integer max = null;
        for (T t : xs) {
            Integer x = f.apply(t);
            if (max == null || x > max)
                max = x;
        }
        return max;
    }

    public static double maxDouble(double[] xs){ return maxDouble(toList(xs), (Predicate<Double>) null); }

    public static double maxDouble(double[] xs, Predicate<Double> predicate){ return maxDouble(toList(xs), predicate); }

    public static Double maxDouble(Iterable<Double> xs){ return maxDouble(xs, (Predicate<Double>) null); }

    public static Double maxDouble(Iterable<Double> xs, Predicate<Double> predicate){
        if (xs == null) return null;

        Double max = null;
        for (Double x : xs) {
            if (predicate == null || predicate.apply(x)){
                if (max == null || x > max)
                    max = x;
            }
        }
        return max;
    }

    public static <T> Double maxDouble(T[] xs, Function<T, Double> f){ return maxDouble(toList(xs), f); }

    public static <T> Double maxDouble(Iterable<T> xs, Function<T, Double> f){
        if (xs == null) return null;

        Double max = null;
        for (T t : xs) {
            Double x = f.apply(t);
            if (max == null || x > max)
                max = x;
        }
        return max;
    }

    public static double avg(int[] xs){ return avg(toList(xs), (Predicate<Integer>) null); }

    public static double avg(int[] xs, Predicate<Integer> predicate){ return avg(toList(xs), predicate); }

    public static Double avg(Iterable<Integer> xs){ return avg(xs, (Predicate<Integer>) null); }

    public static Double avg(Iterable<Integer> xs, Predicate<Integer> predicate){ return avg(toList(xs), predicate); }

    public static Double avg(List<Integer> xs, Predicate<Integer> predicate){
        return sum(xs, predicate) / (double) xs.size();
    }

    public static <T> Double avg(T[] xs, Function<T,Integer> f){ return avg(toList(xs), f); }

    public static <T> Double avg(Iterable<T> xs, Function<T,Integer> f){ return avg(toList(xs), f); }

    public static <T> Double avg(List<T> xs, Function<T,Integer> f){
        return sum(xs, f) / (double) xs.size();
    }

    public static double avgDouble(double[] xs){ return avgDouble(toList(xs), (Predicate<Double>) null); }

    public static double avgDouble(double[] xs, Predicate<Double> predicate){ return avgDouble(toList(xs), predicate); }

    public static Double avgDouble(Iterable<Double> xs){ return avgDouble(xs, (Predicate<Double>) null); }

    public static Double avgDouble(Iterable<Double> xs, Predicate<Double> predicate){ return avgDouble(toList(xs), predicate); }

    public static Double avgDouble(List<Double> xs, Predicate<Double> predicate){
        return sumDouble(xs, predicate) / (double) xs.size();
    }

    public static <T> Double avgDouble(T[] xs, Function<T, Double> f){ return avgDouble(toList(xs), f); }

    public static <T> Double avgDouble(Iterable<T> xs, Function<T, Double> f){ return avgDouble(toList(xs), f); }

    public static <T> Double avgDouble(List<T> xs, Function<T, Double> f){
        return sumDouble(xs, f) / (double) xs.size();
    }

}
