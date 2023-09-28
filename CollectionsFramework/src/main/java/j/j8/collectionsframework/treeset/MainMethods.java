package j.j8.collectionsframework.treeset;

import java.util.TreeSet;

public class MainMethods {
    public static void main(String[] args) {
        // Create a TreeSet of String elements
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("date");
        treeSet.add("fig");

        // Display the TreeSet (sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Methods to retrieve elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
        System.out.println("Element greater than 'c': " + treeSet.higher("c"));
        System.out.println("Element less than or equal to 'd': " + treeSet.floor("d"));

        // Removing elements
        treeSet.remove("banana");
        System.out.println("After removing 'banana': " + treeSet);

        // Checking if an element exists
        System.out.println("Contains 'date': " + treeSet.contains("date"));

        // Size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Iterate through the TreeSet (in sorted order)
        System.out.print("Iterating through TreeSet: ");
        for (String fruit : treeSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
