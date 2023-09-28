package j.j8.collectionsframework.treemap;

import java.util.TreeMap;

public class ShallowCopy {
    public static void main(String[] args) {
        TreeMap<Integer, String> original = new TreeMap<>();
        // ... populate original

        TreeMap<Integer, String> shallowCopy = new TreeMap<>(original);
    }
}

