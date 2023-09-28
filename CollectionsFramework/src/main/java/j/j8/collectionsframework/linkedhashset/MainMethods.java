package j.j8.collectionsframework.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainMethods {
    public static void main(String[] args) {
        // Create a LinkedHashSet of integers
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Add elements
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Check if an element is present
        boolean containsTwo = linkedHashSet.contains(2);
        System.out.println("Contains 2? " + containsTwo);

        // Remove an element
        linkedHashSet.remove(2);
        System.out.println("After removing 2: " + linkedHashSet);

        // Size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        // Iterate through the LinkedHashSet using an Iterator
        Iterator<Integer> iterator = linkedHashSet.iterator();
        System.out.print("LinkedHashSet elements (using Iterator): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("After clearing the LinkedHashSet: " + linkedHashSet);

        // Check if it's empty
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is the LinkedHashSet empty? " + isEmpty);
    }
}
