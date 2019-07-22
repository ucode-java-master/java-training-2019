package ucode.curs2;

/**
 * This class is not intended to be a racial thing, or a sexist thing. It's just meant to express complex conditions, that can be applied in real life. Can be
 * substituted with ManCondition, if desired.
 */
public class WomenCondition {

    public static void main(String[] args) {
        WomenCondition condition = new WomenCondition();

//        call necessary methods here

    }

    /**
     * Print, when a woman has the following characteristics, that she is suffering from "piticism": Age higher than 90 or height smaller than 145, and weight
     * is bigger than 45.
     */
    public void isFemaleLittle() {
        int age = 0;
        int height = 0;
        int weight = 0;

        if (true) {
            System.out.println("sufera de piticism");
        }
    }

    /**
     * Print, when a woman has the following characteristics, that she is caucasian healty; Age higher than 25 but smaller than 40, weight higher than 46,
     * height over 145, body mass index (weight / height * height) is under 30, and skin color is white.
     */
    public boolean isComplexCondition() {

        int age = 31;
        int weight = 45;
        double height = 1.89;
        double bodyMassIndex = weight / (height * height);
        System.out.println(bodyMassIndex);
        boolean isWhite = true;

        return age > 25 && age < 40
                && weight < 46 && height > 1.45
                && bodyMassIndex < 30 && isWhite;
    }

    /**
     * Think of a more complex real life condition. Describe it in words, declare the necessary parameters, and write the condition.
     */
    public void goNuts() {

    }

}
