package j.j8.collectionsframework.treemap;

import java.util.Map;
import java.util.TreeMap;

public class DeepCopy {
    public static void main(String[] args) {
        TreeMap<Integer, String> original = new TreeMap<>();
        // ... populate original

        TreeMap<Integer, String> deepCopy = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : original.entrySet()) {
            deepCopy.put(entry.getKey(), entry.getValue());
        }

    }
}

