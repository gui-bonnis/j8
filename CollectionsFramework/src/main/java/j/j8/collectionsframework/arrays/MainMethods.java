package j.j8.collectionsframework.arrays;

import java.util.Arrays;

public class MainMethods {
    public static void main(String[] args) {
        length();
        accessing();
        modifying();
        cloneValues();
        toStringArray();
        equals();
        sort();
        fill();
    }

    private static void fill() {
        int[] numbers = new int[5];
        Arrays.fill(numbers, 0); // Fills the array with zeros
    }

    private static void sort() {
        int[] numbers = {5, 2, 8, 1, 3};
        Arrays.sort(numbers); // Sorts the array in ascending order
    }

    private static void equals() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2); // Returns true
    }

    private static void toStringArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(numbers); // Returns "[1, 2, 3, 4, 5]"
    }

    private static void cloneValues() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] shallowCopy = originalArray.clone();
    }

    private static void modifying() {
        int[] numbers = {1, 2, 3, 4, 5};
        numbers[0] = 100; // Modifies the first element to 100
    }

    private static void accessing() {
        int[] numbers = {1, 2, 3, 4, 5};
        int thirdElement = numbers[2]; // Accesses the third element (3)
    }

    private static void length() {
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length; // Returns 5
    }
}
