package j.j8.collectionsframework.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueShallowCopy {
    public static void main(String[] args) {
        PriorityQueue<Integer> originalQueue = new PriorityQueue<>();
        originalQueue.add(5);
        originalQueue.add(2);
        originalQueue.add(8);

        // Shallow copy
        PriorityQueue<Integer> shallowCopy = new PriorityQueue<>(originalQueue);

        // Modify the original PriorityQueue
        originalQueue.add(1);

        System.out.println("Original PriorityQueue: " + originalQueue);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}

