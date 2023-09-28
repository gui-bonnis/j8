package j.j8.corejavaconcepts.comparison;

import java.util.Objects;

public class ObjectsEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = Objects.equals(str1, str2);
        System.out.println(areEqual);
    }
}
