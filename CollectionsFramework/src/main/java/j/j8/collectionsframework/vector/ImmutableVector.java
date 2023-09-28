package j.j8.collectionsframework.vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ImmutableVector {
    public static void main(String[] args) {
        // Create a mutable Vector
        Vector<String> mutableVector = new Vector<>();
        mutableVector.add("Apple");
        mutableVector.add("Banana");
        mutableVector.add("Cherry");

        // Wrap it to make it immutable
        List<String> immutableList = Collections.unmodifiableList(mutableVector);

        // Attempting to modify the immutable list will result in an UnsupportedOperationException
        // immutableList.add("Date"); // This line would throw an exception

        // Accessing elements is allowed
        String firstElement = immutableList.get(0);
        System.out.println("First element: " + firstElement);

        // You can iterate through the immutable list
        for (String fruit : immutableList) {
            System.out.println(fruit);
        }
    }
}
