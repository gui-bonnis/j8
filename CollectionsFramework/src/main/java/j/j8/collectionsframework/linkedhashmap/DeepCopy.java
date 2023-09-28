package j.j8.collectionsframework.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeepCopy {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> originalMap = new LinkedHashMap<>();
        // Populate originalMap with data

        HashMap<String, Integer> deepCopy = new HashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            deepCopy.put(entry.getKey(), entry.getValue());
        }

    }
}
