package j.j8.concurrenceandmultithreading.multithread;

public class SynchronizedExample {

    private int counter = 0;

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // Create multiple threads that increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; 1000 > i; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; 1000 > i; i++) {
                example.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Counter: " + example.counter);
    }

    // Synchronized method
    public synchronized void increment() {
        counter++;
    }
}

