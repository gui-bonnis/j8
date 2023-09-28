package j.j8.collectionsframework.hashtable;


import java.util.Hashtable;

public class Disposing {
    private final Hashtable<String, Integer> Hashtable = new Hashtable<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        Hashtable<String, Integer> num = new Hashtable<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        Hashtable<String, Integer> num = new Hashtable<>();

        // use the Hashtable

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        Hashtable<String, Integer> num = new Hashtable<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new Hashtable<>(); // Nullify the reference
    }

}
