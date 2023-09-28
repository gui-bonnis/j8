package j.j8.corejavaconcepts.comparison;

import j.j8.corejavaconcepts.Person;

public class EqualsMethod {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        p1.setName("John");
        Person p2 = new Person();
        p2.setAge(10);
        p2.setName("John");

        boolean areEqual = p1.equals(p2);
        System.out.println(areEqual);
    }


}
