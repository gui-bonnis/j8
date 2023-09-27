package j.j8.collectionsframework.queue;

public class ShallowCopyConstructor {
    public void main(String[] args) {
        // Create an instance of MyObject
        MyObject original = new MyObject(42);

        // Create a shallow copy using the copy constructor
        MyObject copy = new MyObject(original);
    }

    class MyObject {
        private final int value;

        public MyObject(int value) {
            this.value = value;
        }

        // Copy constructor
        public MyObject(MyObject other) {
            this.value = other.value;
        }
    }
}