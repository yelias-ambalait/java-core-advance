package polymorphism.methodOverriding;

public class Bag extends Product{

    private String color;

    public Bag(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + "\tPrice: " + getPrice() + "\tcolor: " + color);
    }
}
