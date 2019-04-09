package ucode.curs2.if_statements;

/**
 * Give a and b, in each method, the following values:
 * <ul>
 * <li>10; 20</li>
 * <li>10; 10</li>
 * <li>10; 5</li>
 * </ul>
 * Explain the results
 */
public class IfExample {

    public static void main(String[] args) {
        IfExample ifExample = new IfExample();
        ifExample.simpleIf();
        ifExample.nestedIfs();
        ifExample.nestedIfsExplained();
        ifExample.elsIf();
    }

    /**
     * The scope is to see when we enter the "then" branch, when the "else" branch.
     */
    public void simpleIf() {
        System.out.println("simpleIf");
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("this is the \"then\" execution");
        } else {
            System.out.println("this is the \"else\" execution");
        }
    }

    /**
     * The scope is to see we can have more complex flows, and nested ifs. Compare this to the elsIf example
     */
    public void nestedIfs() {
        System.out.println("nestedIfs");
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("this is the first if \"then\" execution");
        } else {
            System.out.println("this is the first if \"else\" execution");
            if (a > b) {
                System.out.println("this is the second if \"then\" execution");
            } else {
                System.out.println("this is the second if \"else\" execution");
            }
        }
    }

    /**
     * In case we diverged our attention from what we achieved with the previous if, let's spell it our.
     */
    public void nestedIfsExplained() {
        System.out.println("nestedIfsExplained");
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is strictly smaller than b");
        } else {
            if (a > b) {
                System.out.println("a is strictly greater than b, or, b is strictly smaller than a");
            } else {
                System.out.println("a and b are equal");
            }
        }
    }


    /**
     * In case we diverged our attention from what we achieved with the previous if, let's spell it our.
     */
    public void elsIf() {
        System.out.println("elsIf");
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is strictly smaller than b");
        } else if (a > b) {
            System.out.println("a is strictly greater than b, or, b is strictly smaller than a");
        } else {
            System.out.println("a and b are equal");
        }
    }

}
