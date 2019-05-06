package ucode.curs5.shapes;

public class Shape {

    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public void printName() {
        System.out.println("  Drawing the shape: " + shapeName);
    }
}
