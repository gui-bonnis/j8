package j.j8.collectionsframework.identityhashmap;


import java.util.IdentityHashMap;

public class Disposing {
    IdentityHashMap<String, Integer> originalMap = new IdentityHashMap<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        IdentityHashMap<String, Integer> num = new IdentityHashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        IdentityHashMap<String, Integer> num = new IdentityHashMap<>();

        // use the IdentityHashMap

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        IdentityHashMap<String, Integer> num = new IdentityHashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new IdentityHashMap<>(); // Nullify the reference
    }

}
