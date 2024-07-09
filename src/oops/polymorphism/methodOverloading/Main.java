package oops.polymorphism.methodOverloading;

public class Main {
    public static void main(String[] args){

        System.out.println("\n");
        Inventory inventory = new Inventory();
        inventory.addItem("Rice", 15.90);
        inventory.addItem("Programming With Java", 30.90, "Balaguru Shami");
        inventory.addItem("Apple Watch", 200.0, "Apple", 24);
        inventory.addItem("t-shirt", 10.50, "L", "Blue");
        inventory.displayItems();

        System.out.println("\n");
        Management m = new Management();
        m.addTeacher("Adam", 100);
        m.addTeacher("Computer Science", 101, "Fundamentals of Computer Science");
        m.addTeacher("Rose", 102, 2, 405);
        m.displayInfo();

    }
}
