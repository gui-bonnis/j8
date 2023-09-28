package j.j8.collectionsframework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeepCopy {
    public void main(String[] args) {
        Deque<Integer> original = new ArrayDeque<>();
        original.add(1);
        original.add(2);
        original.add(3);

        // Deep copy
        Deque<Integer> deepCopy = new ArrayDeque<>();
        for (Integer element : original) {
            deepCopy.add(element);
        }
    }
}
