package collectionFramework.CollectionCapC.Lists.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("BlackBerry");
        fruits.add("Coconuts");
        fruits.add("Mango");
        fruits.add("Pineapple");

        System.out.println(fruits);

        fruits.add(1, "Banana");
        fruits.add(4, "Grapes");


        System.out.println("\nAfter adding fruits: ");
        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println("Before removing size: "+fruits.size());
        fruits.remove(2);
        System.out.println("After removing size: "+fruits.size());

        System.out.println(fruits);

//        set() method is used to alter the item according to the index number
        fruits.set(1, "Blackberry");
        System.out.println(fruits);

//        get() method is used to retrieve item using the index number
        System.out.println(fruits.get(1));

//        contains() method is used to check if item is available or not. returns true if available or false if not
        System.out.println("Is Banana available? "+fruits.contains("Banana"));
        System.out.println("Is Apple available? "+fruits.contains("Apple"));
    }
}
