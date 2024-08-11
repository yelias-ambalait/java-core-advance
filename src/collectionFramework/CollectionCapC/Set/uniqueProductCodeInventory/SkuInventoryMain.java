package collectionFramework.CollectionCapC.Set.uniqueProductCodeInventory;

public class SkuInventoryMain {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.addProduct("SKU-123");
        inventorySystem.addProduct("SKU-124");
        inventorySystem.addProduct("SKU-154");
        inventorySystem.addProduct("SKU-123");

        System.out.println("Is SKU-124 product in inventory? "+inventorySystem.isProductInInventory("SKU-124"));
        System.out.println("Is SKU-1298 product in inventory? "+inventorySystem.isProductInInventory("SKU-1298"));

        inventorySystem.displayAllProducts();
    }
}
