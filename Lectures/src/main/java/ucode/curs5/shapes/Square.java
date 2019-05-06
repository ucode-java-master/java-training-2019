package ucode.curs5.shapes;

public class Square extends DrawableShape {

    public Square(String shapeName) {
        super(shapeName);
    }

    @Override
    public void printShape() {
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
