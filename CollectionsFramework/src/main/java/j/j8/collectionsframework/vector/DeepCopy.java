package j.j8.collectionsframework.vector;

import java.util.Vector;

public class DeepCopy {
    public static void main(String[] args) {
        Vector<String> originalVector = new Vector<>();
        originalVector.add("A");
        originalVector.add("B");
        originalVector.add("C");

        // Deep copy by creating a new Vector and adding elements
        Vector<String> deepCopy = new Vector<>();
        deepCopy.addAll(originalVector);

        // Modify the original to see the difference
        originalVector.set(0, "X");

        System.out.println("Original Vector: " + originalVector);
        System.out.println("Deep Copy: " + deepCopy);
    }
}
