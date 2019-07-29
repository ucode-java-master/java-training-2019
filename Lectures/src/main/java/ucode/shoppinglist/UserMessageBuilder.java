package ucode.shoppinglist;

public class UserMessageBuilder {

    public static String printInputOptions() {
        StringBuilder builder = new StringBuilder();
        builder.append("Input your option:")
                .append("\n")
                .append("0: exit")
                .append("\n")
                .append("1: print the shopping list")
                .append("\n")
                .append("2: add new item in the list")
                .append("\n")
                .append("3: delete an item from the list")
                .append("\n")
                .append("4: mark item as purchased")
                .append("\n");

        return builder.toString();
    }

}
