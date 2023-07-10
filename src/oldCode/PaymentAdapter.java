package oldCode;

public class PaymentAdapter implements PaymentProcessor {

    private LegacyPaymentProvider legacyPaymentProvider;

    public PaymentAdapter(LegacyPaymentProvider legacyPaymentProvider) {
        this.legacyPaymentProvider = legacyPaymentProvider;
    }

    @Override
    public void pay(double amount) {
        legacyPaymentProvider.processPayment(amount);
    }
}
