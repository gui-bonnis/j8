package j.j8.collectionsframework.arrays;

import j.j8.collectionsframework.Performance;

public class ArrayReadingPerformance {
    public static void main(String[] args) {
        int[] intArray = new int[1000000]; // Create a large array

        // Initialize the array with values
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        // Measure the time taken to read all elements
        Performance.startMillisecond();
        for (int i = 0; i < intArray.length; i++) {
            int element = intArray[i];
        }
        Performance.endMilliseconds();
    }
}

