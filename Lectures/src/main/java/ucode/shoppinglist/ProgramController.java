package ucode.shoppinglist;

public class ProgramController {

    private InputReader inputReader;

    public ProgramController() {
        inputReader = new InputReader(System.in);
    }

    public void startApplication() {

        ShoppingList shoppinglist = new ShoppingList();

        int option = -1;

        while (option != 0) {


            System.out.println(UserMessageBuilder.printInputOptions());

            option = inputReader.readOption();

            switch (option) {
                case 1:
                    shoppinglist.print();
                    break;
                case 2:
                    ShoppingItem b = readShoppingItem();
                    shoppinglist.addToShoppingList(b);

                    break;
                case 3:
                    System.out.println(" insert the element you want to erase!");

                    int itemToDelete = inputReader.readInt() - 1;
                    try {
                        shoppinglist.removeItem(itemToDelete);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(" wrong element. Try again!");
                    }
                    break;
                case 4:
                    System.out.println(" insert the element you want to buy!");

                    int itemToMark = inputReader.readInt() - 1;
                    shoppinglist.purchasedItem(itemToMark);

                    break;
                case 0:
                    System.out.println("Program will exit now! Good bye!");
                    break;
                default:
                    System.out.println("Unrecognized option. Please try again!");
            }
            System.out.println();
        }

    }

    public ShoppingItem readShoppingItem() {

        System.out.println("INTRODUCETI NUME");
        String name = inputReader.readString();

        System.out.println("INTRODUCETI CANTITATEA");
        int quantity = inputReader.readInt();

        return ShoppingItem.buildShoppingItem(name, quantity);
    }

}
