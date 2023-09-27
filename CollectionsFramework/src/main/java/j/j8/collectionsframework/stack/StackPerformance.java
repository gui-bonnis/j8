package j.j8.collectionsframework.stack;

import java.util.Stack;

public class StackPerformance {
    public static void main(String[] args) {
        // Create a new Stack
        Stack<Integer> stack = new Stack<>();

        // Measure the time to push elements onto the stack
        long startTimePush = System.nanoTime();
        for (int i = 0; 1000000 > i; i++) {
            stack.push(i);
        }
        long endTimePush = System.nanoTime();

        // Calculate the time taken to push elements
        long pushTime = endTimePush - startTimePush;
        System.out.println("Time taken to push elements: " + pushTime + " nanoseconds");

        // Measure the time to pop elements from the stack
        long startTimePop = System.nanoTime();
        while (!stack.isEmpty()) {
            stack.pop();
        }
        long endTimePop = System.nanoTime();

        // Calculate the time taken to pop elements
        long popTime = endTimePop - startTimePop;
        System.out.println("Time taken to pop elements: " + popTime + " nanoseconds");
    }
}

