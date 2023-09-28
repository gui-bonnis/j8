package j.j8.collectionsframework.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class DeepCopy {
    public void main(String[] args) {
        IdentityHashMap<String, Integer> originalMap = new IdentityHashMap<>();

        // Populate the original map
        IdentityHashMap<String, Integer> deepCopy = new IdentityHashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            deepCopy.put(String.valueOf(entry.getKey()), entry.getValue());
        }
    }
}
