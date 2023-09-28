package j.j8.collectionsframework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainMethods {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Put key-value pairs into the HashMap
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        // Get the size of the HashMap
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // Check if a key exists in the HashMap
        boolean containsKey = hashMap.containsKey("two");
        System.out.println("Contains key 'two': " + containsKey);

        // Get the value associated with a key
        Integer value = hashMap.get("three");
        System.out.println("Value for key 'three': " + value);

        // Remove a key-value pair
        hashMap.remove("one");
        System.out.println("After removing key 'one': " + hashMap);

        // Iterate over the keys and values in the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}
