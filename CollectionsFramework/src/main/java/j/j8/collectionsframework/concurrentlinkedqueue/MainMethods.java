package j.j8.collectionsframework.concurrentlinkedqueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class MainMethods {
    public static void main(String[] args) {
        // Create a ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        // Add elements to the queue
        queue.add(1);
        queue.offer(2);
        queue.add(3);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Queue size: " + size);

        // Peek at the first element without removing it
        Integer peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);

        // Poll and remove the first element
        Integer polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);

        // Check if a specific element is in the queue
        boolean containsElement = queue.contains(2);
        System.out.println("Does the queue contain 2? " + containsElement);

        // Remove a specific element
        boolean removedElement = queue.remove(3);
        System.out.println("Removed 3 from the queue: " + removedElement);

        // Convert the queue to an array
        Integer[] queueArray = queue.toArray(new Integer[0]);
        System.out.print("Queue elements as an array: ");
        for (Integer element : queueArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clear the queue
        queue.clear();
        System.out.println("Queue cleared. Is it empty now? " + queue.isEmpty());
    }
}
