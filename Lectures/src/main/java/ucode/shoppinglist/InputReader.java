package ucode.shoppinglist;

import java.io.InputStream;
import java.util.Scanner;

public class InputReader {

    private Scanner scanner;

    public InputReader(InputStream scanner) {
        this.scanner = new Scanner(scanner);
    }

    public int readOption() {
        int optionRead = scanner.nextInt();
        return optionRead;
    }

    public ShoppingItem readShoppingItem() {
        System.out.println("INTRODUCETI NUME");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("INTRODUCETI CANTITATEA");
        int quantity = scanner.nextInt();
        ShoppingItem a = new ShoppingItem();
        a.setName(name);
        a.setQuantity(quantity);
        return a;
    }

}
