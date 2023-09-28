package j.j8.collectionsframework.treeset;


import java.util.TreeSet;

public class Disposing {
    private final TreeSet<Integer> treeSet = new TreeSet<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
        disposalClear();
    }

    private static void disposalNullify() {
        TreeSet<Integer> num = new TreeSet<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        TreeSet<Integer> num = new TreeSet<>();

        // use the HashMap

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        TreeSet<Integer> num = new TreeSet<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new TreeSet<>(); // Nullify the reference
    }

    private static void disposalClear() {
        TreeSet<Integer> num = new TreeSet<>();
        num.clear();
    }

}
