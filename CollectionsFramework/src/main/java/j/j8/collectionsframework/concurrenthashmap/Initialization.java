package j.j8.collectionsframework.concurrenthashmap;

import java.util.concurrent.ConcurrentSkipListMap;

public class Initialization {
    public static void main(String[] args) {
// Instantiate a ConcurrentSkipListMap with Integer keys and String values
        ConcurrentSkipListMap<Integer, String> skipListMap = new ConcurrentSkipListMap<>();

// Adding elements
        skipListMap.put(1, "One");
        skipListMap.put(3, "Three");
        skipListMap.put(2, "Two");
    }
}
