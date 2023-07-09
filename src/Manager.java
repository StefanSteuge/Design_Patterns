import java.util.HashMap;
import java.util.Map;

public class Manager {
    private static final Map<String, Shape> shapeMap = new HashMap<String, Shape>();

    static {
        shapeMap.put("circle", new Circle());
        shapeMap.put("square", new Square());
    }

    public static Shape getShape(String shapeType) {
        Shape cachedShape = shapeMap.get(shapeType);
        return (Shape) cachedShape.clone();
    }
}
