package j.j8.concurrenceandmultithreading.multithread.classes;

public class PortfolioVolatile extends Thread {
    private volatile Thread stopMe;
//    The variable stopMe has been declared with a volatile keyword, which warns the Java compiler that another
//    thread can modify it, and that this variable shouldn’t be cached in the CPU’s registers, so all threads must always
//    see its fresh value

    public PortfolioVolatile(String threadName) {
        super(threadName);
    }

    public void stopMe() {
        stopMe = null;
    }

    public void run() {
        stopMe = Thread.currentThread();
        while (stopMe == Thread.currentThread()) {
            //Do some portfolio processing here
            System.out.println("The Portfolio thread is running");
        }
        System.out.println("The Portfolio thread was killed");
    }
}
