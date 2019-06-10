package ucode.curs8.interfaces;

interface Jumpable {
    default void relax() {
        System.out.println("No jumping");
    }

}

interface Moveable {
    default void relax() {
        System.out.println("No moving");
    }

}

public class Animal implements Jumpable, Moveable, MyInterface {
    @Override
    public void relax() {
        getName();
    }

    public static void main(String[] args) {
        new Animal().relax();
    }

}


interface BaseInterface1 {
    default void getName() {
        System.out.println("Base 1");
    }

}

interface BaseInterface2 {
    default void getName() {
        System.out.println("Base 2");
    }

}

interface MyInterface extends BaseInterface1, BaseInterface2 {
    default void getName() {
        BaseInterface1.super.getName();
    }

}