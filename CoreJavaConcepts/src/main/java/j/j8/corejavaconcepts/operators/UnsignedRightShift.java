package j.j8.corejavaconcepts.operators;

public class UnsignedRightShift {
    public static void main(String[] args) {
        int a = -5;      // 11111111111111111111111111111011 in binary
        int result = a >>> 2;  // 00111111111111111111111111111110 in binary (1073741822 in decimal)
        System.out.println(result);
    }
}
