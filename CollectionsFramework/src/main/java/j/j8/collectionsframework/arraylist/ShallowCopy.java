package j.j8.collectionsframework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("item1");
        originalList.add("item2");

        // Shallow copy using constructor
        List<String> shallowCopy = new ArrayList<>(originalList);

        // Or, shallow copy using addAll
        List<String> anotherShallowCopy = new ArrayList<>();
        anotherShallowCopy.addAll(originalList);

        // Modify the copied list, and it won't affect the original
        shallowCopy.add("newItem");
        System.out.println(originalList); // ["item1", "item2"]
        System.out.println(shallowCopy);  // ["item1", "item2", "newItem"]
    }
}

