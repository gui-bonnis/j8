package j.j8.concurrenceandmultithreading.multithread;

public class JoinThreads {
    public static void main(String[] args) {
// Lambda expression for Market News
        Runnable mn = () -> {
            try {
                for (int i = 0; 10 > i; i++) {
                    Thread.sleep(1000); // sleep for 1 second
                    System.out.println("The market is improving " + i);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()
                        + e);
            }
        };
// Lambda expression for Portfolio
        Runnable port = () -> {
            try {
                for (int i = 0; 10 > i; i++) {
                    Thread.sleep(700); // Sleep for 700 milliseconds
                    System.out.println("You have " + (500 + i) +
                            " shares of IBM");
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()
                        + e);
            }
        };
        Thread marketNews = new Thread(mn, "Market News");
        Thread portfolio = new Thread(port, "Portfolio data");
        marketNews.start();
        portfolio.start();
        try {
            marketNews.join();
            portfolio.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The main method of TestThreads3LambdaJoin is finished");
    }
}

