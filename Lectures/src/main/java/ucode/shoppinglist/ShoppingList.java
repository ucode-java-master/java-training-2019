package ucode.shoppinglist;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    List<ShoppingItem> shoppinglist = new ArrayList<>();

    public void print() {
        ShoppingListPrinter printer = new ShoppingListPrinter();
        printer.print(shoppinglist);
    }

    public void removeItem(int itemToDelete) { // primesc un intreg si vreau sa sterg un item din shopping list
        shoppinglist.remove(itemToDelete);
    }

    public void addToShoppingList(ShoppingItem b) {
        shoppinglist.add(b);
    }

    public void purchasedItem(int itemToMark) {
        ShoppingItem nume = shoppinglist.get(itemToMark);
        nume.setChecked(true);
    }

}

