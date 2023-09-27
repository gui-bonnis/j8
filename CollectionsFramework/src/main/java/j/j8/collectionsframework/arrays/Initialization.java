package j.j8.collectionsframework.arrays;

import j.j8.collectionsframework.People;

public class Initialization {
    public static void main(String[] args) {
        initializationPrimitiveValues();
        initializationComplexObject();
        initializationWithSpecificValues();
    }

    private static void initializationPrimitiveValues() {

        int[] intArray = new int[5]; // Creates an array of 5 integers, initialized with default values (0 for int).

        String[] stringArray = new String[3]; // Creates an array of 3 strings, initialized with default values (null for String).

        double[] doubleArray = new double[4]; // Creates an array of 4 doubles, initialized with default values (0.0 for double).

        // Assuming you have a custom class called People
        People[] p = new People[5];// Creates an array of 5 People objects, initialized with default values (null for object references).

        //Alloc array positions
        p[0] = new People("John", 10);
        p[1] = new People("Michael", 13);
        p[2] = new People("Richard", 15);
        p[3] = new People("Mary", 20);
        p[4] = new People("Ellen", 18);

    }

    private static void initializationComplexObject() {

        // Assuming you have a custom class called People
        People[] p = new People[5];// Creates an array of 5 People objects, initialized with default values (null for object references).

        //Alloc array positions
        p[0] = new People("John", 10);
        p[1] = new People("Michael", 13);
        p[2] = new People("Richard", 15);
        p[3] = new People("Mary", 20);
        p[4] = new People("Ellen", 18);

    }
    private static void initializationWithSpecificValues() {

        int[] numbers = {1, 2, 3, 4, 5}; // Initializes an array of integers with specific values.

        String[] colors = {"Red", "Green", "Blue"}; // Initializes an array of strings with specific values.
    }
}
