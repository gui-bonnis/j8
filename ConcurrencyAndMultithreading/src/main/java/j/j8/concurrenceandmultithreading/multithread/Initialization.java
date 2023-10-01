package j.j8.concurrenceandmultithreading.multithread;

import j.j8.concurrenceandmultithreading.multithread.classes.MarketNews;
import j.j8.concurrenceandmultithreading.multithread.classes.MarketNews2;
import j.j8.concurrenceandmultithreading.multithread.classes.Portfolio;
import j.j8.concurrenceandmultithreading.multithread.classes.Portfolio2;

public class Initialization {
    public static void main(String[] args) {
        extend();
        inherit();
        lambda();
    }

    private static void extend() {
        MarketNews mn = new MarketNews("Market News");
        mn.start();
        Portfolio p = new Portfolio("Portfolio data");
        p.start();
        System.out.println("TestThreads is finished");
    }

    private static void inherit() {
        MarketNews2 mn2 = new MarketNews2();
        // passing Runnable object to a constructor
        Thread mn = new Thread(mn2, "Market News");
        mn.start();
        Runnable port2 = new Portfolio2();
        // passing Runnable object to a constructor
        Thread p = new Thread(port2, "Portfolio Data");
        p.start();
        System.out.println("TestThreads2 is finished");
    }

    private static void lambda() {
        Thread mn = new Thread(() -> System.out.println(
                "The stock market is improving!"), "Market News");
        mn.start();
        Thread p = new Thread(() -> System.out.println(
                "You have 500 shares of IBM"), "Portfolio Data");
        p.start();
        System.out.println("TestThreads2Lambda is finished");
    }
}

