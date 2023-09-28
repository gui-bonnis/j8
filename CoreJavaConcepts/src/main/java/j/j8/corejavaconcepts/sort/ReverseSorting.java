package j.j8.corejavaconcepts.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSorting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Eve");
        List<String> reverseSortedNames = names.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        reverseSortedNames.forEach(System.out::println);
    }
}
