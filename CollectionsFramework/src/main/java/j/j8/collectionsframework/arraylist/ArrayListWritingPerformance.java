package j.j8.collectionsframework.arraylist;

import j.j8.collectionsframework.Performance;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWritingPerformance {
    public static void main(String[] args) {
        int numElements = 1000000; // Number of elements to work with

        // Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();

        // Measuring writing (insertion) performance
        Performance.startNanosecond();

        for (int i = 0; i < numElements; i++) {
            numbers.add(i);
        }

        Performance.endNanoseconds();
    }
}