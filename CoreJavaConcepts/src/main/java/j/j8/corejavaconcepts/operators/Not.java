package j.j8.corejavaconcepts.operators;

public class Not {
    public static void main(String[] args) {
        int a = 5;       // 0101 in binary
        int result = ~a;   // 1010 in binary (-6 in decimal, because Java uses two's complement representation)
        System.out.println(result);
    }
}
