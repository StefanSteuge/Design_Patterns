package Order;

import java.util.List;

public class Order {

    private String orderId;
    private String client;
    private String shippingAddress;
    private int phoneNumber;
    private List<String> items;
    private boolean isPaid;

    public Order(Builder builder) {
        this.orderId = builder.orderId;
        this.client = builder.client;
        this.shippingAddress = builder.shippingAddress;
        this.phoneNumber = builder.phoneNumber;
        this.items = builder.items;
        this.isPaid = builder.isPaid;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getClient() {
        return client;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getItems() {
        return items;
    }

    public boolean isPaid() {
        return isPaid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", client='" + client + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", items=" + items +
                ", isPaid=" + isPaid +
                '}';
    }

    public static class Builder {

        private String orderId;
        private String client;
        private String shippingAddress;
        private int phoneNumber;
        private List<String> items;
        private boolean isPaid;

        public Builder(String orderId, String client) {
            this.orderId = orderId;
            this.client = client;
        }

        public Builder shippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder items(List<String> items) {
            this.items = items;
            return this;
        }

        public Builder isPaid(boolean isPaid) {
            this.isPaid = isPaid;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

}
