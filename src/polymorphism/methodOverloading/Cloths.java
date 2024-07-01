package polymorphism.methodOverloading;

public class Cloths extends Item{

    String size, color;
    public Cloths(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String toString(){
        return "Cloths{ name= " + super.getName() + ", price= " + super.getPrice() + "$"+", size= " + size+", color= " + color+"}";
    }
}
