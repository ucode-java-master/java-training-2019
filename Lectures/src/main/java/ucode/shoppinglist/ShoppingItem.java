package ucode.shoppinglist;

public class ShoppingItem {
    private int quantity;
    private String name;
    private boolean checked;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShoppingItem{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", checked=" + checked +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public static ShoppingItem buildShoppingItem(String name, int quantity) {
        ShoppingItem item = new ShoppingItem();
        item.setQuantity(quantity);
        item.setName(name);
        return item;
    }

}
