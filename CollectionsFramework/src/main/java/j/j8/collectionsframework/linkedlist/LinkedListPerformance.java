package j.j8.collectionsframework.linkedlist;

import j.j8.collectionsframework.Performance;

import java.util.LinkedList;

public class LinkedListPerformance {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Measure the insertion (writing) performance
        Performance.startNanosecond();

        for (int i = 0; 1000000 > i; i++) {
            linkedList.add(i);
        }

        Performance.endNanoseconds();

        // Measure the retrieval (reading) performance
        Performance.startNanosecond();

        int sum = 0;
        for (int value : linkedList) {
            sum += value;
        }

        Performance.endNanoseconds();
    }
}
