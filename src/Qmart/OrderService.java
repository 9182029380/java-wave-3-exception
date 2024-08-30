package Qmart;

public class OrderService {
    public void processorder(Order order) {
        if (order.getProduct() == null){
            throw new IllegalArgumentException("Product cannot be null");
        }
        String productname = order.getProduct().getName();
        System.out.println("Order processed: " + productname);
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Order order = new Order();
        orderService.processorder(order);
    }
}
