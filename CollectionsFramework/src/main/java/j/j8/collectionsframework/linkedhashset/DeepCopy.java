package j.j8.collectionsframework.linkedhashset;

import java.util.HashMap;
import java.util.Map;

public class DeepCopy {
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();

        // Populate the original map
        HashMap<String, Integer> deepCopy = new HashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            deepCopy.put(String.valueOf(entry.getKey()), entry.getValue());
        }

    }
}
