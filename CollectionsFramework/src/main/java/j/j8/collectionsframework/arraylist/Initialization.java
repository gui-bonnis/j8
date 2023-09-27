package j.j8.collectionsframework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Initialization {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        // Accessing elements by index
        int firstNumber = numbers.get(0); // Gets the first element (5)

        // Printing the ArrayList
        System.out.println("ArrayList of numbers: " + numbers);

        // Size of the ArrayList
        int size = numbers.size(); // Returns 3

        // Removing an element by value
        numbers.remove(Integer.valueOf(10)); // Removes the element with value 10

        // Checking if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty(); // Returns false
    }
}
