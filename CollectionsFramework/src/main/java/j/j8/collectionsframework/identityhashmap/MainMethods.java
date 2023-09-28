package j.j8.collectionsframework.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class MainMethods {
    public static void main(String[] args) {
        // Create an IdentityHashMap
        Map<String, Integer> identityMap = new IdentityHashMap<>();

        // Put key-value pairs
        identityMap.put("one", 1);
        identityMap.put("two", 2);
        identityMap.put("three", 3);

        // Display the map
        System.out.println("IdentityHashMap: " + identityMap);

        // Size of the map
        System.out.println("Size of the map: " + identityMap.size());

        // Check if a key exists
        System.out.println("Contains key 'two': " + identityMap.containsKey("two"));

        // Check if a value exists
        System.out.println("Contains value 3: " + identityMap.containsValue(3));

        // Get a value by key
        int value = identityMap.get("one");
        System.out.println("Value for 'one': " + value);

        // Remove a key-value pair
        identityMap.remove("two");
        System.out.println("IdentityHashMap after removing 'two': " + identityMap);

        // Iterate over keys
        System.out.print("Keys: ");
        for (String key : identityMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // Iterate over values
        System.out.print("Values: ");
        for (int val : identityMap.values()) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Iterate over entries (key-value pairs)
        System.out.println("Entries (key-value pairs):");
        for (Map.Entry<String, Integer> entry : identityMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Clear the map
        identityMap.clear();
        System.out.println("IdentityHashMap after clearing: " + identityMap);
    }
}
