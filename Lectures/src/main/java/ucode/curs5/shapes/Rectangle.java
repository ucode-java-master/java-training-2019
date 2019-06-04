package ucode.curs5.shapes;

public class Rectangle extends DrawableShape {

    public Rectangle(String shapeName) {
        super(shapeName);
    }

    @Override
    public void printShape() {
        System.out.println("            _________________________          ");
        System.out.println("           |                         |         ");
        System.out.println("           |                         |         ");
        System.out.println("           |                         |         ");
        System.out.println("           |                         |         ");
        System.out.println("           |                         |         ");
        System.out.println("           |                         |         ");
        System.out.println("           |_________________________|         ");
        System.out.println("                                               ");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }

    public void iamarectangle() {

    }

}
