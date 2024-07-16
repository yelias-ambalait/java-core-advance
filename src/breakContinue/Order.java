package breakContinue;

public class Order {
    private String name;
    private String status;

    public Order(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
