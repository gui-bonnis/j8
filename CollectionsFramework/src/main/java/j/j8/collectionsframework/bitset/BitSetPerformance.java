package j.j8.collectionsframework.bitset;

import java.util.BitSet;

public class BitSetPerformance {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(1000000);

        long startTime = System.currentTimeMillis();

        // Writing (setting) operations
        bitSet.set(100);
        bitSet.set(500);
        // ...

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken for writing: " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();

        // Reading operations
        boolean isSet = bitSet.get(100);
        // ...

        endTime = System.currentTimeMillis();

        System.out.println("Time taken for reading: " + (endTime - startTime) + " milliseconds");
    }
}

