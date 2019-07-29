package ucode.curs15;

public class TestingStatics {

    public static double pi = 3.14;
    public static double a = 0;

    public static void asd() {

        a = pi;
        System.out.println("pi = " + pi);
        System.out.println("a = " + a);
        a = 5;
        System.out.println("pi = " + pi);
        System.out.println("a = " + a);

    }

    public static void main(String[] args) {
        asd();
    }

}
