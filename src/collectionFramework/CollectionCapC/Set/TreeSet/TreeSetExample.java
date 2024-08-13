package collectionFramework.CollectionCapC.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        TreeSet<Integer> numbers = new TreeSet<>();

        fruits.add("Elderberry");
        fruits.add("Banana");
        fruits.add("Carrot");
        fruits.add("Dragon fruit");
        fruits.add("Apple");

        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(6);
        numbers.add(8);
        numbers.add(8);

        System.out.println(fruits.size());
        System.out.println(numbers.size());
        System.out.println("Fruits list: " + fruits);
        System.out.println("Numbers: " + numbers);
    }
}
