package adapter;

public class InternalDeliveryService implements IInternalDeliveryService {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Delivering order " + orderId + " via internal service.");
    }
    @Override
    public String getDeliveryStatus(String orderId) {
        return "Status of order " + orderId + " via internal service.";
    }
}
