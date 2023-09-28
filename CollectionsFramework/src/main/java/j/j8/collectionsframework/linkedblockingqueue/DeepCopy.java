package j.j8.collectionsframework.linkedblockingqueue;

import java.io.*;
import java.util.concurrent.LinkedBlockingQueue;

public class DeepCopy {
    public void main(String[] args) {
        // Create an original LinkedBlockingQueue with custom objects
        LinkedBlockingQueue<MyClass> originalSet = new LinkedBlockingQueue<>();
        originalSet.add(new MyClass(1));
        originalSet.add(new MyClass(2));

        // Deep copy using serialization
        LinkedBlockingQueue<MyClass> deepCopy = new LinkedBlockingQueue<>();
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(originalSet);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bis);

            deepCopy = (LinkedBlockingQueue<MyClass>) in.readObject();
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
