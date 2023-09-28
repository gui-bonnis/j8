package j.j8.collectionsframework.hashmap;

import java.util.HashMap;

public class HashMapPerformance {
    public static void main(String[] args) {
        // Instantiate a HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Measuring write (insertion) performance
        long startTime = System.nanoTime();
        for (int i = 0; 1000000 > i; i++) {
            hashMap.put(String.valueOf(i), i);
        }
        long endTime = System.nanoTime();
        long writeTime = endTime - startTime;
        System.out.println("Write time (ns): " + writeTime);

        // Measuring read (lookup) performance
        startTime = System.nanoTime();
        Integer value = hashMap.get("500000"); // Change the key as needed
        endTime = System.nanoTime();
        long readTime = endTime - startTime;
        System.out.println("Read time (ns): " + readTime);

    }
}
