package shapes;


public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();

        ThirdPartyLibraryShape libraryShape = new ThirdPartyLibraryShape();
        Shape adapterShape = new ShapeAdapter(libraryShape);
        adapterShape.draw();
    }

}
