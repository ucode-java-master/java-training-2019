package ucode.introduction.oddnumbers;

/**
 * Use this class to start the application which prints odd numbers
 */
public class Main1 {

    /**
     * The main method is the entry point in any java application. When you execute the application, this is the first code that gets executed.
     */
    public static void main(String[] args) {

        // we initialize 2 variables, which will be our left and right boundaries in the interval
        int leftBoundary = 0;
        int rightBoundary = 10;

        // we need a OddNumbersPrinter. That class's responsibility is to print odd numbers between 2 numbers.
        // this is how we create one
        // creating a printer gives us a "physical" object which we can use. Until this point, OddNumbersPrinter is just a concept, we cannot touch it.
        OddNumbersPrinter printer = new OddNumbersPrinter();

        // now we need to use the actual functionality in our printer.
        printer.printNumbersBetween(leftBoundary, rightBoundary);
    }

}
