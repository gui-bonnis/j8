package j.j8.collectionsframework.concurrentlinkedqueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Initialization {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Adding elements to the queue
        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");
    }
}
