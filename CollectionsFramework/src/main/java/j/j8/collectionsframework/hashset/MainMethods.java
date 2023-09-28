package j.j8.collectionsframework.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainMethods {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set1 = new HashSet<>();

        // Add elements
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        // Create another HashSet for operations
        Set<String> set2 = new HashSet<>();
        set2.add("Grapes");
        set2.add("Fig");

        // Copy set1 into set2
        set2.addAll(set1);
        System.out.println("set2 after adding all elements from set1: " + set2);

        // Check if the HashSet is empty
        boolean isEmpty = set2.isEmpty();
        System.out.println("Is set2 empty? " + isEmpty);

        // Remove an element
        boolean removed = set2.remove("Banana");
        System.out.println("Removed 'Banana' from set2: " + removed);

        // Check if an element exists
        boolean containsCherry = set2.contains("Cherry");
        System.out.println("Does set2 contain 'Cherry'? " + containsCherry);

        // Create a shallow copy of set2
        Set<String> shallowCopy = new HashSet<>(set2);
        System.out.println("Shallow copy of set2: " + shallowCopy);

        // Clear the HashSet
        set2.clear();
        System.out.println("set2 after clearing: " + set2);

        // Create another HashSet for intersection
        Set<String> set3 = new HashSet<>();
        set3.add("Grapes");
        set3.add("Cherry");

        // Perform intersection with set3
        set3.retainAll(shallowCopy);
        System.out.println("Intersection of set3 and shallowCopy: " + set3);

        // Create another HashSet for difference
        Set<String> set4 = new HashSet<>();
        set4.add("Cherry");
        set4.add("Banana");

        // Perform difference with set4
        set4.removeAll(shallowCopy);
        System.out.println("Difference between set4 and shallowCopy: " + set4);

        // Create an iterator and iterate through the elements
        Iterator<String> iterator = shallowCopy.iterator();
        System.out.println("Iterating through shallowCopy:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
