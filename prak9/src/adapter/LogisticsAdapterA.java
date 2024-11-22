package adapter;

public class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA externalService;
    public LogisticsAdapterA(ExternalLogisticsServiceA externalService) {
        this.externalService = externalService;
    }
    @Override
    public void deliverOrder(String orderId) {
        int itemId = Integer.parseInt(orderId); // Пример преобразования ID
        externalService.shipItem(itemId);
    }
    @Override
    public String getDeliveryStatus(String orderId) {
        int shipmentId = Integer.parseInt(orderId);
        return externalService.trackShipment(shipmentId);
    }
}

