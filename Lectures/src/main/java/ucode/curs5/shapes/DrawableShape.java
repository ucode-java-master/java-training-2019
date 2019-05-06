package ucode.curs5.shapes;

public class DrawableShape extends Shape {

    public DrawableShape(String shapeName) {
        super(shapeName);
    }

    public void drawShape() {
        printName();
        printShape();
    }

    protected void printShape(){
        System.out.println("I am not implemented");
    }

}
