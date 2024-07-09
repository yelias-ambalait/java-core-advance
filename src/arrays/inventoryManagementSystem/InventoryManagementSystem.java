package arrays.inventoryManagementSystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(2);

        Product product1 = new Product("Smart Watch", "sw01", 1200, 20);
        Product product2 = new Product("Normal Watch", "nw01", 200, 30);
        Product product3 = new Product("Apple Watch", "aw01", 12000, 10);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.displayAllProducts();

        System.out.println("\n");
        inventory.updateProduct("sw01", 1000, 30);
        inventory.displayAllProducts();

        inventory.removeProduct("aw01");
        inventory.displayAllProducts();
    }
}
