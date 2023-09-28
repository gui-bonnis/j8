package j.j8.collectionsframework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePerformance {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);

        // Measure the time to add elements to the deque
        long startTime = System.nanoTime();
        for (int i = 0; 1000000 > i; i++) {
            deque.addLast(i);
        }
        long endTime = System.nanoTime();
        long writeTime = endTime - startTime;

        // Measure the time to retrieve elements from the deque
        startTime = System.nanoTime();
        while (!deque.isEmpty()) {
            Integer element = deque.removeFirst();
        }
        endTime = System.nanoTime();
        long readTime = endTime - startTime;

        System.out.println("Write Time: " + writeTime + " ns");
        System.out.println("Read Time: " + readTime + " ns");
    }
}
