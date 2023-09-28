package j.j8.collectionsframework.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> mutableSet = new HashSet<>();
        mutableSet.add("Apple");
        mutableSet.add("Banana");
        mutableSet.add("Cherry");

        // Create an immutable copy of the HashSet
        Set<String> immutableSet = Collections.unmodifiableSet(mutableSet);

        // Attempt to modify the immutable set (will result in an exception)
        try {
            immutableSet.add("Date"); // This line will throw UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Attempt to modify the immutable set resulted in an exception.");
        }

        // You can still perform read-only operations on the immutable set
        boolean containsBanana = immutableSet.contains("Banana");
        System.out.println("Does the immutable set contain 'Banana'? " + containsBanana);
    }
}
