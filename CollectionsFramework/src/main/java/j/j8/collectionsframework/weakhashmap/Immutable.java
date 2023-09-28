package j.j8.collectionsframework.weakhashmap;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class Immutable {
    public static void main(String[] args) {
        // Create a regular WeakHashMap
        WeakHashMap<String, Integer> mutableMap = new WeakHashMap<>();
        mutableMap.put("one", 1);
        mutableMap.put("two", 2);

        // Create an immutable view of the WeakHashMap
        Map<String, Integer> immutableMap = Collections.unmodifiableMap(mutableMap);

        // Attempt to modify the immutable map (will result in an UnsupportedOperationException)
        try {
            immutableMap.put("three", 3); // This line will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify the immutable map.");
        }

        // Accessing values in the immutable map
        int value = immutableMap.get("two");
        System.out.println("Value associated with 'two': " + value);
    }
}