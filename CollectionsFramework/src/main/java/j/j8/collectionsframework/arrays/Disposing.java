package j.j8.collectionsframework.arrays;

import j.j8.collectionsframework.People;

public class Disposing {
    private int[] intArray = new int[1000]; // When the MyClass instance is no longer referenced, intArray becomes eligible for garbage collection

    public static void main(String[] args) {
        disposalNullify();
        disposalMethodScope();
        disposalReassigningReference();
    }

    private static void disposalNullify() {

        People[] p = new People[2];
        p[0] = new People("John", 10);
        p[1] = new People("Michael", 13);

        p = null; // Nullify the reference

    }
    private static void disposalMethodScope() {

        People[] p = new People[2];
        p[0] = new People("John", 10);
        p[1] = new People("Michael", 13);

    } // When someMethod() exits, intArray goes out of scope

    private static void disposalReassigningReference() {

        People[] p = new People[2];
        p[0] = new People("John", 10);
        p[1] = new People("Michael", 13);

        p = new People[1];

    }

}
