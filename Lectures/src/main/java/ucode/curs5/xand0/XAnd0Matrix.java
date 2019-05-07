package ucode.curs5.xand0;

public class XAnd0Matrix {

    private String[][] matrix;

    XAnd0Matrix() {
        matrix = new String[3][3];
        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                matrix[lineIterator][columnIterator] = " ";
            }
        }
    }

    public void makeMove(int line, int column, String element) {
        matrix[line][column] = element;
    }

    public boolean isGameWon(String element) {
        boolean result = false;
        if (matrix[0][2].equals(element) && matrix[1][1].equals(element) && matrix[2][0].equals(element)) {
            return true;
        }
        return false;
    }

    public void printMatrix() {
        System.out.println("---------------");
        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                System.out.print("| " + matrix[lineIterator][columnIterator] + " |");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }

}
