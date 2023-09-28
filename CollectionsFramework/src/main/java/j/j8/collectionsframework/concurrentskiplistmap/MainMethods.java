package j.j8.collectionsframework.concurrentskiplistmap;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class MainMethods {
    public static void main(String[] args) {
        // Create a ConcurrentSkipListMap with Integer keys and String values
        ConcurrentSkipListMap<Integer, String> skipListMap = new ConcurrentSkipListMap<>();

        // Adding elements
        skipListMap.put(1, "One");
        skipListMap.put(3, "Three");
        skipListMap.put(2, "Two");

        // Printing the map
        System.out.println("ConcurrentSkipListMap: " + skipListMap);

        // Accessing elements
        System.out.println("Value for key 2: " + skipListMap.get(2));

        // Checking if the map contains a key
        System.out.println("Contains key 4: " + skipListMap.containsKey(4));

        // Checking if the map contains a value
        System.out.println("Contains value 'One': " + skipListMap.containsValue("One"));

        // Removing an element
        skipListMap.remove(3);

        // Iterating over the map
        System.out.println("Iterating over the map:");
        for (Map.Entry<Integer, String> entry : skipListMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting the first and last entry
        System.out.println("First entry: " + skipListMap.firstEntry());
        System.out.println("Last entry: " + skipListMap.lastEntry());

        // Getting the lower and higher entries
        System.out.println("Lower entry for key 2: " + skipListMap.lowerEntry(2));
        System.out.println("Higher entry for key 2: " + skipListMap.higherEntry(2));

        // Ceiling and floor entries
        System.out.println("Ceiling entry for key 2: " + skipListMap.ceilingEntry(2));
        System.out.println("Floor entry for key 2: " + skipListMap.floorEntry(2));

        // Submap
        System.out.println("Submap from key 1 to key 2: " + skipListMap.subMap(1, 3));
    }
}
