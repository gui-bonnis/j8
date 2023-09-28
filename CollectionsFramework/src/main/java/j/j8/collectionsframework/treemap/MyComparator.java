package j.j8.collectionsframework.treemap;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        // Custom comparison logic for strings
        return o2.compareTo(o1); // Reverses the natural order
    }
}
