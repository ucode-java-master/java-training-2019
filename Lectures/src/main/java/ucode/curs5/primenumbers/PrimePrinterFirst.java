package ucode.curs5.primenumbers;

public class PrimePrinterFirst {

    private int firstNumber;
    private int secondNumber;

    public PrimePrinterFirst(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void printNumbers() {
        for (int iterator = firstNumber; iterator <= secondNumber; iterator++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < iterator; divisor++) {
                if (iterator % divisor == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(iterator);
            }
        }
    }

    public static void main(String[] args) {
        new PrimePrinterFirst(1, 10).printNumbers();
    }

}
