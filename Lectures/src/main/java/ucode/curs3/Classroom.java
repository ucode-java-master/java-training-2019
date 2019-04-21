package ucode.curs3;

public class Classroom {
    public static void main(String[] args) {

        int[] classroomHeight = new int[]{165, 189, 170, 180};
        String[] classroomName = new String[]{"radmila", "catalin", "marian", "mihaly"};

        for (int iterator = classroomHeight.length - 1; iterator >= 0; iterator--) {
            if (classroomHeight[iterator] >= 175) {
                System.out.println("studentul cu numele " + (1 + 2) + classroomName[iterator] + " poate participa la"
                        + " sportul basket" + classroomHeight[iterator]);
            }
        }
        Classroom classroom = new Classroom();
        classroom.testDinCarte();
    }

    public void testDinCarte() {
        String[] strArray = new String[]{"Summer", "Winter"};
    }

}
