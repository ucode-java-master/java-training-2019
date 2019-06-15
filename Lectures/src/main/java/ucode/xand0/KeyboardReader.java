package ucode.xand0;

import java.util.Scanner;

public class KeyboardReader {

    private Scanner scanner;

    public KeyboardReader() {
        scanner = new Scanner(System.in);
    }

    public PlayerMove getNextMove(MatrixElement whoMakesAMove) {
        System.out.println();
        System.out.println("Give the next move for player " + whoMakesAMove + ":");
        System.out.println("input line:");
        int line = scanner.nextInt();

        System.out.println("input column:");
        int column = scanner.nextInt();

        return new PlayerMove(line, column);
    }

}
