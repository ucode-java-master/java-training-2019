package ucode.curs5.shapes;

public class Main {
    public static void main(String[] args) {
        Shape anOrdinaryShape = new Square("shape");
        anOrdinaryShape = new Rectangle("a");
//        anOrdinaryShape.drawShape();

        DrawableShape mightBeARectangle = getShape("rectangle");
        mightBeARectangle.drawShape();

//        Shape alsoMightBeARectangle = new Shape("shape 2");
//        alsoMightBeARectangle.drawShape();

        Square thisIsDefinatelyASquare = new Square("square");
        thisIsDefinatelyASquare.drawShape();

        DrawableShape butThisIAmNotSureItsASquare = new Rectangle("rectangle 2");
        butThisIAmNotSureItsASquare.drawShape();

        ShapeFactory factory = new ShapeFactory();
        Shape aShape = factory.getShape("a");

        aShape.printName();
    }

    private static Rectangle getShape(String rectangle) {
        return new Rectangle(rectangle);
    }

}
