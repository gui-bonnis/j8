package j.j8.collectionsframework.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainMethods {
    public static void main(String[] args) {
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Adding elements to the map
        concurrentMap.put("Alice", 25);
        concurrentMap.put("Bob", 30);
        concurrentMap.put("Charlie", 35);

        // Getting values
        System.out.println("Value for Alice: " + concurrentMap.get("Alice"));
        System.out.println("Value for Bob: " + concurrentMap.get("Bob"));

        // Checking if a key exists
        System.out.println("Contains key 'David': " + concurrentMap.containsKey("David"));

        // Checking if a value exists
        System.out.println("Contains value 30: " + concurrentMap.containsValue(30));

        // Removing an entry
        concurrentMap.remove("Charlie");

        // Iterating over the map
        System.out.println("Iterating over the map:");
        for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using compute to update a value atomically
        concurrentMap.compute("Bob", (key, oldValue) -> oldValue + 1);

        // Using computeIfAbsent to add a new value atomically
        concurrentMap.computeIfAbsent("David", key -> 40);

        // Using merge to combine values
        concurrentMap.merge("Alice", 5, (oldValue, newValue) -> oldValue + newValue);

        // Using size to get the number of elements in the map
        System.out.println("Size of the map: " + concurrentMap.size());

        // Clearing the map
        concurrentMap.clear();

        // Checking if the map is empty
        System.out.println("Is the map empty? " + concurrentMap.isEmpty());
    }
}
