package j.j8.collectionsframework.treemap;

import java.util.TreeMap;

public class Initialization {
    public static void main(String[] args) {
        // Instantiate a TreeMap with a natural ordering of keys
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Instantiate a TreeMap with a custom comparator for ordering
        TreeMap<String, Integer> customTreeMap = new TreeMap<>(new MyComparator());
    }
}
