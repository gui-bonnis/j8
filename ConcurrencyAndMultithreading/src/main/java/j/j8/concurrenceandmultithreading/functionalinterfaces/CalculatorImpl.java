package j.j8.concurrenceandmultithreading.functionalinterfaces;

public class CalculatorImpl {
    public static void main(String[] args) {
        // Implementation using lambda expression
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        int result1 = addition.calculate(5, 3);
        int result2 = subtraction.calculate(8, 2);

        System.out.println("Addition Result: " + result1);
        System.out.println("Subtraction Result: " + result2);
    }
}
