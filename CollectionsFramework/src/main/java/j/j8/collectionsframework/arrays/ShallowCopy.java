package j.j8.collectionsframework.arrays;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] shallowCopy = originalArray.clone();

        // Modify the shallow copy (original array remains unchanged)
        shallowCopy[0] = 100;

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Shallow Copy: " + Arrays.toString(shallowCopy));

    }
}
