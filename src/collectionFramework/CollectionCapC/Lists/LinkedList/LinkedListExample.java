package collectionFramework.CollectionCapC.Lists.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.add("John");
        students.add("Doe");
        students.addLast("Tony");
        students.addFirst("Adam");
        students.add(3, "Smith");
        System.out.println(students);
    }
}
