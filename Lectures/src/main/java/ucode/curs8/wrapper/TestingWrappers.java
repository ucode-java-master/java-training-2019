package ucode.curs8.wrapper;

public class TestingWrappers {

    public static void main(String[] args) {
        testing(200, 200);
        Integer b = Integer.valueOf("200");
        Integer a = Integer.valueOf("200");
        testing(a, b);
//        System.out.println(a == b);

        Integer c = Integer.valueOf("20");
        double dou = Double.valueOf("543.98");

//        Long aLong = 190L;
//        aLong.longValue();
//        System.out.println("aaa" + aLong.byteValue());
//        System.out.println(dou);
        Integer d = Integer.valueOf("20");
//        System.out.println(c == d);

        testing(200, 200);
    }

    public static void testing(Integer... a) {

    }

    public static void testing(int a) {

    }

    public static void testing(int a, int b) {
        System.out.println(a == b);
    }

    public static void testing(Integer a, Integer b) {
        System.out.println(a + b);
    }


}