package ucode.xand0;

public class Printer {

    public static void printMatrix(XAnd0Matrix xAnd0Matrix) {
        MatrixElement[][] matrix = xAnd0Matrix.getMatrix();
        System.out.println("-----------------");
        System.out.println("    0    1    2  ");
        System.out.println("-----------------");
        for (int lineIterator = 0; lineIterator < 3; lineIterator++) {
            System.out.print(lineIterator + " ");
            for (int columnIterator = 0; columnIterator < 3; columnIterator++) {
                System.out.print("| " + matrix[lineIterator][columnIterator] + " |");
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void printGameWon(MatrixElement x) {
        System.out.println();
        System.out.println();
        System.out.println("Congratulations!!!! The game was won by " + x);
        System.out.println();
    }

    public static void printGameEven() {
        System.out.println();
        System.out.println();
        System.out.println("It's a draw!!!");
        System.out.println();
    }


    public static void printIllegalMove() {
        System.out.println("The move is illegal. Please try again! ");
    }

    public static void printScore(Score score) {
        System.out.println();
        System.out.println("The score is: " + score);
        System.out.println();
    }

}
