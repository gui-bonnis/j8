package j.j8.collectionsframework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Initialization {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
    }
}
