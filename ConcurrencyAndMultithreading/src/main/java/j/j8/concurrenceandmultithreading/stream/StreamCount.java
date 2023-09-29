package j.j8.concurrenceandmultithreading.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        // Create a stream from the list
        Stream<String> stream = names.stream();

        // Count the elements in the stream without interfering
        long count = stream.count();

        // The stream can still be used after counting
        List<String> filteredNames = stream
                .filter(name -> 4 < name.length())
                .collect(Collectors.toList());

        System.out.println("Total count: " + count);
        System.out.println("Filtered names: " + filteredNames);
    }
}
