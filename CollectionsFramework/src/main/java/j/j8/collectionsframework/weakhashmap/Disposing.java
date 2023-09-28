package j.j8.collectionsframework.weakhashmap;


import java.util.WeakHashMap;

public class Disposing {
    WeakHashMap<String, Integer> weakMap = new WeakHashMap<>();

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
        disposalClear();
    }

    private static void disposalNullify() {
        WeakHashMap<String, Integer> num = new WeakHashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = null; // Nullify the reference

    }

    private static void disposalMethodScope() {
        WeakHashMap<String, Integer> num = new WeakHashMap<>();

        // use the LinkedBlockingQueue

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {
        WeakHashMap<String, Integer> num = new WeakHashMap<>();

        // Make sure there are no references to 'num' when you're done with it.
        num = new WeakHashMap<>(); // Nullify the reference
    }

    private static void disposalClear() {
        WeakHashMap<String, Integer> num = new WeakHashMap<>();
        num.clear();
    }

}
