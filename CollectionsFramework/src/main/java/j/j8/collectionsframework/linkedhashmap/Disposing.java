package j.j8.collectionsframework.linkedhashmap;


import java.util.LinkedHashMap;

public class Disposing {
    private final LinkedHashMap<String, Integer> LinkedHashMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        LinkedHashMap<String, Integer> num = new LinkedHashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        LinkedHashMap<String, Integer> num = new LinkedHashMap<>();

        // use the LinkedHashMap

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        LinkedHashMap<String, Integer> num = new LinkedHashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new LinkedHashMap<>(); // Nullify the reference
    }

}
