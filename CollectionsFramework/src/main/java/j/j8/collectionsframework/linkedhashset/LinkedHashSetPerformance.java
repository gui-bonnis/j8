package j.j8.collectionsframework.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetPerformance {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        long startTime = System.nanoTime();

        // Writing (adding elements)
        for (int i = 0; 100000 > i; i++) {
            linkedHashSet.add(i);
        }

        long endTime = System.nanoTime();
        long writeTime = endTime - startTime;
        System.out.println("Time taken for writing: " + writeTime + " nanoseconds");

        startTime = System.nanoTime();

        // Reading (iterating through elements)
        for (Integer element : linkedHashSet) {
            // Do something with the element
        }

        endTime = System.nanoTime();
        long readTime = endTime - startTime;
        System.out.println("Time taken for reading: " + readTime + " nanoseconds");


    }
}
