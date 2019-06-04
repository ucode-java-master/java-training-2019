package ucode.curs5.shapes;

public class ShapeFactory2 extends ShapeFactory {
    @Override
    public DrawableShape getShape(String shapeName) {
        return new Rectangle(shapeName);
    }

}
