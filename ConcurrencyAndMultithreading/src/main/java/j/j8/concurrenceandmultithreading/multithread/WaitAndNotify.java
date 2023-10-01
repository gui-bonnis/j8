package j.j8.concurrenceandmultithreading.multithread;

import j.j8.concurrenceandmultithreading.multithread.classes.MarketNews3;

public class WaitAndNotify {

    public static void main(String[] args) {
        waiting();
        notifyThread();
    }

    private static void waiting() {
        TestLambdaWaitNotify thisInstance = new TestLambdaWaitNotify();
        synchronized (thisInstance) {
            try {
                thisInstance.wait(20000); // wait for up to 20 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The main method of TestLambdaWaitNotify is finished");

    }

    private static void notifyThread() {
        INotify notify = new INotify();
        MarketNews3 marketNews3 = new MarketNews3(notify);
    }

    private static class INotify {

    }

    private static class TestLambdaWaitNotify {
    }
}
