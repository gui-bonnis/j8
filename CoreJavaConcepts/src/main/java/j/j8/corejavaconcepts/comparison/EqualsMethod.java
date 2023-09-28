package j.j8.corejavaconcepts.comparison;

import java.util.Objects;

public class EqualsMethod {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "John";
        Person p2 = new Person();
        p2.age = 10;
        p2.name = "John";

        boolean areEqual = p1.equals(p2);
        System.out.println(areEqual);
    }

    public static class Person {
        private String name;
        private int age;

        // Constructors, getters, setters, and other methods...

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // Same reference
            if (null == obj || getClass() != obj.getClass()) return false; // Different classes
            Person person = (Person) obj; // Cast to the same class
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

}
