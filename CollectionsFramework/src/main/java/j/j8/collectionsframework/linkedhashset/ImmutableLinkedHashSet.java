package j.j8.collectionsframework.linkedhashset;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ImmutableLinkedHashSet {
    public static void main(String[] args) {
        // Create a mutable LinkedHashSet
        LinkedHashSet<String> mutableSet = new LinkedHashSet<>();
        mutableSet.add("Apple");
        mutableSet.add("Banana");
        mutableSet.add("Cherry");

        // Make it immutable
        Set<String> immutableSet = Collections.unmodifiableSet(mutableSet);

        // Attempting to modify the immutable set will result in an UnsupportedOperationException
        // Uncommenting the following line will throw an exception:
        // immutableSet.add("Date"); // This line will throw an UnsupportedOperationException

        // Reading from the immutable set is allowed
        for (String fruit : immutableSet) {
            System.out.println(fruit);
        }
    }
}
