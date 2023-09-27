package j.j8.collectionsframework.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMethods {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Adding Elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList after adding elements: " + arrayList);

        // Accessing Elements
        String fruit = arrayList.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Removing Elements
        arrayList.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + arrayList);

        // Size and Capacity
        int size = arrayList.size();
        System.out.println("Size of ArrayList: " + size);

        // Iterating Over Elements
        arrayList.forEach(item -> System.out.println("Element: " + item));

        // Sorting
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // Checking for Element Existence
        boolean containsBanana = arrayList.contains("Banana");
        System.out.println("ArrayList contains 'Banana': " + containsBanana);

        // Sublist Operations
        List<String> sublist = arrayList.subList(0, 2);
        System.out.println("Sublist from index 0 to 2 (exclusive): " + sublist);

        // Clearing the ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
    }
}
