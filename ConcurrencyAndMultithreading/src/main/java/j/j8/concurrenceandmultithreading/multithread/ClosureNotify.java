package j.j8.concurrenceandmultithreading.multithread;

public class ClosureNotify {
    public static void main(String[] args) {
        getMktNewsRunnable(new Object());
    }

    private static Runnable getMktNewsRunnable(Object whoToNotify) {
        return () -> {
            // Do something
            whoToNotify.notify();
        };
    }
}
