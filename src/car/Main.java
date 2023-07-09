package car;

public class Main {

    public static void main(String[] args) {
        Car toyota = new Car.Builder("Toyota","Camry")
                .age(2023)
                .color("black")
                .power(158)
                .build();

        Car mercedes = new Car.Builder("Mercedes","MLS")
                .age(2023)
                .color("white")
                .build();

    }

}
