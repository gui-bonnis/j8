package j.j8.collectionsframework.treemap;

import java.util.TreeMap;

public class MainMethods {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Insert elements into the TreeMap using put(key, value)
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        // Print the TreeMap (Note: It will be sorted by keys)
        System.out.println("TreeMap: " + treeMap);

        // Retrieve a value by key using get(key)
        String value = treeMap.get(2);
        System.out.println("Value associated with key 2: " + value);

        // Check if a key exists in the TreeMap using containsKey(key)
        boolean keyExists = treeMap.containsKey(5);
        System.out.println("Does key 5 exist in the TreeMap? " + keyExists);

        // Remove an entry by key using remove(key)
        treeMap.remove(1);
        System.out.println("After removing key 1: " + treeMap);

        // Get the number of entries in the TreeMap using size()
        int size = treeMap.size();
        System.out.println("Number of entries in the TreeMap: " + size);

        // Clear all entries from the TreeMap using clear()
        treeMap.clear();
        System.out.println("After clearing the TreeMap: " + treeMap);
    }
}
