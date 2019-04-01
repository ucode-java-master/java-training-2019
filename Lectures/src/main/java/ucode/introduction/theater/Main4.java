package ucode.introduction.theater;

import java.util.Scanner;

/**
 * Use this class to start the application which reads from input a name, and tells you if that person has access to
 */
public class Main4 {

    /**
     * The main method is the entry point in any java application. When you execute the application, this is the first code that gets executed.
     */
    public static void main(String[] args) {

        // we declare a theater
        Theater theater = new Theater();

        // we declare a utility object, which will help us read from the console
        Scanner scanner = new Scanner(System.in);

        // we write, for the user, that we expect some input from it
        System.out.println("Please input a person name:");
        // the user will write something, then press enter. when he presses enter, we will have what the user typed in the variable input
        String input = scanner.nextLine();

        // this is a condition. run this program until the user has typed exit
        while (!input.equals("exit")) {

            // we check if the person that the user wrote has access to the theater
            if (theater.canAttendTheater(input)) {
                System.out.println("The person named \"" + input + "\" can attend the theater");
            } else {
                System.out.println("The person named \"" + input + "\" cannot attend the theater");
            }

            // we write, for the user, that we expect some input from it
            System.out.println("Please input a person name:");
            // we read from the console what the user typed. the program will end if the user types exit. otherwise, it will restart the execution from line
            // 27, which is "while (!input.equals("exit")) {"
            input = scanner.nextLine();
        }

    }

}
