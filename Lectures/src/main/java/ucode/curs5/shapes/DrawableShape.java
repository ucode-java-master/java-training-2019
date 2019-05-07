package ucode.curs5.shapes;

public abstract class DrawableShape extends Shape {

    public DrawableShape(String shapeName) {
        super(shapeName);
    }

    public final void drawShape() {
        printName();
        printShape();
    }

    protected abstract void printShape();

}
