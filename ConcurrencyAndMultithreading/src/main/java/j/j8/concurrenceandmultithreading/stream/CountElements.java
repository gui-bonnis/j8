package j.j8.concurrenceandmultithreading.stream;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class CountElements {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        AtomicLong count = new AtomicLong(0);

        names.stream()
                .filter(name -> {
                    boolean containsA = name.contains("a");
                    if (containsA) {
                        count.incrementAndGet();
                    }
                    return containsA;
                })
                .forEach(name -> System.out.println("Filtered name: " + name));

        System.out.println("Total count: " + count.get());
    }
}
