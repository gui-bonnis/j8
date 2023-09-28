package j.j8.corejavaconcepts.sort;

import java.util.Arrays;
import java.util.List;

public class ListSortComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Eve");
        names.sort((s1, s2) -> s1.compareTo(s2));
        names.forEach(System.out::println);
    }
}
