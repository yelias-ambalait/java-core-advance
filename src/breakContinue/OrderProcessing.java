package breakContinue;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessing {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("order1", "valid"));
        orders.add(new Order("order2", "valid"));
        orders.add(new Order("order3", "invalid"));
        orders.add(new Order("order4", "priority"));
        orders.add(new Order("order5", "invalid"));
        orders.add(new Order("order6", "valid"));

        for (Order order : orders) {
            if (order.getStatus().equalsIgnoreCase("invalid")) {
                System.out.println("Skipping invalid order: "+order.getName());
                continue;
            }

            System.out.println("Processing order: "+order.getName());

            if (order.getStatus().equalsIgnoreCase("priority")) {
                System.out.println("Priority order found. Stopping further processing.");
                break;
            }
        }
        System.out.println("Order processing completed.");
    }
}
