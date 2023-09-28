package j.j8.corejavaconcepts.comparison;

import j.j8.corejavaconcepts.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();// Populate the list
        person.add(new Person("Richard"));
        person.add(new Person("Mary"));
        person.add(new Person("John"));
        person.sort(Comparator.comparing(Person::getName)); // Sort by name

        person.forEach(System.out::println);
    }
}
