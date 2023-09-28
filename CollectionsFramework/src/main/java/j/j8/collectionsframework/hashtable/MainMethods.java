package j.j8.collectionsframework.hashtable;

import java.util.Hashtable;

public class MainMethods {
    public static void main(String[] args) {
        // Create a Hashtable with Integer keys and String values
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Access values using keys
        String value1 = hashtable.get(1);
        String value2 = hashtable.get(2);

        System.out.println("Value at key 1: " + value1);
        System.out.println("Value at key 2: " + value2);

        // Check if a key exists
        boolean containsKey = hashtable.containsKey(3);
        boolean containsKeyNotPresent = hashtable.containsKey(4);

        System.out.println("Contains key 3: " + containsKey);
        System.out.println("Contains key 4: " + containsKeyNotPresent);

        // Check if a value exists
        boolean containsValue = hashtable.containsValue("Two");
        boolean containsValueNotPresent = hashtable.containsValue("Four");

        System.out.println("Contains value 'Two': " + containsValue);
        System.out.println("Contains value 'Four': " + containsValueNotPresent);

        // Remove a key-value pair
        hashtable.remove(2);

        // Check if a key exists after removal
        containsKey = hashtable.containsKey(2);

        System.out.println("Contains key 2 after removal: " + containsKey);

        // Size of the Hashtable
        int size = hashtable.size();
        System.out.println("Size of the Hashtable: " + size);
    }
}
