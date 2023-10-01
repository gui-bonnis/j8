Certainly! Multithreading is a powerful and essential concept in Java, especially in Java 8 and beyond, where it plays a
crucial role in optimizing application performance and responsiveness. In this explanation, I'll cover the basics of
multithreading in Java 8 and provide some practical examples to help you understand the concept better.

**What is Multithreading?**
Multithreading is a concurrent execution mechanism that allows a Java program to run multiple threads simultaneously. A
thread is the smallest unit of execution within a process. By using multiple threads, a program can perform multiple
tasks concurrently, taking advantage of the available CPU cores and improving the application's efficiency.

**Advantages of Multithreading:**

1. **Improved Performance**: Multithreading can lead to better CPU utilization by allowing multiple tasks to run
   concurrently.

2. **Responsiveness**: It can enhance user experience by preventing the application from becoming unresponsive while
   performing time-consuming operations.

3. **Simplified Code**: In some cases, multithreading can simplify code by dividing complex tasks into smaller,
   manageable threads.

**Creating Threads in Java:**
In Java, you can create threads in two main ways: by extending the `Thread` class or by implementing the `Runnable`
interface. The latter is the preferred way because it allows you to separate the thread's behavior from the thread
itself, promoting better code organization and reusability.

Here's an example of creating a thread by implementing `Runnable`:

```java
public class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Start the thread
    }
}
```

**Java 8 and Lambda Expressions:**
Java 8 introduced lambda expressions, which make it easier to work with threads and functional interfaces. You can
create threads and execute tasks with concise syntax using lambda expressions. Here's an example:

```java
// Using lambda expression to create a thread
Thread thread=new Thread(()->{
        // Code to be executed in the thread
        });
        thread.start(); // Start the thread
```

**Thread States:**
Threads in Java go through various states during their lifecycle. The main thread states are:

- **New**: A newly created thread that has not yet started.
- **Runnable**: A thread that is ready to run but not necessarily running.
- **Running**: A thread currently executing its code.
- **Blocked**: A thread that is waiting for a resource to become available.
- **Terminated**: A thread that has finished executing.


- BLOCKED: Thread state for a thread that is blocked and waiting to enter or reenter a synchronized method or block of
  code
- NEW: Thread state for a thread that has been instantiated but not started yet
- RUNNABLE: Thread state for a runnable thread
- TERMINATED: Thread state for a terminated thread
- TIMED_WAITING: Thread state for a waiting thread with a specified waiting time
- WAITING: Thread state for a waiting thread

**Thread Synchronization:**
When multiple threads access shared resources concurrently, you might encounter synchronization issues, such as race
conditions. Java provides synchronization mechanisms like `synchronized` blocks and `Lock` interfaces to ensure that
only one thread accesses a critical section of code at a time, preventing data corruption and unexpected behavior.

```java
public synchronized void synchronizedMethod(){
        // Synchronized code block
        // Only one thread can execute this method at a time
        }
```

**Java 8 Parallel Streams:**
In Java 8, you can also leverage parallel streams to perform operations on collections in a multithreaded manner.
Parallel streams automatically split the data and distribute tasks among available threads, making it easier to take
advantage of multiple cores for parallel processing.

```java
List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8);

// Using parallel stream for parallel processing
        int sum=numbers.parallelStream()
        .mapToInt(Integer::intValue)
        .sum();
```

In summary, multithreading is a vital concept in Java 8 and beyond, allowing you to improve application performance,
responsiveness, and resource utilization. By creating and managing threads, understanding thread states, and using
synchronization mechanisms, you can harness the power of multithreading to build efficient and responsive Java
applications. Additionally, Java 8's lambda expressions and parallel streams simplify the process of working with
threads and concurrent operations.

**THREAD PRIORITIES**
Single-processor computers use a special scheduling algorithm that allocates processor time slices to the running
threads based on their priorities. If Thread1 is using the processor and the higher-priority Thread2 wakes up,
Thread1 is pushed aside and Thread2 gets the CPU. It is said that Thread2 preempts Thread1.
The class Thread has a method, setPriority(), that allows you to control its priority. There are 10 different
priorities, which are final integer variables defined in the class Thread. Some of them are named constants
MIN_PRIORITY, NORM_PRIORITY, and MAX_PRIORITY. Here’s an example of their usage:

```java
Thread myThread=new Thread("Portfolio");
        myThread.setPriority(Thread.NORM_PRIORITY+1);
```

If two threads with the same priority need the processor, it’ll be given to one of them using an algorithm specific
to the computer’s operating system

## Synchronization & Racing

During the design stage of a multithreaded application’s development, you should consider the possibility of a
so-called race condition, which happens when multiple threads need to modify the same program resource at the
same time (concurrently)

Certainly! The `synchronized` keyword in Java is used to create synchronized blocks and methods, which help manage locks
to ensure that only one thread can access a critical section of code at a time. Here's an example of using
the `synchronized` keyword to manage a lock:

```java
public class SynchronizedExample {

    private int counter = 0;

    // Synchronized method
    public synchronized void increment() {
        counter++;
    }

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
}
```

In this example:

1. We have a class `SynchronizedExample` with an instance variable `counter` that we want to increment safely by
   multiple threads.

2. We define a synchronized method `increment()` using the `synchronized` keyword. This means that only one thread can
   execute this method at a time, ensuring that the `counter` is updated safely.

3. In the `main` method, we create two threads (`thread1` and `thread2`) that both call the `increment` method to
   increment the `counter` by 1000 each.

4. We start both threads using the `start()` method and then wait for them to finish using the `join()` method to ensure
   that we print the final value of the `counter` only after both threads have completed their work.

By using the `synchronized` keyword on the `increment` method, we guarantee that only one thread can execute this method
at any given time, preventing race conditions and ensuring that the counter is incremented safely. This is a basic
example of using synchronization to manage locks in Java.

When a synchronized block is executed, the section of the code in parentheses is locked and can’t be used by
any other thread until the lock is released.

## Join Threads.

Now let’s consider a scenario in which you need to start multiple threads and continue program execution only when all
threads are complete. You may have several threads that need to wait for each other’s completion. The Thread class has a
method, join(), that you can use in this case.

## ReentrantLock Versus Synchronized

The package java.util.concurrent.locks includes the class ReentrantLock, which can be used as a replacement for the
synchronized keyword. Using it gives you more flexibility, and it can be used across methods. The idea is to place a
lock (invoke lock()) before the section of your program that may cause a race condition, and to remove the lock
afterward.

```java
private Lock accountLock=new ReentrantLock();
        witdrawCash(int accountID,int amount){
        // Some thread-safe code goes here, e.g. reading from
        // a file or a database
        accountLock.lock(); // place a lock here
        try{
        if(allowTransaction){
        updateBalance(accountID,amount, “Withdraw”);
        }else{
        System.out.println(“Not enough money on the account”);
        }
        }finally{
        accountLock.unlock(); //allow other threads to update balance
        }
        }
```

Note that the lock has to be removed in the finally section to ensure that unlocking always gets executed, even if there
is an exception thrown from the try block. When the code is unlocked it can be given to one of the waiting threads. The
class ReentrantLock has an overloaded constructor with a boolean argument—if you specify true while creating the lock,
the control is given to the longest-waiting thread.

## Executor Framework

Creating threads by subclassing Thread or implementing Runnable works, but there are certain shortcomings to these
approaches. First, the method run() cannot return a value. Second, an application may spawn so many threads that it can
take up all the system resources, and if this happens the application will stop functioning. In other words, you need to
be able to control the number of threads allowed for each application.

You can overcome the first shortcoming by using the Callable interface, and the second one by using classes from the
Executor framework. The Executors class spawns the threads from Runnable objects, ExecutorService knows how to create
Callable threads, and ScheduledExecutorService allows you to schedule threads for future execution.

The utility class Executors has static methods that enable you to create an appropriate executor. In particular, its
method newFixedThreadPool() creates a pool of threads of a specified size. For example, Executors.newFixedThreadPool(5)
gives you an instance of ExecutorService that automatically supports a pool of not more than five threads. If all five
threads are busy when a request to create a new thread comes in, that request waits until one of the running threads
completes. Using thread pools ensures that you can control system resources better.

If you need a thread to **return some data on completion**, create a class that implements the Callable interface and
defines a method call() that plays the same role as run() in Runnable. In this case you need to create threads
differently; the class Thread doesn’t take a Callable object as an argument. The class Executors comes to the rescue: it
offers a number of static methods that create a thread from your Callable class and return the result of its execution
packaged inside the special object implementing the interface Future

The method call() is defined with a parameterized value (remember generics?):

```java
public interface Callable<V> {
    V call() throws Exception;
}
```
