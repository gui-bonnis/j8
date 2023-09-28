package j.j8.collectionsframework.hashtable;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class Immutable {
    public static void main(String[] args) {
        // Create a mutable Hashtable
        Hashtable<Integer, String> mutableHashtable = new Hashtable<>();
        mutableHashtable.put(1, "One");
        mutableHashtable.put(2, "Two");
        mutableHashtable.put(3, "Three");

        // Create an immutable view of the Hashtable
        Map<Integer, String> immutableMap = Collections.unmodifiableMap(mutableHashtable);

        // Attempting to modify the immutable map will result in an UnsupportedOperationException
        // Uncommenting the line below will throw an exception:
        // immutableMap.put(4, "Four");

        // Reading from the immutable map is allowed
        String value1 = immutableMap.get(1);
        System.out.println("Value at key 1: " + value1);

        // Iterating through the immutable map
        for (Map.Entry<Integer, String> entry : immutableMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

