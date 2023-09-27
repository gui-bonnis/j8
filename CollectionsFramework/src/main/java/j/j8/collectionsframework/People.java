package j.j8.collectionsframework;

public class People {
    private final String name;
    private final Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public People(People other) {
        this.name = other.name;
        this.age = other.age;
    }


}
