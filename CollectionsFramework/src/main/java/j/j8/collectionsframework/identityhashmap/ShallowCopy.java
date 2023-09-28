package j.j8.collectionsframework.identityhashmap;

import java.util.IdentityHashMap;

public class ShallowCopy {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> originalMap = new IdentityHashMap<>();

        // Populate the originalMap
        IdentityHashMap<String, Integer> shallowCopy = new IdentityHashMap<>(originalMap);
    }
}
