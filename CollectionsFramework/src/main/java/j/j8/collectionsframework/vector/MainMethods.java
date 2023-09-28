package j.j8.collectionsframework.vector;

import java.util.Enumeration;
import java.util.Vector;

public class MainMethods {
    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add(1);
        vector.add(2);
        vector.add(3);

        // Accessing elements
        System.out.println("Vector: " + vector);

        // Accessing elements using get()
        int firstElement = vector.get(0);
        System.out.println("First element: " + firstElement);

        // Updating elements using set()
        vector.set(1, 99);
        System.out.println("Updated Vector: " + vector);

        // Checking if an element exists
        boolean contains = vector.contains(3);
        System.out.println("Contains 3? " + contains);

        // Finding the index of an element
        int indexOfThree = vector.indexOf(3);
        System.out.println("Index of 3: " + indexOfThree);

        // Removing elements
        vector.remove(0);
        System.out.println("Vector after removing the first element: " + vector);

        // Getting the size of the Vector
        int size = vector.size();
        System.out.println("Size of Vector: " + size);

        // Checking if the Vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is Vector empty? " + isEmpty);

        // Enumeration to iterate through elements (legacy)
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            int element = enumeration.nextElement();
            System.out.println("Enumeration element: " + element);
        }

        // Clearing the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}
