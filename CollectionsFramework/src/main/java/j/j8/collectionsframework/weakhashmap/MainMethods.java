package j.j8.collectionsframework.weakhashmap;

import java.util.WeakHashMap;

public class MainMethods {
    public static void main(String[] args) {
        // Create a WeakHashMap
        WeakHashMap<String, Integer> weakMap = new WeakHashMap<>();

        // Put key-value pairs into the map
        weakMap.put("one", 1);
        weakMap.put("two", 2);
        weakMap.put("three", 3);
        System.out.println("Initial WeakHashMap: " + weakMap);

        // Get the value associated with a key
        int value = weakMap.get("two");
        System.out.println("Value associated with 'two': " + value);

        // Check if a key exists in the map
        boolean containsKey = weakMap.containsKey("four");
        System.out.println("'four' is in the map: " + containsKey);

        // Remove a key-value pair from the map
        weakMap.remove("three");
        System.out.println("After removing 'three': " + weakMap);

        // Check the size of the map
        int size = weakMap.size();
        System.out.println("Size of the map: " + size);

        // Clear all key-value pairs from the map
        weakMap.clear();
        System.out.println("After clearing the map: " + weakMap);

        // Check if the map is empty
        boolean isEmpty = weakMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);
    }
}
