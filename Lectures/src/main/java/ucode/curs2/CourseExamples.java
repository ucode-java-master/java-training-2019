package ucode.curs2;

public class CourseExamples {
    public static void main(String[] args) {

        CourseExamples courseExamples = new CourseExamples();

        courseExamples.interchangeVariables();
        courseExamples.moduloAndDivisionForIntegers();
        courseExamples.incrementOperator();
        courseExamples.womenCondition();
        courseExamples.leapYearCondition();
        courseExamples.ternaryOperator();
        courseExamples.simpleWhileForExample();
        courseExamples.nestedForExample();
    }

    public void interchangeVariables() {
        System.out.println("interchangeVariables");
        int a = 2;
        int b = 3;

        int aux = a;
        a = b;
        b = aux;
        System.out.println(a);
        System.out.println(b);
    }

    public void moduloAndDivisionForIntegers() {
        System.out.println("moduloAndDivisionForIntegers");
        int a = 20;
        int b = 3;

        int result = a / b;
        int modulo = a % b;
        System.out.println(result);
        System.out.println(modulo);
    }

    public void incrementOperator() {
        System.out.println("incrementOperator");
        int b = 4;

        int a = 20;
        int result1 = (a++) - b;
        // 20 / b
        // a = a+1
        System.out.println(result1);

        a = 20;
        int result2 = (++a) - b;
        // a = a + 1
        // 21 / b
        System.out.println(result2);
    }

    public void womenCondition() {
        System.out.println("womenCondition");
        int age = 20;
        int height = 165;
        boolean isWhite = true;

        if (isWhite == true && age > 15 && height >= 160) {
            System.out.println("caucazian sanatoasa");
        }
    }

    public void leapYearCondition() {
        System.out.println("leapYearCondition");
        int year = 1900;
        if (year % 4 == 0 && (year % 100 != 0 || year % 4 * 100 == 0)) {
            System.out.println("bisect");
        }
    }

    public void ternaryOperator() {
        System.out.println("ternaryOperator");
        int n = 10;
        int result1;
        if (n == 10) {
            result1 = 2;
        } else {
            result1 = 3;
        }

        int result2 = n == 10 ? 2 : 3;
        System.out.println(result1);
        System.out.println(result2);
    }

    public void simpleWhileForExample() {

        for (int i = 0; i < 5; i++) {
            System.out.println("curat scaun");
        }

        int n = 15;
        while (n != 10) {
            System.out.println("curat scaun");
            // update condition
            n = n - 1;
        }

    }

    public void nestedForExample() {
        for (int iterator1 = 1; iterator1 <= 4; iterator1++) {
            System.out.println();
            for (int iterator2 = 1; iterator2 <= 6; iterator2++) {
                System.out.print(iterator2 + " ");
            }

        }
    }

}
