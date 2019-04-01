package ucode.introduction.primenumbers;

/**
 * In this class we are going print to the console all the numbers between a and b which are prime.
 */
public class PrimeNumbersPrinter {

    /**
     * Prints all the prime numbers in the interval [leftBoundary,rightBoundary). That means leftBoundary inclusive, rightBoundary exclusive. The inclusiveness
     * of leftBoundary is given by how our iterator is initialized (with leftBoundary). The exclusiveness of rightBoundary is given by how we compare the end
     * condition. We are comparing our iterator to be strictly lower than rightBoundary.
     *
     * @param leftBoundary  the left boundary of the interval
     * @param rightBoundary the right boundary of the interval
     */
    public void printNumbersBetween(int leftBoundary, int rightBoundary) {

        // in this line, we declare an iterator. The iterator's job is to go through all numbers, starting from leftBoundary to rightBoundary.
        for (int iterator = leftBoundary; iterator < rightBoundary; iterator++) {
            // when the iterator has another value, the next lines of code are executed

            // we need to see if our current number is a prime number or not.
            // we do that using the isPrime function. That function determines if a number is prime or not
            // if the answer of isPrime is true, the the number is prime
            if (isPrime(iterator)) {
                System.out.println("a prime number: " + iterator);
            }
        }
    }

    /**
     * This method tests if a number is prime or not. A number is prime if, in the interval [2, number) there is no number which is a divisor of our number.
     *
     * @param number the number to test if it is prime
     * @return a true or false response.
     */
    private boolean isPrime(int number) {

        // in this line, we declare an iterator, but we name it divisor.
        for (int divisor = 2; divisor < number; divisor++) {
            // We test if the number divides exactly to our divisor. That operation is done with the % sign (modulo sign)
            if (number % divisor == 0) {
                // if we found a divisor, there is no point in looking for other numbers. We will just return the false response.
                // When return is called, we exit the function
                return false;
            }
        }
        // after we exhausted all the possibilities, if we have not found a divisor, we should reach this point in the function.
        // we will return the true result, our number is prime.
        return true;
    }


}
