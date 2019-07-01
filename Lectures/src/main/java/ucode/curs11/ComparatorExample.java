package ucode.curs11;

import ucode.curs4.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        Dog a1 = new Dog(10, "blue", 1);
        Dog a2 = new Dog(15, "blue", 1);
        Dog a3 = new Dog(5, "blue", 1);
        Dog a4 = new Dog(10, "green", 1);
        Dog a5 = new Dog(20, "blue", 1);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(a1);
        dogList.add(a2);
        dogList.add(a3);
        dogList.add(a4);
        dogList.add(a5);

        System.out.println(dogList);

        Collections.sort(dogList);

        dogList.sort(new DogComparator());

        Dog a6 = new Dog(5, "red", 2);

        System.out.println("dogList.contains(a6) = " + dogList.contains(a6));


    }

}
