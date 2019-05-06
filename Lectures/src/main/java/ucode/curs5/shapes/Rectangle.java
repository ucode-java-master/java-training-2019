package ucode.curs5.shapes;

public class Rectangle extends Shape {

    public Rectangle(String shapeName) {
        super(shapeName);
    }

    @Override
    public void drawShape() {
        System.out.println("  Drawing the shape: " + shapeName);
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

}
