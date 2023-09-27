package j.j8.collectionsframework.queue;


import java.util.LinkedList;
import java.util.Queue;

public class Disposing {
    private final Queue<Integer> numbers = new LinkedList<>(); // When the MyClass instance is no longer referenced, numbers becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        Queue<Integer> num = new LinkedList<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        Queue<Integer> num = new LinkedList<>();

        // use the Queue

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        Queue<Integer> num = new LinkedList<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new LinkedList<>(); // Nullify the reference
    }

}
