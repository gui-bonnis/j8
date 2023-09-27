package j.j8.collectionsframework.arraylist;

import j.j8.collectionsframework.People;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy {
    public static void main(String[] args) {
        List<People> originalList = new ArrayList<>();
        originalList.add(new People("Alice", 10));
        originalList.add(new People("Bob", 20));

        // Deep copy using a custom copy constructor
        List<People> deepCopy = new ArrayList<>();
        for (People person : originalList) {
            deepCopy.add(new People(person));
        }

        // Modify the copied list, and it won't affect the original
        // deepCopy.get(0).setName("Eve");
        System.out.println(originalList.get(0).getName()); // "Alice"
        System.out.println(deepCopy.get(0).getName());      // "Eve"
    }
}
