package ucode.quiz;

@SuppressWarnings({"AccessStaticViaInstance", "ConstantConditions"})

public class Bicicle {

    private static int commonGround = 0;

    private int commonGroud = 1;

    private int manipulateObject(int theValue) {
        theValue = theValue + 2;

        commonGroud = theValue + 5;
        if (commonGround > 5) {
            commonGroud--;
        }

        commonGround = theValue - commonGroud;
        return theValue;
    }

    public static void main(String[] args) {
        Bicicle bicicle = new Bicicle();

        Bicicle.commonGround = 1;
        bicicle.commonGroud = bicicle.manipulateObject(Bicicle.commonGround);
        Bicicle.commonGround = 10;

        System.out.println(bicicle.commonGround);

    }

}


