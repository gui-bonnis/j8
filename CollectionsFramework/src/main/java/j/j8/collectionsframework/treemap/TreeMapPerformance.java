package j.j8.collectionsframework.treemap;

import java.util.TreeMap;

public class TreeMapPerformance {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        long startTime = System.nanoTime();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        long endTime = System.nanoTime();

        System.out.println("Time taken for insertion (ns): " + (endTime - startTime));

        startTime = System.nanoTime();
        String value = treeMap.get(2);
        endTime = System.nanoTime();

        System.out.println("Time taken for retrieval (ns): " + (endTime - startTime));

    }
}

