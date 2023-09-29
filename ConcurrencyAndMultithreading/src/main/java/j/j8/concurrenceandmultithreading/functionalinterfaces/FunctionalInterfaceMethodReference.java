package j.j8.concurrenceandmultithreading.functionalinterfaces;

public class FunctionalInterfaceMethodReference {
    public static void main(String[] args) {
        // Implementation using method references
        Calculator multiplication = FunctionalInterfaceMethodReference::multiply;
        Calculator division = FunctionalInterfaceMethodReference::divide;

        int result3 = multiplication.calculate(4, 6);
        System.out.println("Multiplication Result: " + result3);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
