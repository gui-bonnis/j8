package j.j8.collectionsframework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainMethods {
    public static void main(String[] args) {
        AddElements();
        AccessingElements();
        RemovingElements();
        SizeAndCapacity();
        Iterating();
        ArrayConversion();
        SublistOperations();
        Sort();
        CheckElement();
    }

    private static void AddElements() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20, 1); //Inserts the specified element at the specified position in the list.
    }

    private static void AccessingElements() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        numbers.get(2);
        numbers.indexOf(2);
        numbers.lastIndexOf(1);
    }

    private static void RemovingElements() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.remove(2);
//        numbers.remove(2); // Object
        numbers.clear();
    }

    private static void SizeAndCapacity() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.size();
        numbers.isEmpty();
    }

    private static void Iterating() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
//        numbers.forEach(); //TODO: Research how to use a forEach with Consumer<? super E> action
        numbers.iterator(); //TODO: Research how to use an iterator
    }

    private static void ArrayConversion() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        Integer[] num = (Integer[]) numbers.toArray();
    }

    private static void SublistOperations() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.subList(1, 1);
    }

    private static void Sort() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

//        numbers.sort();  //TODO: Research how to do a Comparator<? super E> c
//        numbers.reverse(); //TODO: Research how to do a reverse sorting
    }

    private static void CheckElement() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        numbers.contains(10);
        numbers.contains(0);
    }
}
