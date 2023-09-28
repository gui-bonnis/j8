package j.j8.collectionsframework.hashtable;

import java.util.Hashtable;

public class Performance {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        long startTime, endTime;

        // Measure time to write to the Hashtable
        startTime = System.currentTimeMillis();
        for (int i = 0; 100000 > i; i++) {
            hashtable.put(i, "Value" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to write: " + (endTime - startTime) + " milliseconds");

        // Measure time to read from the Hashtable
        startTime = System.currentTimeMillis();
        for (int i = 0; 100000 > i; i++) {
            String value = hashtable.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to read: " + (endTime - startTime) + " milliseconds");
    }
}
