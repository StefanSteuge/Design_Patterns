package shapes;

public class ShapeAdapter implements Shape {

    private final ThirdPartyLibraryShape adaptee;

    public ShapeAdapter (ThirdPartyLibraryShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }
}
