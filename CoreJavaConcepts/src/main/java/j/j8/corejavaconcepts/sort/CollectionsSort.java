package j.j8.corejavaconcepts.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "Eve"));
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        names.forEach(System.out::println);
    }
}
