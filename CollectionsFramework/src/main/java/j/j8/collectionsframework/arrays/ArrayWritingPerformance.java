package j.j8.collectionsframework.arrays;

import j.j8.collectionsframework.Performance;

public class ArrayWritingPerformance {
    public static void main(String[] args) {
        int[] intArray = new int[1000000]; // Create a large array

        // Measure the time taken to write (modify) all elements
        Performance.start();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        Performance.end();
    }
}
