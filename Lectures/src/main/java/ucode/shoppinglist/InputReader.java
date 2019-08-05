package ucode.shoppinglist;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    private Scanner scanner;

    public InputReader(InputStream scanner) {
        this.scanner = new Scanner(scanner);
    }

    public int readOption() {
        return readInt();
    }

    public int readInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" try again");
                scanner.nextLine();
            }
        }
    }

    public String readString() {
        scanner.nextLine();
        return scanner.nextLine();
    }

}
