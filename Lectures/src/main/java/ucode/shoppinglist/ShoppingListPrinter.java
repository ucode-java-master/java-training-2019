package ucode.shoppinglist;

import java.util.List;

public class ShoppingListPrinter {

    public void print(List<ShoppingItem> theListToPrint) {
        System.out.println("This Is Your List:");
        System.out.println("__________________");
        for (int i = 0; i < theListToPrint.size(); i++) {
            ShoppingItem printItem = theListToPrint.get(i);
            System.out.print("" + (i + 1) + ": ");
            format(printItem);
        }
        System.out.println("__________________");
    }

    public void format(ShoppingItem toPrintItem) {
        System.out.println("name: " + toPrintItem.getName() + "; quantity:" + toPrintItem.getQuantity() +
                (toPrintItem.isChecked() ? "; ok" : ""));

    }

}
