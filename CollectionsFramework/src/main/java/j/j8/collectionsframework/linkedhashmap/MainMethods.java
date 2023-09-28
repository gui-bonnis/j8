package j.j8.collectionsframework.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMethods {
    public static void main(String[] args) {
        // Instantiate a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Put entries into the map
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 28);

        // Print the initial map
        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

        // Get the size of the map
        System.out.println("Size of the LinkedHashMap: " + linkedHashMap.size());

        // Access values by key
        System.out.println("Value for key 'Alice': " + linkedHashMap.get("Alice"));

        // Remove an entry
        linkedHashMap.remove("Bob");
        System.out.println("After removing 'Bob': " + linkedHashMap);

        // Check if a key exists
        boolean containsKey = linkedHashMap.containsKey("Charlie");
        System.out.println("Contains 'Charlie': " + containsKey);

        // Iterate through the map
        System.out.println("Iterating through the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear the map
        linkedHashMap.clear();
        System.out.println("After clearing the LinkedHashMap: " + linkedHashMap);

        // Re-populate the map
        linkedHashMap.put("David", 35);
        linkedHashMap.put("Eve", 22);
        linkedHashMap.put("Frank", 40);

        // Get the keys and values as sets
        System.out.println("Keys as set: " + linkedHashMap.keySet());
        System.out.println("Values as collection: " + linkedHashMap.values());

        // Get a default value for a non-existing key
        Integer defaultValue = linkedHashMap.getOrDefault("Grace", 0);
        System.out.println("Default value for 'Grace': " + defaultValue);

        // Replace a value for an existing key
        linkedHashMap.replace("David", 36);
        System.out.println("After replacing 'David': " + linkedHashMap);

        // Replace a value only if the key is associated with a specific value
        boolean replaced = linkedHashMap.replace("Eve", 22, 23);
        System.out.println("After conditional replace on 'Eve': " + linkedHashMap);
        System.out.println("Replace successful: " + replaced);

        // Merge entries with a BiFunction
        linkedHashMap.merge("Frank", 1, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("After merging 'Frank': " + linkedHashMap);
    }
}
