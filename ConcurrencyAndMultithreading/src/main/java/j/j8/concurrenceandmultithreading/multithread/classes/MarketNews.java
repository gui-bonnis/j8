package j.j8.concurrenceandmultithreading.multithread.classes;

public class MarketNews extends Thread {
    public MarketNews(String threadName) {
        super(threadName); // name your thread
    }

    public void run() {
        System.out.println("The stock market is improving!");
    }
}
