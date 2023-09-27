package j.j8.collectionsframework.arraylist;

import j.j8.collectionsframework.Performance;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReadingPerformance {
    public static void main(String[] args) {
        int numElements = 1000000; // Number of elements to work with

        // Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numElements; i++) {
            numbers.add(i);
        }

        // Measuring reading performance
        Performance.startNanosecond();

        for (int i = 0; i < numElements; i++) {
            int value = numbers.get(i);
        }

        Performance.endNanoseconds();
    }
}