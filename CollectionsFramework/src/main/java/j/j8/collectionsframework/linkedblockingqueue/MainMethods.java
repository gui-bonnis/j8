package j.j8.collectionsframework.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class MainMethods {
    public static void main(String[] args) throws InterruptedException {
        // Create a LinkedBlockingQueue with a capacity of 5
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        // Add elements to the queue
        for (int i = 1; 5 >= i; i++) {
            queue.offer(i);
        }

        System.out.println("Queue after initial insertion: " + queue);

        // Try adding an element when the queue is full (non-blocking)
        boolean added = queue.offer(6);
        System.out.println("Element 6 added: " + added); // Should print "false"

        // Add an element and block if the queue is full
        queue.put(6); // This will block until space is available

        // Retrieve and remove elements
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Retrieve and remove elements, blocking if the queue is empty
        int elementToTake = queue.take(); // This will block until an element is available

        System.out.println("Element taken: " + elementToTake);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the current size of the queue
        int size = queue.size();
        System.out.println("Queue size: " + size);

        // Peek at the element at the head of the queue (without removing it)
        int peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);

        // Convert the queue to an array
        Integer[] array = queue.toArray(new Integer[0]);
        System.out.print("Queue as an array: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clear the queue
        queue.clear();

        // Check if the queue is empty after clearing
        isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty after clearing? " + isEmpty);
    }
}
