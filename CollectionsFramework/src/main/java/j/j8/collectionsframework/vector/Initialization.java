package j.j8.collectionsframework.vector;

import java.util.Vector;

public class Initialization {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Accessing elements
        String firstElement = vector.get(0);
        System.out.println("First element: " + firstElement);
    }
}
