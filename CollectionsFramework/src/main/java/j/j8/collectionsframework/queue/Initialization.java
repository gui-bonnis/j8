package j.j8.collectionsframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Initialization {
    public static void main(String[] args) {
        // Instantiate a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue (enqueue)
        queue.add("Element 1");
        queue.offer("Element 2");
        queue.add("Element 3");

        // Accessing elements (peek) without removing them
        String peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        // Removing elements from the Queue (dequeue)
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Accessing and removing elements (remove)
        String element = queue.remove();
        System.out.println("Removed Element: " + element);

        // Checking if the Queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty: " + isEmpty);
    }
}
