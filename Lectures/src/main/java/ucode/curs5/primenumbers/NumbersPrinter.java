package ucode.curs5.primenumbers;

import java.util.List;

public class NumbersPrinter {
    private List<Integer> primeNumbers;

    public void setPrimeNumbers(List<Integer> primeNumbers) {
        this.primeNumbers = primeNumbers;
    }

    public void printNumbers() {
        if (primeNumbers == null) {
            throw new IllegalStateException("No numbers to print");
        }

        for (Integer number : primeNumbers) {
            System.out.println(number);
        }
    }

}