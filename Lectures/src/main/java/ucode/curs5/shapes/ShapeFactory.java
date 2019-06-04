package ucode.curs5.shapes;

public class ShapeFactory {

    public Shape getShape(String shapeName) {
        return new Shape(shapeName);
    }

}
