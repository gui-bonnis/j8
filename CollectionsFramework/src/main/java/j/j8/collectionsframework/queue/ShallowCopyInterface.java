package j.j8.collectionsframework.queue;

public class ShallowCopyInterface {
    public void main(String[] args) {
        // Create an instance of MyObject
        MyObject original = new MyObject(42);

        // Create a shallow copy
        try {
            MyObject copy = (MyObject) original.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    class MyObject implements Cloneable {
        private final int value;

        public MyObject(int value) {
            this.value = value;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}