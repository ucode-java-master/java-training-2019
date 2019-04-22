package ucode.curs4;

public class Exemplu {

    static int a = 10;

    /**
     * can only add positive numbers
     *
     * @param b
     * @return
     */
    static int add(int b) {
        if (b < 0) {
            return -1;
        }
        return a + b;
    }

}
