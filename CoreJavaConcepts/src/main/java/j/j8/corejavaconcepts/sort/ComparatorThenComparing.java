package j.j8.corejavaconcepts.sort;

import j.j8.corejavaconcepts.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorThenComparing {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 30),
                new Person("Alice", 25),
                new Person("Richard", 35),
                new Person("Bob", 35)
        );

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(Collectors.toList());

        sortedPeople.forEach(System.out::println);
    }
}
