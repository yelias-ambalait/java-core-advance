package oops.polymorphism.methodOverloading;

public class Electronics extends Item {
    private String brand;
    private int warrantyMonths;

    public Electronics(String name, double price, String brand, int warrantyMonths) {
        super(name, price);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }
    @Override
    public String toString(){
        return "Electronics{name: " + super.getName() + ", price: " + super.getPrice() + "$"+", brand: " + brand + ", warrantyMonths: " + warrantyMonths+"}";
    }
}
