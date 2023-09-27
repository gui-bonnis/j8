package j.j8.collectionsframework.linkedlist;


import java.util.LinkedList;

public class Disposing {
    private final LinkedList<Integer> numbers = new LinkedList<>(); // When the MyClass instance is no longer referenced, numbers becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        LinkedList<Integer> num = new LinkedList<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        LinkedList<Integer> num = new LinkedList<>();

        // use the ArrayList

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        LinkedList<Integer> num = new LinkedList<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new LinkedList<>(); // Nullify the reference
    }

}
