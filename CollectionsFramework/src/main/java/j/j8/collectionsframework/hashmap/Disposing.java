package j.j8.collectionsframework.hashmap;


import java.util.HashMap;

public class Disposing {
    private final HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        HashMap<String, Integer> num = new HashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        HashMap<String, Integer> num = new HashMap<>();

        // use the HashMap

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        HashMap<String, Integer> num = new HashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new HashMap<>(); // Nullify the reference
    }

}
