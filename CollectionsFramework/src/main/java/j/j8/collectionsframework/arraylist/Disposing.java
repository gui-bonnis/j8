package j.j8.collectionsframework.arraylist;


import java.util.ArrayList;
import java.util.List;

public class Disposing {
    private final List<Integer> numbers = new ArrayList<>(); // When the MyClass instance is no longer referenced, numbers becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {
        List<Integer> num = new ArrayList<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }
    private static void disposalMethodScope() {
        List<Integer> num = new ArrayList<>();

        // use the ArrayList

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        List<Integer> num = new ArrayList<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new ArrayList<>(); // Nullify the reference
    }

}
