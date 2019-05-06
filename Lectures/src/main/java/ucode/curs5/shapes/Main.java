package ucode.curs5.shapes;

public class Main {
    public static void main(String[] args) {
        Shape anOrdinaryShape = new Shape("shape");
//        anOrdinaryShape.drawShape();

        DrawableShape mightBeARectangle = new Rectangle("rectangle");
        mightBeARectangle.drawShape();

//        Shape alsoMightBeARectangle = new Shape("shape 2");
//        alsoMightBeARectangle.drawShape();

        Square thisIsDefinatelyASquare = new Square("square");
        thisIsDefinatelyASquare.drawShape();

        DrawableShape butThisIAmNotSureItsASquare = new Rectangle("rectangle 2");
        butThisIAmNotSureItsASquare.drawShape();
    }

}
