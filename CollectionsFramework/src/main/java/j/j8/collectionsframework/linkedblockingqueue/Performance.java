package j.j8.collectionsframework.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class Performance {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(1000);

        long startTime = System.nanoTime();

        // Perform some write operations
        for (int i = 0; 1000 > i; i++) {
            try {
                queue.put(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long endTime = System.nanoTime();
        long writeTime = endTime - startTime;

        startTime = System.nanoTime();

        // Perform some read operations
        for (int i = 0; 1000 > i; i++) {
            try {
                int value = queue.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        endTime = System.nanoTime();
        long readTime = endTime - startTime;

        System.out.println("Write time (ns): " + writeTime);
        System.out.println("Read time (ns): " + readTime);

    }
}
