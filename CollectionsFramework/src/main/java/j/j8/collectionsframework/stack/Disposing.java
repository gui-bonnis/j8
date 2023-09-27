package j.j8.collectionsframework.stack;


import java.util.List;
import java.util.Stack;

public class Disposing {
    private final Stack<Integer> numbers = new Stack<>(); // When the MyClass instance is no longer referenced, numbers becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        Stack<Integer> num = new Stack<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        List<Integer> num = new Stack<>();

        // use the Stack

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        List<Integer> num = new Stack<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new Stack<>(); // Nullify the reference
    }

}
