package polymorphism.methodOverriding;

public class Main {

    public static void main(String[] args) {

        ProductStore p = new ProductStore();
        p.addProduct(new Product("Watch", 1100));
        p.addProduct(new Bag("Travel bag", 690, "Gray"));
        p.displayInfo();

    }
}
