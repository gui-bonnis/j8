package j.j8.concurrenceandmultithreading.multithread;

public class TestLambdaWaitNotify {

//    The value of the variable is just the code returned by the method getMktNewsRunnable(). It’s important to
//    notice that this code just uses the variable whoToNotify from the outer method even though it was not declared
//    inside the lambda expression! So the inner function “remembers” that when it was created, there was someone
//    in the neighborhood named whoToNotify. This is the essence of the concept of closures, which remember the
//    context they were declared in.

//    The variables from outer scope are inferred to be final and are immutable; you can’t modify them. Even though
//    I never declared the variable whoToNotify as final, it is final.

    private static Runnable getMktNewsRunnable(Object whoToNotify) {
        // returning a closure
        return () -> {
            try {
                for (int i = 0; 10 > i; i++) {
                    Thread.sleep(1000); // sleep for 1 second
                    System.out.println("The market is improving " + i);
                }
                synchronized (whoToNotify) {
                    whoToNotify.notify(); // send notification to parent
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()
                        + e);
            }
        };
    }

    public static void main(String[] args) {
        TestLambdaWaitNotify thisInstance = new TestLambdaWaitNotify();
        Runnable mktNewsRunnable = getMktNewsRunnable(thisInstance);
        Thread marketNews = new Thread(mktNewsRunnable, "");
        marketNews.start();
        synchronized (thisInstance) {
            try {
                thisInstance.wait(20000); // wait for up to 20 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(
                "The main method of TestLambdaWaitNotify is finished");
    }
}