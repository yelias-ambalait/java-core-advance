package arrays.inventoryManagementSystem;

public class Product {
    private String name;
    private String id;
    private double price;
    private int quantity;

    public Product(String name, String id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayProductDetails(){
        System.out.println("Product ID: "+id+ "\tProduct Name: "+name+ "\tProduct Price: "+price+ "\tQuantity: "+quantity);
    }
}
