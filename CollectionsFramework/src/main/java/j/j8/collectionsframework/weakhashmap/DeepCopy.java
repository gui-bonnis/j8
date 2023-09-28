package j.j8.collectionsframework.weakhashmap;

import java.util.WeakHashMap;

public class DeepCopy {
    public static void main(String[] args) {
        // Create a WeakHashMap
        WeakHashMap<String, StringBuilder> originalMap = new WeakHashMap<>();

        // Add key-value pairs to the original map
        StringBuilder value1 = new StringBuilder("Value 1");
        StringBuilder value2 = new StringBuilder("Value 2");
        originalMap.put("key1", value1);
        originalMap.put("key2", value2);

        // Create a deep copy of the values associated with keys
        WeakHashMap<String, StringBuilder> deepCopyMap = new WeakHashMap<>();
        for (String key : originalMap.keySet()) {
            StringBuilder originalValue = originalMap.get(key);
            StringBuilder deepCopyValue = new StringBuilder(originalValue.toString()); // Create a new instance
            deepCopyMap.put(key, deepCopyValue);
        }

        // Modify the deep copy (originalMap is not affected)
        deepCopyMap.get("key1").append(" (modified)");

        // Print the original map
        System.out.println("Original Map:");
        for (String key : originalMap.keySet()) {
            StringBuilder value = originalMap.get(key);
            System.out.println(key + ": " + value);
        }

        // Print the deep copy map
        System.out.println("\nDeep Copy Map (modified):");
        for (String key : deepCopyMap.keySet()) {
            StringBuilder value = deepCopyMap.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
