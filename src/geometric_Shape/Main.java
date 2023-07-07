package geometric_Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        GeometricShape circle = factory.createShape("circle");
        circle.draw();

        GeometricShape square = factory.createShape("square");
        square.draw();
    }

}
