package j.j8.concurrenceandmultithreading.stream;

import j.j8.concurrenceandmultithreading.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", 12), new Person("Bob", 22), new Person("Charlie", 18), new Person("Charlie", 12));

        Map<String, List<Person>> peopleByName = people.stream()
                .collect(Collectors.groupingBy(Person::getName));

        Map<Boolean, List<Person>> adultsAndMinors = people.stream()
                .collect(Collectors.partitioningBy(person -> 18 <= person.getAge()));

        System.out.println(peopleByName);
        System.out.println(adultsAndMinors);

    }
}
