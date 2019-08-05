package ucode.curs16;

public class OrdineaOperatiilor {

    int a = 10;

    public OrdineaOperatiilor() {
        System.out.println("a = " + a);
        this.a = 20;
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        OrdineaOperatiilor a = new OrdineaOperatiilor();
        a.printA();
    }

    public void printA() {
        System.out.println("a = " + a);
    }

}
