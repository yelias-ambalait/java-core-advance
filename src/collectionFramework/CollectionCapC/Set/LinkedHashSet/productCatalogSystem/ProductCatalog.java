package collectionFramework.CollectionCapC.Set.LinkedHashSet.productCatalogSystem;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    public String toString() {
        return "Product{name='" + productName + "', productId='" + productId + "'}";
    }
}

public class ProductCatalog {
    private Set<Product> viewedProducts;

    public ProductCatalog() {
        this.viewedProducts = new LinkedHashSet<>();
    }

    public void addViewedProduct(Product product) {
        if (viewedProducts.contains(product)) {
            viewedProducts.remove(product);
        }
        viewedProducts.add(product);
    }

    public void addProducts() {
        Scanner scanner = new Scanner(System.in);
        boolean addMore = true;
        while (addMore) {
            System.out.println("Enter product id:");
            String productId = scanner.nextLine();
            System.out.println("Enter product name:");
            String productName = scanner.nextLine();

            Product product = new Product(productId, productName);
            addViewedProduct(product);

            System.out.println("Do you want to add more product? ((yes/no) or (y/n))");
            String response = scanner.nextLine().toLowerCase();
            addMore = response.equals("yes") || response.equals("y");

        }

    }

    public void displayViewedProduct() {
        if (viewedProducts.isEmpty()) {
            System.out.println("No product is viewed");
        } else {
            System.out.println("Recently viewed product:");
            for (Product product : viewedProducts) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProducts();
        catalog.displayViewedProduct();
    }

}
