package ucode.curs5.shapes;

public class Shape {

    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public void drawShape() {
        System.out.println("  Drawing the shape: " + shapeName);
        System.out.println("              _________________                ");
        System.out.println("             /                 \\              ");
        System.out.println("            /                   \\             ");
        System.out.println("           |                     |             ");
        System.out.println("           |                     |             ");
        System.out.println("           |                     |             ");
        System.out.println("            \\                   /             ");
        System.out.println("             \\_________________/              ");
        System.out.println("                                               ");
    }

}
