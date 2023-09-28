package j.j8.collectionsframework.bitset;

import java.util.BitSet;

public class MainMethods {
    public static void main(String[] args) {
        // Create a BitSet with an initial size of 16 bits
        BitSet bitSet = new BitSet(16);

        // Set some bits
        bitSet.set(2);   // Set bit at index 2 to true
        bitSet.set(5);   // Set bit at index 5 to true
        bitSet.set(10);  // Set bit at index 10 to true

        // Check if a bit is set
        boolean isSet2 = bitSet.get(2);   // Should be true
        boolean isSet3 = bitSet.get(3);   // Should be false

        // Clear a bit
        bitSet.clear(5);  // Set bit at index 5 to false

        // Check if a bit is set after clearing
        boolean isSet5 = bitSet.get(5);   // Should be false

        // Toggle a bit
        bitSet.flip(10);  // Toggle bit at index 10

        // Check if a bit is set after toggling
        boolean isSet10 = bitSet.get(10); // Should be false

        // Find the cardinality (number of set bits)
        int cardinality = bitSet.cardinality(); // Should be 2

        // Set all bits to true
        bitSet.set(0, 16); // Set all bits from index 0 to 15 to true

        // Find the next set bit starting from a given index
        int nextSetBit = bitSet.nextSetBit(0); // Should be 0

        // Find the next clear bit starting from a given index
        int nextClearBit = bitSet.nextClearBit(0); // Should be 16

        // Logical AND operation with another BitSet
        BitSet anotherBitSet = new BitSet(16);
        anotherBitSet.set(5);
        bitSet.and(anotherBitSet); // Perform AND operation with anotherBitSet

        // Logical OR operation with another BitSet
        bitSet.or(anotherBitSet); // Perform OR operation with anotherBitSet

        // Logical XOR operation with another BitSet
        bitSet.xor(anotherBitSet); // Perform XOR operation with anotherBitSet

        // Printing the BitSet, its cardinality, next set bit, and next clear bit
        System.out.println("BitSet: " + bitSet);
        System.out.println("Cardinality: " + cardinality);
        System.out.println("Next Set Bit: " + nextSetBit);
        System.out.println("Next Clear Bit: " + nextClearBit);
    }
}
