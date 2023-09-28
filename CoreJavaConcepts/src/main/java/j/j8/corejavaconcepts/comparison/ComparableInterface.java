package j.j8.corejavaconcepts.comparison;

import j.j8.corejavaconcepts.Person;

public class ComparableInterface {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        p1.setName("John");
        Person p2 = new Person();
        p2.setAge(10);
        p2.setName("John");

        int areEqual = p1.compareTo(p2);
        System.out.println(areEqual);
    }
}
