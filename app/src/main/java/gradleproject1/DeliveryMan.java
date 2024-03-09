package gradleproject1;

public class DeliveryMan extends User {

    public DeliveryMan(String id, String fname, String lname, String address) {
        super(id, fname, lname, address);
    }

    public void deliver(Order order) {
        order.is_deliverd = true;
    }
}
