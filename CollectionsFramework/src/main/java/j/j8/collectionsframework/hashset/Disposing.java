package j.j8.collectionsframework.hashset;


import java.util.HashSet;

public class Disposing {
    private final HashSet<String> mySet = new HashSet<>(); //  When the MyClass instance is no longer referenced, mySet becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        HashSet<String> set = new HashSet<>();

        // Make sure there are no references to 'set' when you're done with it.
        set = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        HashSet<String> set = new HashSet<>();

        // use the HashMap

    } // When someMethod() exits, set goes out of scope

    private static void disposalReassigningReference() {
        HashSet<String> set = new HashSet<>();

        // Make sure there are no references to 'set' when you're done with it.
        set = new HashSet<>(); // Nullify the reference
    }

}
