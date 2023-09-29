package j.j8.concurrenceandmultithreading.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoining {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        String concatenatedNames = names.stream()
                .collect(Collectors.joining(", ", "Names: [", "]"));

        System.out.println(concatenatedNames);
    }
}
