package j.j8.concurrenceandmultithreading;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name); // Compare by name
    }

    @Override
    public String toString() {
        return this.name;
    }
}
