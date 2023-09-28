package j.j8.collectionsframework.vector;


import java.util.Vector;

public class Disposing {
    private final Vector<String> vector = new Vector<>(); //  When the MyClass instance is no longer referenced, vector becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
        disposalClear();
    }

    private static void disposalNullify() {
        Vector<String> vector1 = new Vector<>();

        // Make sure there are no references to 'vector1' when you're done with it.
        vector1 = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        Vector<String> vector1 = new Vector<>();

        // use the Vector

    } // When someMethod() exits, set goes out of scope

    private static void disposalReassigningReference() {
        Vector<String> vector1 = new Vector<>();

        // Make sure there are no references to 'vector1' when you're done with it.
        vector1 = new Vector<>(); // Nullify the reference
    }

    private static void disposalClear() {
        Vector<Integer> vector1 = new Vector<>();
        vector1.clear();
    }

}
