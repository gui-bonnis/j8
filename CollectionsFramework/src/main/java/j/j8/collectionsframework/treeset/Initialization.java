package j.j8.collectionsframework.treeset;

import java.util.TreeSet;

public class Initialization {
    public static void main(String[] args) {
        // Creating a TreeSet of Integer elements
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);

        // Displaying the TreeSet (elements will be in sorted order)
        System.out.println(treeSet);
    }
}
