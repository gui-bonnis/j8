package j.j8.collectionsframework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainMethods {
    public static void main(String[] args) {
        // Create a Deque (ArrayDeque is used here)
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back
        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("Front");
        deque.offerLast("Rear");

        // Display the deque
        System.out.println("Deque: " + deque);

        // Access elements
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Peek elements without removing
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();
        System.out.println("Peek First: " + peekFirst);
        System.out.println("Peek Last: " + peekLast);

        // Remove elements from the front and back
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();
        System.out.println("Removed First: " + removedFirst);
        System.out.println("Removed Last: " + removedLast);

        // Display the modified deque
        System.out.println("Modified Deque: " + deque);

        // Check if the deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is Deque Empty? " + isEmpty);

        // Get the size of the deque
        int size = deque.size();
        System.out.println("Deque Size: " + size);

        // Clear the deque
        deque.clear();
        System.out.println("Cleared Deque: " + deque);

        // Check if the deque is empty after clearing
        isEmpty = deque.isEmpty();
        System.out.println("Is Deque Empty After Clear? " + isEmpty);
    }
}
