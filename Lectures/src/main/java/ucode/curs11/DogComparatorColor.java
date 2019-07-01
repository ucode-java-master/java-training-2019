package ucode.curs11;

import ucode.curs4.Dog;

import java.util.Comparator;

public class DogComparatorColor implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getColor().compareTo(o2.getColor());
    }

}
