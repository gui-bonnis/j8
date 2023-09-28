package j.j8.collectionsframework.bitset;

import java.util.BitSet;

public class DeepCopy {
    public static void main(String[] args) {
        BitSet original = new BitSet(64);
        original.set(3);
        original.set(10);

        // Deep copy (manually copying the bits)
        BitSet deepCopy = new BitSet(original.size());
        deepCopy.or(original);

        // Modifying the copies won't affect the original
        deepCopy.clear(10);
    }
}
