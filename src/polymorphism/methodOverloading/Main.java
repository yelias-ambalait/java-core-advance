package polymorphism.methodOverloading;

public class Main {
    public static void main(String[] args){

        Inventory inventory = new Inventory();
        inventory.addItem("Rice", 15.90);
        inventory.addItem("Programming With Java", 30.90, "Balaguru Shami");
        inventory.addItem("Apple Watch", 200.0, "Apple", 24);
        inventory.addItem("t-shirt", 10.50, "L", "Blue");
        inventory.displayItems();

    }
}
