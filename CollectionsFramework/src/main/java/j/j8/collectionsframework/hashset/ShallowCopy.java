package j.j8.collectionsframework.hashset;

import java.util.HashSet;

public class ShallowCopy {
    public static void main(String[] args) {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");

        // Shallow copy
        HashSet<String> shallowCopy = new HashSet<>(originalSet);
    }
}
