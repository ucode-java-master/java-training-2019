package ucode.introduction.oddnumbers;

/**
 * In this class we are going print to the console all the numbers between a and b which are odd. Dictionary: odd = impar even = par
 */
public class OddNumbersPrinter {

    /**
     * Prints all the odd numbers in the interval [leftBoundary,rightBoundary). That means leftBoundary inclusive, rightBoundary exclusive. The inclusiveness of
     * leftBoundary is given by how our iterator is initialized (with leftBoundary). The exclusiveness of rightBoundary is given by how we compare the end
     * condition. We are comparing our iterator to be strictly lower than rightBoundary.
     *
     * @param leftBoundary  the left boundary of the interval
     * @param rightBoundary the right boundary of the interval
     */
    public void printNumbersBetween(int leftBoundary, int rightBoundary) {
        // in this line, we declare an iterator. The iterator's job is to go through all numbers, starting from leftBoundary to rightBoundary.
        for (int iterator = leftBoundary; iterator < rightBoundary; iterator++) {
            // when the iterator has another value, the next lines of code are executed

            // we need to see if our current number is an odd number or not.
            // we do that using the modulo sign. We divide our iterator by 2. If the remainder of the division is 0, then the number is odd. If the remainder
            // is 1, the the number is even
            if (iterator % 2 == 1) {
                System.out.println("an odd number: " + iterator);
            }
        }
    }

}
