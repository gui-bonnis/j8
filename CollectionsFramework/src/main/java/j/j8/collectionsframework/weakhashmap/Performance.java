package j.j8.collectionsframework.weakhashmap;

import java.util.WeakHashMap;

public class Performance {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> weakMap = new WeakHashMap<>();

        // Measure write (put) performance
        long startTime = System.nanoTime();
        for (int i = 0; 100000 > i; i++) {
            weakMap.put(i, "Value" + i);
        }
        long endTime = System.nanoTime();
        long writeTime = endTime - startTime;

        // Measure read (get) performance
        startTime = System.nanoTime();
        for (int i = 0; 100000 > i; i++) {
            String value = weakMap.get(i);
        }
        endTime = System.nanoTime();
        long readTime = endTime - startTime;

        // Print the results
        System.out.println("Write (put) time: " + writeTime / 1_000_000 + " milliseconds");
        System.out.println("Read (get) time: " + readTime / 1_000_000 + " milliseconds");
    }
}
