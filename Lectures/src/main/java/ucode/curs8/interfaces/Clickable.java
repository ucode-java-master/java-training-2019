package ucode.curs8.interfaces;

public interface Clickable {


    void veryFunnyName();


    default void hover() {
        System.out.println("you are hovering me");
    }

}
