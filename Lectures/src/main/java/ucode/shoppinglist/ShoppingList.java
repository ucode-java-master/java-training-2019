package ucode.shoppinglist;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    List<ShoppingItem> shoppinglist = new ArrayList<>();

    public void print() {
        System.out.println("This Is Your List:");
        System.out.println("__________________");
        for (int i = 0; i < shoppinglist.size(); i++) {
            ShoppingItem printItem = shoppinglist.get(i);
            format(printItem);
        }
        System.out.println("__________________");
    }

    public void addToShoppingList(ShoppingItem b) {
        shoppinglist.add(b);
    }

    public void format(ShoppingItem toPrintItem) {
        System.out.println("name: " + toPrintItem.getName() + "; quantity:" + toPrintItem.getQuantity());
    }

}

