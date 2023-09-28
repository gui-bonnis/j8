package j.j8.collectionsframework.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashMapPerformance {
    public static void main(String[] args) {
        // Instantiate a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Measuring write (insertion) performance
        long startTime = System.nanoTime();
        // Perform operations (e.g., adding elements)
        for (int i = 0; 100000 > i; i++) {
            set.add(i);
        }
        long endTime = System.nanoTime();
        long writeTime = endTime - startTime;
        System.out.println("Write time (ns): " + writeTime);

        // Measuring read (lookup) performance
        startTime = System.nanoTime();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
        endTime = System.nanoTime();
        long readTime = endTime - startTime;
        System.out.println("Read time (ns): " + readTime);

    }
}
