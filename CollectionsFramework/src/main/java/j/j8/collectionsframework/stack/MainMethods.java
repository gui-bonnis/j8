package j.j8.collectionsframework.stack;

import java.util.Stack;

public class MainMethods {
    public static void main(String[] args) {
        // Create a new Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the stack
        System.out.println("Stack: " + stack);

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop and print elements from the stack
        while (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
        }

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
