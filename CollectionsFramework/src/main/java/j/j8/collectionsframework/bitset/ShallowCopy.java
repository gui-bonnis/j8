package j.j8.collectionsframework.bitset;

import java.util.BitSet;

public class ShallowCopy {
    public static void main(String[] args) {
        BitSet original = new BitSet(64);
        original.set(3);
        original.set(10);

        // Shallow copy (shares the same data)
        BitSet shallowCopy = (BitSet) original.clone();

        // Modifying the copies won't affect the original
        shallowCopy.clear(3);
    }
}
