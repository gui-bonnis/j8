package j.j8.collectionsframework.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] deepCopy = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            deepCopy[i] = originalArray[i];
        }

        // Modify the deep copy (original array remains unchanged)
        deepCopy[0] = 100;

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Deep Copy: " + Arrays.toString(deepCopy));

    }
}
