package oldCode;

public class LegacyPaymentProviderImpl implements LegacyPaymentProvider {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment using old code..." + amount);
    }
}
