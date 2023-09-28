package j.j8.collectionsframework.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class ShallowCopy {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> originalQueue = new LinkedBlockingQueue<>();
        originalQueue.add(1);
        originalQueue.add(2);

        // Shallow copy
        LinkedBlockingQueue<Integer> shallowCopy = new LinkedBlockingQueue<>(originalQueue);
    }
}
