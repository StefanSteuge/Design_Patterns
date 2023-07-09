public class Main {

    public static void main(String[] args) {

        Shape circle = Manager.getShape("circle");
        circle.draw();

        Shape square = Manager.getShape("square");
        square.draw();
    }

}
