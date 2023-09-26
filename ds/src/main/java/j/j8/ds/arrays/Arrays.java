package j.j8.ds.arrays;

import j.j8.ds.People;

public class Arrays {
    public static void main(String[] args) {
        People[] p = new People[5];
        p[0] = new People("John", 10);
        p[1] = new People("Michael", 13);
        p[2] = new People("Richard", 15);
        p[3] = new People("Mary", 20);
        p[4] = new People("Ellen", 18);

        for (People people: p) {
            System.out.println(people);
        }
    }


}
