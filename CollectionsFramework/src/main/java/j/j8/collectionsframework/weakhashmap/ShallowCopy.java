package j.j8.collectionsframework.weakhashmap;

import java.util.WeakHashMap;

public class ShallowCopy {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> originalMap = new WeakHashMap<>();
        originalMap.put("one", 1);
        originalMap.put("two", 2);

        WeakHashMap<String, Integer> shallowCopy = new WeakHashMap<>(originalMap);

    }
}
