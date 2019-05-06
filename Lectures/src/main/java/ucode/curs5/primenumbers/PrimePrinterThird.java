package ucode.curs5.primenumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimePrinterThird {

    private int firstNumber;
    private int secondNumber;
    private List<Integer> numbers;

    public PrimePrinterThird(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
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
        PrimePrinterThird primes = new PrimePrinterThird(1, 10);
        primes.constructNumbers();
        primes.printNumbers();
    }

}
