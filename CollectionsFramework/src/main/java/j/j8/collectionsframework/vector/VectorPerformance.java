package j.j8.collectionsframework.vector;

import java.util.Vector;

public class VectorPerformance {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        long startTime = System.nanoTime();

        // Writing
        for (int i = 0; 1000000 > i; i++) {
            vector.add(i);
        }

        long endTime = System.nanoTime();
        long writeTime = endTime - startTime;

        // Reading
        startTime = System.nanoTime();

        for (int i = 0; i < vector.size(); i++) {
            int element = vector.get(i);
        }

        endTime = System.nanoTime();
        long readTime = endTime - startTime;

        System.out.println("Write time: " + writeTime + " ns");
        System.out.println("Read time: " + readTime + " ns");
    }
}
