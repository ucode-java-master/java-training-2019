package ucode.curs11;

import ucode.curs4.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashCodeEqualsDogMain {

    public static void main(String[] args) {
        Dog dog1 = new Dog(50, "blue", 10);
        Dog dog2 = new Dog(49, "blue", 10);
        Dog dog3 = new Dog(48, "blue", 10);
        Dog dog4 = new Dog(47, "blue", 10);
        Dog dog5 = new Dog(46, "blue", 10);

        Map<Integer, Dog> customMap = new TreeMap<>();
        customMap.put(dog1.getWeight(), dog1);
        customMap.put(dog2.getWeight(), dog2);
        customMap.put(dog3.getWeight(), dog3);
        customMap.put(dog4.getWeight(), dog4);
        customMap.put(dog5.getWeight(), dog5);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);

        Dog[] dogs = dogList.toArray(new Dog[1]);
        Arrays.asList(dogs);

        System.out.println(customMap);


//
//        System.out.println("reflexive");
//        System.out.println("dog1.equals(dog1) = " + dog1.equals(dog1));
//        System.out.println("simetric");
//        System.out.println("dog2.equals(dog1) = " + dog2.equals(dog1));
//        System.out.println("dog1.equals(dog2) = " + dog1.equals(dog2));
//        System.out.println("transitive");
//        System.out.println("dog1.equals(dog2) = " + dog1.equals(dog2));
//        System.out.println("dog2.equals(dog3) = " + dog2.equals(dog3));
//        System.out.println("dog1.equals(dog3) = " + dog1.equals(dog3));
//        System.out.println("consistent");
//        System.out.println("dog1.equals(dog2) = " + dog1.equals(dog2));
//        System.out.println("not null");
//        System.out.println("dog1.equals(null) = " + dog1.equals(null));
//        System.out.println();
//
//        System.out.println("dog1.hashCode() = " + dog1.hashCode());
//        System.out.println("dog1.hashCode() = " + dog1.hashCode());
//        System.out.println("dog1.hashCode() = " + dog1.hashCode());
//        System.out.println("dog2.hashCode() = " + dog2.hashCode());
//        dog3.feed(1);
//        System.out.println("dog3.hashCode() = " + dog3.hashCode());
//        dog3.takeForAWalk();
//        System.out.println("dog3.hashCode() = " + dog3.hashCode());
//

    }

}
