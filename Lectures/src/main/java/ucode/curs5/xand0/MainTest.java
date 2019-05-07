package ucode.curs5.xand0;

public class MainTest {
    public static void main(String[] args) {
        XAnd0Matrix theMatrix = new XAnd0Matrix();
        theMatrix.printMatrix();
        theMatrix.makeMove(2, 2, "x");
        theMatrix.printMatrix();
    }

}
