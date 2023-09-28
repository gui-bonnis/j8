package j.j8.collectionsframework.vector;

import java.util.Vector;

public class ShallowCopy {
    public static void main(String[] args) {
        Vector<String> originalVector = new Vector<>();
        originalVector.add("A");
        originalVector.add("B");
        originalVector.add("C");

        // Shallow copy using the copy constructor
        Vector<String> shallowCopy = new Vector<>(originalVector);

        // Modify the original to see the difference
        originalVector.set(0, "X");

        System.out.println("Original Vector: " + originalVector);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
