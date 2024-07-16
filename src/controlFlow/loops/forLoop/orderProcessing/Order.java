package controlFlow.loops.forLoop.orderProcessing;

public class Order {
    private int orderId;
    private String productName;
    private int quantity;

    public Order(int orderId, String productName, int quantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
    }
    public int getOrderId() {
        return orderId;
    }
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Order{"+
                "orderId="+orderId+
                ", productName="+productName+
                ", quantity="+quantity+
                "}";
    }
}
