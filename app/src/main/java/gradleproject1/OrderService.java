package gradleproject1;

public class OrderService {

    private OrderProcessor op;
    private PaymentProcessor pp;

    public OrderService(OrderProcessor op, PaymentProcessor pp) {
        this.op = op;
        this.pp = pp;
    }
    public void processOrder(Order order){
     pp.processPayment(order);
     op.processOrder(order);
    }
}
