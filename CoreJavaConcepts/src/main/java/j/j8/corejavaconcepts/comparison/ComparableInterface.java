package j.j8.corejavaconcepts.comparison;

public class ComparableInterface {
    public static void main(String[] args) {
        People p1 = new People();
        p1.age = 10;
        p1.name = "John";
        People p2 = new People();
        p2.age = 10;
        p2.name = "John";

        int areEqual = p1.compareTo(p2);
        System.out.println(areEqual);
    }

    public static class People implements Comparable<People> {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public int compareTo(People other) {
            return this.name.compareTo(other.name); // Compare by name
        }
    }
}
