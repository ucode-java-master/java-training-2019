package ucode.curs2.loops_example;

public class WhileExample {

    public static void main(String[] args) {
        WhileExample whileExample = new WhileExample();
        whileExample.whileExample();
    }

    public void whileExample() {
        int num = 9;
        boolean divisibleBy7 = true;
        do {
            System.out.println(num);
            if (num % 7 == 0) {
                divisibleBy7 = true;
            }
            num--;
        } while (divisibleBy7 == false);
    }

}
