package servicestack.net.javalinqexamples.support;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mythz on 7/27/2015.
 */
public class Group<Key,Element> implements Iterable<Element> {
    public Key key;
    public ArrayList<Element> items;

    public Group(Key key) {
        this(key, null);
    }

    public Group(Key key, ArrayList<Element> items) {
        this.key = key;
        this.items = items;
        if (this.items == null)
            this.items = new ArrayList<Element>();
    }

    public void add(Element e){
        items.add(e);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group<?, ?> group = (Group<?, ?>) o;

        if (key != null ? !key.equals(group.key) : group.key != null) return false;
        return !(items != null ? !items.equals(group.items) : group.items != null);

    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }

    @Override
    public Iterator<Element> iterator() {
        return items.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(key).append(":\n");
        for (Element e : items){
            sb.append(e).append("\n");
        }

        return sb.toString();
    }
}
