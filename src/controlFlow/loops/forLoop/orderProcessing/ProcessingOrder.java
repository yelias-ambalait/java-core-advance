package controlFlow.loops.forLoop.orderProcessing;

import java.util.ArrayList;
import java.util.List;

public class ProcessingOrder {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Laptop", 20));
        orders.add(new Order(2, "Mouse", 30));
        orders.add(new Order(3, "Keyboard", 10));

        for (Order order : orders) {
            System.out.println("Processing order " + order);
        }
    }

}
