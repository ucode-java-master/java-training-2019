package ucode.introduction.primenumbers;

/**
 * Use this class to start the application which prints prime numbers
 */
public class Main2 {

    /**
     * The main method is the entry point in any java application. When you execute the application, this is the first code that gets executed.
     */
    public static void main(String[] args) {

        // we initialize 2 variables, which will be our left and right boundaries in the interval
        int leftBoundary = 2;
        int rightBoundary = 30;

        // we need a PrimeNumbersPrinter. That class's responsibility is to print prime numbers between 2 numbers.
        // this is how we create one
        // creating a printer gives us a "physical" object which we can use. Until this point, PrimeNumbersPrinter is just a concept, we cannot touch it.
        PrimeNumbersPrinter printer = new PrimeNumbersPrinter();

        // now we need to use the actual functionality in our printer.
        printer.printNumbersBetween(leftBoundary, rightBoundary);
    }

}
