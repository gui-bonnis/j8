package j.j8.collectionsframework.bitset;

import java.util.BitSet;

public class Disposing {
    BitSet original = new BitSet(64); // When the MyClass instance is no longer referenced, intArray becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {

        BitSet p = new BitSet(64);
        p.set(3);
        p.set(10);

        p = null; // Nullify the reference

    }

    private static void disposalMethodScope() {

        BitSet p = new BitSet(64);
        p.set(3);
        p.set(10);

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {

        BitSet p = new BitSet(64);
        p.set(3);
        p.set(10);

        p = new BitSet(64);

    }

}
