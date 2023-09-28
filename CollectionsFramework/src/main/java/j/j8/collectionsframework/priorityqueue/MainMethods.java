package j.j8.collectionsframework.priorityqueue;

import java.util.PriorityQueue;

public class MainMethods {
    public static void main(String[] args) {
        // Instantiate a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);

        // Display the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Peeking at the highest-priority element without removal
        int peekedElement = priorityQueue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        // Removing and returning the highest-priority element
        int removedElement = priorityQueue.poll();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated PriorityQueue: " + priorityQueue);

        // Checking if the PriorityQueue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is PriorityQueue empty? " + isEmpty);

        // Size of the PriorityQueue
        int size = priorityQueue.size();
        System.out.println("Size of PriorityQueue: " + size);
    }
}
