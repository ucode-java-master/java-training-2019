package ucode.curs5.primenumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimePrinterFourth {

    private int firstNumber;
    private int secondNumber;
    private List<Integer> numbers;

    public PrimePrinterFourth(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        validateNumbers();
    }

    private void validateNumbers() {
        boolean isValid = true;
        if (firstNumber < 2) {
            isValid = false;
        }
        if (secondNumber < 2) {
            isValid = false;
        }
        if (firstNumber > secondNumber) {
            isValid = false;
        }
        if (!isValid) {
            throw new IllegalArgumentException("the numbers must be positive integers and the first number must be lower than the second number");
        }
    }

    public void constructNumbers() {
        numbers = new ArrayList<>();
        for (int iterator = firstNumber; iterator <= secondNumber; iterator++) {
            if (isPrime(iterator)) {
                numbers.add(iterator);
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

    public void printNumbers() {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        numbersPrinter.setPrimeNumbers(numbers);
        numbersPrinter.printNumbers();
    }

    public static void main(String[] args) {
        PrimePrinterFourth primes = new PrimePrinterFourth(2, 10);
        primes.constructNumbers();
        primes.printNumbers();
    }

}
