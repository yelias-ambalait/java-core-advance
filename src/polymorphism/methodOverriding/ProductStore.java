package polymorphism.methodOverriding;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {
    List<Product> products;

    public ProductStore(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void displayInfo(){

        for(Product product : products){
            product.display();
        }
    }
}