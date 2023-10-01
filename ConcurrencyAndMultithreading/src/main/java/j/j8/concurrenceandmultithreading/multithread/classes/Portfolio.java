package j.j8.concurrenceandmultithreading.multithread.classes;

public class Portfolio extends Thread {
    public Portfolio(String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println("You have 500 shares of IBM");
    }
}