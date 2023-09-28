package j.j8.collectionsframework.priorityqueue;


import java.util.PriorityQueue;

public class Disposing {
    private final PriorityQueue<Integer> numbers = new PriorityQueue<>(); // When the MyClass instance is no longer referenced, numbers becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        PriorityQueue<Integer> num = new PriorityQueue<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        PriorityQueue<Integer> num = new PriorityQueue<>();

        // use the PriorityQueue

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        PriorityQueue<Integer> num = new PriorityQueue<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new PriorityQueue<>(); // Nullify the reference
    }

}
