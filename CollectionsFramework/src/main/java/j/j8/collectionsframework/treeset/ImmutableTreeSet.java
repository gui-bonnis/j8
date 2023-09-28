package j.j8.collectionsframework.treeset;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImmutableTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet of Integer elements
        TreeSet<Integer> mutableSet = new TreeSet<>();
        mutableSet.add(5);
        mutableSet.add(2);
        mutableSet.add(8);

        // Create an immutable view of the TreeSet
        SortedSet<Integer> immutableSet = Collections.unmodifiableSortedSet(mutableSet);

        // Try to modify the immutable set (this will throw an UnsupportedOperationException)
        // immutableSet.add(10); // Uncommenting this line will result in an exception

        // Accessing elements in the immutable set
        System.out.println("Immutable Set: " + immutableSet);
        System.out.println("First element: " + immutableSet.first());
        System.out.println("Last element: " + immutableSet.last());
    }
}
