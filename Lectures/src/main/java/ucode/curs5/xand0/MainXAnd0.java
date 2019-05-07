package ucode.curs5.xand0;

import java.util.Scanner;

public class MainXAnd0 {

    public static void main(String[] args) {

        XAnd0Matrix matrix = new XAnd0Matrix();
        Scanner scanner = new Scanner(System.in);
        matrix.printMatrix();

        boolean isXPlaying = true;

        while (true) {

            System.out.println("input line:");
            int line = scanner.nextInt();

            System.out.println("input column:");
            int column = scanner.nextInt();

            System.out.println("input element:");
            scanner.nextLine();
            String element = scanner.nextLine();

            isXPlaying = !isXPlaying;
            if (element.equals("X") || element.equals("0")) {
                matrix.makeMove(line, column, element);
                matrix.printMatrix();
            }

            if (matrix.isGameWon("X")) {
                System.out.println("A CASTIGAT XXXXXX");
                break;
            }
            if (matrix.isGameWon("0")) {
                System.out.println("A CASTIGAT 000000");
                break;
            }

        }

    }

}
