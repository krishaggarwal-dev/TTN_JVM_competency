package Beyond_Java8.Question8;

enum OrderStatus {
    pending,
    processing,
    shipped,
    delivered,
    cancelled,
    refunded
}
public class Main {
    static String processOrderStatus(OrderStatus status){
        return switch(status){
            case pending -> "Order awaiting confirmation.";

            case processing -> "Order being prepared.";

            case shipped -> {
                String message = "Order dispatched.";
                yield message;
            }
            case delivered -> "Order successfully delivered.";

            case cancelled -> "Order canceled.";

            case refunded ->{
                yield "Refund issued.";
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(Main.processOrderStatus(OrderStatus.pending));
        System.out.println(Main.processOrderStatus(OrderStatus.shipped));

    }
}
