package j.j8.collectionsframework.stack;

import java.io.*;

public class DeepCopy {
    public void main(String[] args) {
        // Create an instance of MyObject
        MyObject original = new MyObject(42);

        // Create a deep copy
        try {
            MyObject copy = original.deepCopy();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    class MyObject implements Serializable {
        private final int value;

        public MyObject(int value) {
            this.value = value;
        }

        // Perform a deep copy using serialization
        public MyObject deepCopy() throws IOException, ClassNotFoundException {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bis);

            return (MyObject) in.readObject();
        }
    }
}
