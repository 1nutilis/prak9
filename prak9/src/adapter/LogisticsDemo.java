package adapter;

public class LogisticsDemo {
    public static void main(String[] args) {
        IInternalDeliveryService internalService = new InternalDeliveryService();
        internalService.deliverOrder("123");
        System.out.println(internalService.getDeliveryStatus("123"));

        ExternalLogisticsServiceA externalServiceA = new ExternalLogisticsServiceA();
        IInternalDeliveryService adapterA = new LogisticsAdapterA(externalServiceA);
        adapterA.deliverOrder("456");
        System.out.println(adapterA.getDeliveryStatus("456"));
    }
}
