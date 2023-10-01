package j.j8.concurrenceandmultithreading.multithread.classes;

public class MarketNews3 implements Runnable {
    Object parent;

    public MarketNews3(Object whoToNotify) {
        parent = whoToNotify;
    }

    public void run() {
        // Do some lengthy processing here
        synchronized (parent) {
            parent.notify(); // send notification to the waiting thread
        }
    }
}
