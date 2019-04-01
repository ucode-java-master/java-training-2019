package ucode.introduction.theater;

/**
 * Use this class to start the application which prints if radu can enter the theater
 */
public class Main3 {

    /**
     * The main method is the entry point in any java application. When you execute the application, this is the first code that gets executed.
     */
    public static void main(String[] args) {

        // we declare a theater
        Theater theater = new Theater();

        // we ask the theater if the person named radu can attend the play
        // depending on the result, we will see on the screen if radu has access or not
        // try to replace radu with catalin, and run the program again
        if (theater.canAttendTheater("radu")) {
            System.out.println("Radu can attend the theater");
        } else {
            System.out.println("Radu cannot attend the theater");
        }
    }

}
