package Order;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      Order order = new Order.Builder("first", "Steven")
              .phoneNumber(1560987)
              .items(Arrays.asList("item1", "item2", "item3"))
              .shippingAddress("Lviv 79053")
              .isPaid(true)
              .build();
        System.out.println("Welcome to Order" + order.toString());

      Order secondOrder = new Order.Builder("second", "Eugene")
              .isPaid(false)
              .build();
        System.out.println("Welcome to Order" + secondOrder);
    }

}
