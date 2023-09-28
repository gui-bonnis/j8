package j.j8.collectionsframework.linkedhashset;


import java.util.LinkedHashSet;

public class Disposing {
    private final LinkedHashSet<Integer> hashMap = new LinkedHashSet<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        LinkedHashSet<Integer> num = new LinkedHashSet<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        LinkedHashSet<Integer> num = new LinkedHashSet<>();

        // use the HashMap

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        LinkedHashSet<Integer> num = new LinkedHashSet<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new LinkedHashSet<>(); // Nullify the reference
    }

}
