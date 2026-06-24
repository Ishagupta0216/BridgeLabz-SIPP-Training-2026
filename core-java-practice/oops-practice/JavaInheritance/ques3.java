class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate,
                 String trackingNumber) {

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber,
                   String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class Main {
    public static void main(String[] args) {

        Order o = new Order(101, "20-Jun-2026");

        ShippedOrder so =
                new ShippedOrder(102,
                        "21-Jun-2026",
                        "TRK123");

        DeliveredOrder d =
                new DeliveredOrder(103,
                        "22-Jun-2026",
                        "TRK456",
                        "24-Jun-2026");

        System.out.println(o.getOrderStatus());
        System.out.println(so.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}