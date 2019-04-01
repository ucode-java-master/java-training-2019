package ucode.introduction.theater;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a theater. A theater contains the list of the people who bought tickets.
 */
public class Theater {

    /**
     * This is the list of people who have tickets.
     */
    private List<String> peopleWhoHaveTickets = new ArrayList<>();

    /**
     * This is a constructor. This method is called always, when the following line is met:
     * <p>
     * Theater theater = new Theater();
     * </p>
     */
    public Theater() {

        // we add the list of people who bought tickets here
        peopleWhoHaveTickets.add("catalin");
        peopleWhoHaveTickets.add("gabriel");
        peopleWhoHaveTickets.add("alexandru");
        peopleWhoHaveTickets.add("andrei");
    }

    /**
     * In this method we check if a person who wants to enter the theater has bought a ticket or not
     *
     * @param personWhoWantsToAttend the name of the person who wants to enter the theater
     * @return a true or false result, telling us if the person can enter the theater or not
     */
    public boolean canAttendTheater(String personWhoWantsToAttend) {
        return peopleWhoHaveTickets.contains(personWhoWantsToAttend);
    }

}
