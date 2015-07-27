package servicestack.net.javalinqexamples.support;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mythz on 7/27/2015.
 */
public class Group<Key,Element> implements Iterable<Element> {
    public Key Key;
    public ArrayList<Element> Items;

    public Group(Key key) {
        this(key, null);
    }

    public Group(Key key, ArrayList<Element> items) {
        Key = key;
        Items = items;
        if (Items == null)
            Items = new ArrayList<Element>();
    }

    public void add(Element e){
        Items.add(e);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group<?, ?> group = (Group<?, ?>) o;

        if (Key != null ? !Key.equals(group.Key) : group.Key != null) return false;
        return !(Items != null ? !Items.equals(group.Items) : group.Items != null);

    }

    @Override
    public int hashCode() {
        int result = Key != null ? Key.hashCode() : 0;
        result = 31 * result + (Items != null ? Items.hashCode() : 0);
        return result;
    }

    @Override
    public Iterator<Element> iterator() {
        return Items.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(Key).append(":\n");
        for (Element e : Items){
            sb.append(e).append("\n");
        }

        return sb.toString();
    }
}
