package j.j8.collectionsframework.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ShallowCopy {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Item 1");
        originalList.add("Item 2");
        originalList.add("Item 3");

        // Create a shallow copy
        List<String> shallowCopy = new LinkedList<>(originalList);

        // Modify the shallow copy
        shallowCopy.add("Item 4");

        // Both original and shallow copy have the same elements
        System.out.println("Original List: " + originalList);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}

