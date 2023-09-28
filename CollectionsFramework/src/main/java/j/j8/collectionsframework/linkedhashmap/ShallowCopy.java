package j.j8.collectionsframework.linkedhashmap;

import java.util.LinkedHashMap;

public class ShallowCopy {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> originalMap = new LinkedHashMap<>();
        // Populate originalMap with data

        LinkedHashMap<String, Integer> shallowCopy = new LinkedHashMap<>(originalMap);
    }
}
