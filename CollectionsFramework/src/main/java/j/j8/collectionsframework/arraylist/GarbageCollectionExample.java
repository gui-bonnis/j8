package j.j8.collectionsframework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Using 'numbers'
        numbers.add(42);

        // 'numbers' goes out of scope after this method
    }
}

