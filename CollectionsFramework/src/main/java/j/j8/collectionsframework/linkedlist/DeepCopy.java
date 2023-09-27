package j.j8.collectionsframework.linkedlist;

import java.util.LinkedList;

public class DeepCopy {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Item 1");
        originalList.add("Item 2");
        originalList.add("Item 3");

        // Create a deep copy
        LinkedList<String> deepCopy = new LinkedList<>();
        for (String item : originalList) {
            deepCopy.add(item); // Create new instances for each element
        }

        // Modify the deep copy
        deepCopy.add("Item 4");

        // Original and deep copy have different elements
        System.out.println("Original List: " + originalList);
        System.out.println("Deep Copy: " + deepCopy);
    }
}

