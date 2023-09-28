package j.j8.collectionsframework.treeset;

import java.util.TreeSet;

public class TreeSetPerformance {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Measure the time taken to insert elements
        long startTime = System.nanoTime();
        for (int i = 0; 10000 > i; i++) {
            treeSet.add(i);
        }
        long endTime = System.nanoTime();

        System.out.println("Time taken for insertion (ms): " + (endTime - startTime) / 1_000_000);

        // Measure the time taken to retrieve an element
        startTime = System.nanoTime();
        boolean containsElement = treeSet.contains(5000);
        endTime = System.nanoTime();

        System.out.println("Time taken for retrieval (ns): " + (endTime - startTime));
    }
}
