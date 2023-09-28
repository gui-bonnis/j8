package j.j8.collectionsframework.identityhashmap;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

public class Immutable {
    public static void main(String[] args) {
        // Create a mutable IdentityHashMap
        IdentityHashMap<String, Integer> mutableMap = new IdentityHashMap<>();
        mutableMap.put("one", 1);
        mutableMap.put("two", 2);

        // Create an immutable view of the IdentityHashMap
        Map<String, Integer> immutableMap = Collections.unmodifiableMap(mutableMap);

        // Attempt to modify the immutable map will result in UnsupportedOperationException
        // immutableMap.put("three", 3); // This line will throw UnsupportedOperationException

        // Accessing the values is allowed
        System.out.println(immutableMap.get("one")); // Output: 1
    }
}

