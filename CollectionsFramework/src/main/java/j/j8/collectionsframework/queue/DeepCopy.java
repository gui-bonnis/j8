package j.j8.collectionsframework.queue;

public class DeepCopy {
    public void main(String[] args) {
        // Create a deep copy
        MyComplexObject original = new MyComplexObject();
        MyComplexObject deepCopy = new MyComplexObject(original);
    }

    class MyComplexObject implements Cloneable {
        int value;
        AnotherObject anotherObject;

        public MyComplexObject() {

        }

        // Copy constructor for deep copy
        public MyComplexObject(MyComplexObject original) {
            this.value = original.value;
            this.anotherObject = new AnotherObject(original.anotherObject);
        }
    }

    class AnotherObject {
        int anotherValue;

        public AnotherObject(AnotherObject original) {
            this.anotherValue = original.anotherValue;
        }
    }

}
