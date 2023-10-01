package j.j8.concurrenceandmultithreading.multithread;

import j.j8.concurrenceandmultithreading.multithread.classes.PortfolioVolatile;

public class Kill {
    public static void main(String[] args) {
        PortfolioVolatile p = new PortfolioVolatile("Portfolio data");
        p.start();
        // Some code implementation business logic goes here

        int i = 0;
        do {
            System.out.println(" i= " + i++);
        } while (100 > i);
        // and now it's time to kill the thread
        p.stopMe();
    }
}

