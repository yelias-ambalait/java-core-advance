package arrays.inventoryManagementSystem;

public class Inventory {
    private Product[] products;
    private int productCount;

    public Inventory(int capacity) {
        this.products = new Product[capacity];
        this.productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
            System.out.println("Product added: "+product.getName());
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    public void displayAllProducts(){
        for(int i = 0; i<productCount; i++){
            products[i].displayProductDetails();
        }
    }

    public void updateProduct(String id, double newPrice, int newQuantity) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId().equals(id)) {
                products[i].setPrice(newPrice);
                products[i].setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Product is not found.");
    }

    public void removeProduct(String id) {
        for(int i = 0; i<productCount; i++){
            if(products[i].getId().equals(id)){
                System.out.println("Removing product: "+products[i].getName());
                for(int j = i; j<productCount-1; j++){
                    products[j] = products[j+1];
                }
                products[productCount-1] = null;
                productCount--;
                return;
            }
        }
        System.out.println("Product not found: "+id);
    }
}
