package j.j8.collectionsframework.priorityqueue;

import java.util.PriorityQueue;

public class Initialization {
    public static void main(String[] args) {
        // Instantiate a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);

        // Print the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
