package j.j8.corejavaconcepts.comparison;

public class ReferenceEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = (str1 == str2);
        System.out.println(areEqual);
    }
}
