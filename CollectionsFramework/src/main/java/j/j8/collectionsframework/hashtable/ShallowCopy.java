package j.j8.collectionsframework.hashtable;

import java.util.Hashtable;

public class ShallowCopy {
    public static void main(String[] args) {
        Hashtable<Integer, String> original = new Hashtable<>();
        original.put(1, "One");
        original.put(2, "Two");

        // Shallow copy
        Hashtable<Integer, String> shallowCopy = new Hashtable<>(original);
    }
}
