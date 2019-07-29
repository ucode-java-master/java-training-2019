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
                    ShoppingItem b = inputReader.readShoppingItem();
                    shoppinglist.addToShoppingList(b);

                    break;
                case 3:
                    System.out.println("third option");
                    break;
                case 4:
                    System.out.println("fourth option");
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

}
