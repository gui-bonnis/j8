package j.j8.collectionsframework.hashset;

import java.io.*;
import java.util.HashSet;

public class DeepCopy {
    public void main(String[] args) {
        // Create an original HashSet with custom objects
        HashSet<MyClass> originalSet = new HashSet<>();
        originalSet.add(new MyClass(1));
        originalSet.add(new MyClass(2));

// Deep copy using serialization
        HashSet<MyClass> deepCopy = new HashSet<>();
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(originalSet);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bis);

            deepCopy = (HashSet<MyClass>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Create a custom class that implements Serializable
    class MyClass implements Serializable {
        private final int value;

        public MyClass(int value) {
            this.value = value;
        }
    }
}
