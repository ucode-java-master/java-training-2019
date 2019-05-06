package ucode.curs5.shapes;

public class Square extends Shape {

    public Square(String shapeName) {
        super(shapeName);
    }

    @Override
    public void drawShape() {
        System.out.println("  Drawing the shape: " + shapeName);
        System.out.println("            ________________              ");
        System.out.println("           |                |             ");
        System.out.println("           |                |             ");
        System.out.println("           |                |             ");
        System.out.println("           |                |             ");
        System.out.println("           |                |             ");
        System.out.println("           |                |             ");
        System.out.println("           |________________|             ");
        System.out.println("                                          ");
    }

}
