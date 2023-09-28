package j.j8.collectionsframework.treemap;


import java.util.TreeMap;

public class Disposing {
    TreeMap<Integer, String> treeMap = new TreeMap<>(); // When the MyClass instance is no longer referenced, numbers becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        TreeMap<Integer, String> tree = new TreeMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        tree = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        TreeMap<Integer, String> tree = new TreeMap<>();

        // use the Stack

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        TreeMap<Integer, String> tree = new TreeMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        tree = new TreeMap<>(); // Nullify the reference
    }

}
