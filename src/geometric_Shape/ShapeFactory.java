package geometric_Shape;

public class ShapeFactory {   //Фабричний метод

    public GeometricShape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

}
