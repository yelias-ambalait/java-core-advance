package collectionFramework.CollectionCapC.Set.HashSet.uniqueProductCodeInventory;

import java.util.HashSet;

public class InventorySystem {
    HashSet<String> productSKUs;

    public InventorySystem() {
        productSKUs = new HashSet<>();
    }
    public boolean addProduct(String sku) {
        return productSKUs.add(sku);
    }
    public boolean isProductInInventory(String sku) {
        return productSKUs.contains(sku);
    }
    public boolean removeProduct(String sku) {
        return productSKUs.remove(sku);
    }
    public void displayAllProducts() {
        System.out.println("Product SKUs: " + productSKUs);
    }
}
