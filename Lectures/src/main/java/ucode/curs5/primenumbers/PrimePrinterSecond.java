package ucode.curs5.primenumbers;

public class PrimePrinterSecond {

    private int firstNumber;
    private int secondNumber;

    public PrimePrinterSecond(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void printNumbers() {
        for (int iterator = firstNumber; iterator <= secondNumber; iterator++) {
            if (isPrime(iterator)) {
                System.out.println(iterator);
            }
        }
    }

    private boolean isPrime(int iterator) {
        for (int divisor = 2; divisor < iterator; divisor++) {
            if (iterator % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new PrimePrinterSecond(1, 10).printNumbers();
    }

}
