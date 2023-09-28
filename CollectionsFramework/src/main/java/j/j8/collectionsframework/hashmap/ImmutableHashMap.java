package j.j8.collectionsframework.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableHashMap {
    public static void main(String[] args) {
        // Create a regular mutable HashMap
        HashMap<String, Integer> mutableMap = new HashMap<>();
        mutableMap.put("one", 1);
        mutableMap.put("two", 2);

        // Make the mutable map immutable
        Map<String, Integer> immutableMap = Collections.unmodifiableMap(mutableMap);

        // Attempting to modify the immutable map will result in an UnsupportedOperationException
        // immutableMap.put("three", 3); // This line would throw an exception

        // You can still read from the immutable map
        Integer value = immutableMap.get("one");
        System.out.println("Value for key 'one': " + value);

        // Iterating over the keys and values in the immutable map
        for (Map.Entry<String, Integer> entry : immutableMap.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}
