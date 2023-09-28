package j.j8.corejavaconcepts.comparison;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>();// Populate the list
        people.add(new People("Richard"));
        people.add(new People("Mary"));
        people.add(new People("John"));
        people.sort(Comparator.comparing(People::getName)); // Sort by name

        people.forEach(System.out::println);
    }

    public static class People {
        private final String name;

        public People(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
