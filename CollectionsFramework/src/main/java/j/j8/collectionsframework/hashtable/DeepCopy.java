package j.j8.collectionsframework.hashtable;

import java.util.Hashtable;

public class DeepCopy {
    public void main(String[] args) {
        Hashtable<Integer, String> original = new Hashtable<>();
        original.put(1, "One");
        original.put(2, "Two");

        // Deep copy (assuming values are mutable)
        Hashtable<Integer, String> deepCopy = new Hashtable<>();
        for (Integer key : original.keySet()) {
            deepCopy.put(key, original.get(key));
        }
    }
}
