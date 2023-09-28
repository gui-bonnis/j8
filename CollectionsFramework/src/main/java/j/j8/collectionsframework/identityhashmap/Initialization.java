package j.j8.collectionsframework.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class Initialization {
    public static void main(String[] args) {
        // Instantiate an IdentityHashMap
        Map<String, Integer> identityMap = new IdentityHashMap<>();

        // Add key-value pairs
        identityMap.put("one", 1);
        identityMap.put("two", 2);

        // Access values
        System.out.println(identityMap.get("one")); // Output: 1
    }
}
