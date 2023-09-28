package j.j8.collectionsframework.deque;


import java.util.ArrayDeque;
import java.util.Deque;

public class Disposing {
    private final Deque<String> mydeque = new ArrayDeque<>(); //  When the MyClass instance is no longer referenced, mydeque becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        Deque<String> deque = new ArrayDeque<>();

        // Make sure there are no references to 'deque' when you're done with it.
        deque = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        Deque<String> deque = new ArrayDeque<>();

        // use the HashMap

    } // When someMethod() exits, deque goes out of scope

    private static void disposalReassigningReference() {
        Deque<String> deque = new ArrayDeque<>();

        // Make sure there are no references to 'deque' when you're done with it.
        deque = new ArrayDeque<>(); // Nullify the reference
    }

}
