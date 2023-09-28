package j.j8.collectionsframework.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class Performance {
    public static void main(String[] args) {
        Map<String, Integer> identityMap = new IdentityHashMap<>();

        // Measure insertion time
        long startTime = System.currentTimeMillis();
        for (int i = 0; 100000 > i; i++) {
            identityMap.put("key" + i, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Insertion Time: " + (endTime - startTime) + " ms");

        // Measure retrieval time
        startTime = System.currentTimeMillis();
        for (int i = 0; 100000 > i; i++) {
            identityMap.get("key" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Retrieval Time: " + (endTime - startTime) + " ms");
    }
}
