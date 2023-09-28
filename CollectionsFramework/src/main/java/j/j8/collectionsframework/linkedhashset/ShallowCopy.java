package j.j8.collectionsframework.linkedhashset;

import java.util.LinkedHashSet;

public class ShallowCopy {
    public static void main(String[] args) {
        LinkedHashSet<String> originalSet = new LinkedHashSet<>();
        originalSet.add("A");
        originalSet.add("B");

        // Shallow copy
        LinkedHashSet<String> shallowCopy = new LinkedHashSet<>(originalSet);

        // Now, both originalSet and shallowCopy contain the same elements.
    }
}
