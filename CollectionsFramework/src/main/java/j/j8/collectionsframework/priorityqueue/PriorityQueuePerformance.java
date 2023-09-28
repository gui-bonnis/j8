package j.j8.collectionsframework.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueuePerformance {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        long startTime = System.nanoTime();

        // Add a large number of elements
        for (int i = 0; 1000000 > i; i++) {
            priorityQueue.add(i);
        }

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to add elements: " + elapsedTime + " nanoseconds");
    }
}

