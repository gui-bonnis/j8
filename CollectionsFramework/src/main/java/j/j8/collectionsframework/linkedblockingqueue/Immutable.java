package j.j8.collectionsframework.linkedblockingqueue;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public final class Immutable<E> implements Iterable<E> {
    private final LinkedBlockingQueue<E> queue;

    public Immutable() {
        this.queue = new LinkedBlockingQueue<>();
    }

    private Immutable(LinkedBlockingQueue<E> queue) {
        this.queue = new LinkedBlockingQueue<>(queue);
    }

    // Factory method to create an immutable copy of an existing queue
    public static <E> Immutable<E> fromQueue(LinkedBlockingQueue<E> queue) {
        return new Immutable<>(queue);
    }

    // Add methods that expose read-only operations

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Iterator<E> iterator() {
        return Collections.unmodifiableCollection(queue).iterator();
    }

    // Any other read-only methods you want to expose

    // Note that you don't provide methods for modifying the queue.

    @Override
    public String toString() {
        return queue.toString();
    }

    // Additional methods if needed, such as equality checks

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;

        Immutable<?> that = (Immutable<?>) o;

        return queue.equals(that.queue);
    }

    @Override
    public int hashCode() {
        return queue.hashCode();
    }

    // If you want to provide a way to get an actual LinkedBlockingQueue (not recommended for immutability):
    public LinkedBlockingQueue<E> getMutableQueue() {
        return new LinkedBlockingQueue<>(queue);
    }
}

