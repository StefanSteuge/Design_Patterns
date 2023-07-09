package car;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int age;
    private int power;
    public Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.age = builder.age;
        this.power = builder.power;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }


    public static class Builder {
        private String brand;
        private String model;
        private String color;
        private int age;
        private int power;


        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Car build() {
            System.out.println("Car " + brand + " is build now...");
            return new Car(this);
        }
    }
}
