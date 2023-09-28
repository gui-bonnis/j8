package j.j8.collectionsframework.treeset;

import java.util.TreeSet;

public class ShallowCopy {
    public static void main(String[] args) {
        TreeSet<Integer> originalSet = new TreeSet<>();
        // Add elements to the originalSet

        // Shallow copy
        TreeSet<Integer> copySet = new TreeSet<>(originalSet);
    }
}
