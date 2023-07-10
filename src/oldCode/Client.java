package oldCode;

public class Client {

    public static void main(String[] args) {
        LegacyPaymentProvider legacyPaymentProvider = new LegacyPaymentProviderImpl();
        PaymentProcessor processor = new PaymentAdapter(legacyPaymentProvider);
        processor.pay(100);
    }

}
