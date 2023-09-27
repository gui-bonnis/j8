package j.j8.collectionsframework.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class MainMethods {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);
        linkedList.addLast(4);

        // Removing elements
        linkedList.remove(2); // Removes element at index 2 (value 2)
        linkedList.removeFirst(); // Removes the first element (value 0)
        linkedList.removeLast(); // Removes the last element (value 4)

        // Accessing elements
        int firstElement = linkedList.getFirst();
        int lastElement = linkedList.getLast();
        int thirdElement = linkedList.get(2);

        // Checking size and empty status
        int size = linkedList.size();
        boolean isEmpty = linkedList.isEmpty();

        // Iterating through elements using an iterator
        Iterator<Integer> iterator = linkedList.iterator();
        System.out.print("LinkedList elements: ");
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }

        // Other operations
        boolean containsThree = linkedList.contains(3);
        int indexOfThree = linkedList.indexOf(3);
        int lastIndexOfThree = linkedList.lastIndexOf(3);

        // Converting to an array
        Integer[] array = linkedList.toArray(new Integer[0]);

        // Displaying the results
        System.out.println("\nFirst Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        System.out.println("Third Element: " + thirdElement);
        System.out.println("Size: " + size);
        System.out.println("Is Empty: " + isEmpty);
        System.out.println("Contains 3: " + containsThree);
        System.out.println("Index of 3: " + indexOfThree);
        System.out.println("Last Index of 3: " + lastIndexOfThree);
        System.out.print("Array: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
    }
}
