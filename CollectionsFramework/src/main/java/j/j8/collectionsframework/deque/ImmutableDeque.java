package j.j8.collectionsframework.deque;

import java.util.*;

public class ImmutableDeque {
    public static void main(String[] args) {
        // Create a mutable Deque (ArrayDeque is used here)
        Deque<String> mutableDeque = new ArrayDeque<>();
        mutableDeque.add("Item 1");
        mutableDeque.add("Item 2");
        mutableDeque.add("Item 3");

        // Create an immutable view of the mutable Deque
        List<String> immutableList = Collections.unmodifiableList(new LinkedList<>(mutableDeque));

        // Try to modify the immutable Deque (will result in an exception)
        try {
            immutableList.add("Item 4"); // This will throw an UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Tried to modify the immutable Deque, but it's immutable.");
        }

        // Access elements in the immutable Deque
        System.out.println("Immutable Deque: " + immutableList);

        // You can still perform read operations on the immutable List
        String firstItem = immutableList.get(0);
        String lastItem = immutableList.get(immutableList.size() - 1);
        System.out.println("First Item: " + firstItem);
        System.out.println("Last Item: " + lastItem);
    }
}
