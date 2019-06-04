package ucode.curs6.overriding;

/**
 * La curs am denumit aceasta clasa OverridingExample. Am resit, trebuia sa fie OverloadingExample
 */
public class OverloadingExample {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        OverloadingExample example = new OverloadingExample();

        System.out.println(example.add(0.2, 4));
    }

}
