package j.j8.collectionsframework.linkedhashmap;

import java.util.LinkedHashMap;

public class Initialization {
    public static void main(String[] args) {
        // Instantiate a LinkedHashMap with a capacity of 10 and a load factor of 0.75 (default values)
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        LinkedHashMap<String, Integer> customLinkedHashMap = new LinkedHashMap<>(20, 0.8f);

    }
}
