package ucode.curs4;

public class CountingClassInstances {
    public static int instances = 0;

    CountingClassInstances() {
        CountingClassInstances.instances++;
    }

    public static void main(String[] args) {
        System.out.println("I have " + CountingClassInstances.instances + " objects created ");
        new CountingClassInstances();
        new CountingClassInstances();
        new CountingClassInstances();
        new CountingClassInstances();
        new CountingClassInstances();

        System.out.println("Now I have " + CountingClassInstances.instances + " objects. WOW!");
    }

}
