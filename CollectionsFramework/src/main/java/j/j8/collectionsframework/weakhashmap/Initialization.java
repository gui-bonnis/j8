package j.j8.collectionsframework.weakhashmap;

import java.util.WeakHashMap;

public class Initialization {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> weakMap = new WeakHashMap<>();
        // Adding key-value pairs to the WeakHashMap
        weakMap.put("one", 1);
        weakMap.put("two", 2);
        weakMap.put("three", 3);

        // Accessing and using the WeakHashMap
        int value = weakMap.get("two");
        System.out.println("Value associated with 'two': " + value);
    }
}
