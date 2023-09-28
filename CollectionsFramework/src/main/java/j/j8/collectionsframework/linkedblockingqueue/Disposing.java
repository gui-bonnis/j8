package j.j8.collectionsframework.linkedblockingqueue;


import java.util.concurrent.LinkedBlockingQueue;

public class Disposing {
    LinkedBlockingQueue<Integer> originalQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
        disposalClear();
    }

    private static void disposalNullify() {
        LinkedBlockingQueue<Integer> num = new LinkedBlockingQueue<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        LinkedBlockingQueue<Integer> num = new LinkedBlockingQueue<>();

        // use the LinkedBlockingQueue

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        LinkedBlockingQueue<Integer> num = new LinkedBlockingQueue<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new LinkedBlockingQueue<>(); // Nullify the reference
    }

    private static void disposalClear() {
        LinkedBlockingQueue<Integer> num = new LinkedBlockingQueue<>();
        num.clear();
    }

}
