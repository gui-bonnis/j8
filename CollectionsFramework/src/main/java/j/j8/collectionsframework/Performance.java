package j.j8.collectionsframework;

public class Performance {
    private static long startTime = 0L;

    public static void reset() {
        startTime = 0L;
    }
    public static void start() {
        startTime = System.currentTimeMillis();
    }
    public static void end() {
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to execute: " + elapsedTime + " milliseconds");
    }
}
