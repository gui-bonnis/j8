package j.j8.collectionsframework.hashmap;

import java.util.HashMap;

public class ShallowCopy {
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        // Populate the original map
        HashMap<String, Integer> shallowCopy = new HashMap<>(originalMap);
    }
}
