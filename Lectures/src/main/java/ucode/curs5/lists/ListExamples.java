package ucode.curs5.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        workingWithArrays();
        workingWithLists();

    }

    private static void workingWithArrays() {
        String[] classroom = new String[5];

        classroom[0] = "Catalin";
        classroom[1] = "Mihaly";
        classroom[2] = "Marian";
        classroom[3] = "Bogdan";
        classroom[4] = "Attila";

        for (int i = 0; i <= classroom.length; i++) {
            System.out.println("This is a student :" + classroom[0]);
        }

        classroom[5] = "Alex";
    }

    private static void workingWithLists() {
        List<String> classroom = new ArrayList<>();

        classroom.add("Catalin");
        classroom.add("Mihaly");
        classroom.add("Marian");
        classroom.add("Bogdan");
        classroom.add("Attila");

        for (int i = 0; i <= classroom.size(); i++) {
            System.out.println("This is a student :" + classroom.get(i));
        }

        for (String student : classroom) {
            System.out.println("This is a student :" + student);
        }

        classroom.forEach((student) -> System.out.println("This is a student :" + student));

        Iterator<String> iterator = classroom.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("This is a student: " + next);
        }

    }

}
