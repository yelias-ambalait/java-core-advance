package polymorphism.methodOverloading;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void addItem( String name, double price, String author){
        items.add(new Book(name, price, author));
    }

    public void addItem(String name, double price, String brand, int warranty){
        items.add(new Electronics(name, price, brand, warranty));
    }

    public void addItem(String name, double price, String size, String color){
        items.add(new Cloths(name, price, size, color));
    }

    public void displayItems(){
        for(Item item : items){
            System.out.println(item.toString());
        }
    }
}
