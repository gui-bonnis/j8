package j.j8.collectionsframework;

public class Performance {
    private static long startTime = 0L;

    public static void reset() {
        startTime = 0L;
    }
    public static void startNanosecond() {
        startTime = System.nanoTime();
    }
    public static void endNanoseconds() {
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to execute: " + elapsedTime + " nanoseconds");
    }
    public static void startMillisecond() {
        startTime = System.currentTimeMillis();
    }
    public static void endMilliseconds() {
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to execute: " + elapsedTime + " milliseconds");
    }
}
