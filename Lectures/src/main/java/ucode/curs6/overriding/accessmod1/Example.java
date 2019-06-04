package ucode.curs6.overriding.accessmod1;

public class Example {


    protected int a;

    public int setA(int a1) {
        if (a1 < 10) {
            this.a = 0;
        }
        return this.a = a1;
    }

}
