package ucode.curs8;

public class Testing {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("variabila este 1");
            case 2:
                System.out.println("variabila este 2");
                break;
            case 6:
                System.out.println("var este 6");
                break;
            default:
                System.out.println("nu am gasit variabila");
        }

        for (int i = 0; i < 10; i++) {

            System.out.println("1");
            if (i == 2) {
                continue;
            }
            System.out.println("2");
        }
    }

}
