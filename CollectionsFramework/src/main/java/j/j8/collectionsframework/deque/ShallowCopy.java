package j.j8.collectionsframework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShallowCopy {
    public static void main(String[] args) {
        Deque<Integer> original = new ArrayDeque<>();
        original.add(1);
        original.add(2);
        original.add(3);

// Shallow copy
        Deque<Integer> shallowCopy = new ArrayDeque<>(original);
    }
}
