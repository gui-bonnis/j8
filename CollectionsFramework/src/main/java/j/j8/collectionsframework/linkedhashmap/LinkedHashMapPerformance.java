package j.j8.collectionsframework.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapPerformance {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        long startTime = System.nanoTime();
        for (int i = 0; 100000 > i; i++) {
            linkedHashMap.put("Key" + i, i);
        }
        long endTime = System.nanoTime();
        long putTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; 100000 > i; i++) {
            Integer value = linkedHashMap.get("Key" + i);
        }
        endTime = System.nanoTime();
        long getTime = endTime - startTime;

        System.out.println("Time taken to put 100,000 elements: " + putTime + " ns");
        System.out.println("Time taken to get 100,000 elements: " + getTime + " ns");
    }
}
