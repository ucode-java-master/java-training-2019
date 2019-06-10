package ucode.curs8.interfaces;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(addNumbers(a, b, 1, 3, 4, 5, 8, 1, 2));
        System.out.println(a);
        System.out.println();

        System.out.println(String.format("acesta este %s un string %d foarte lung care"
                + " are si intregi %d prin el, aleatoriu", "dasdsadsadsa", 2, 3, 4, 5, 6));

        CoffeeSize size = CoffeeSize.BIG;
        size.getSize();
    }

    public static int addNumbers(int a, int b, int... c) {
        a = 3;
        return a + b;
    }

}
