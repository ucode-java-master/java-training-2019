package ucode.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface QuizInterface {

    void testMethod();

    String getName(int parameter);

}

public class Cars {

    public static void main(String[] args) {
        Car car = new Car();
        Car ferrari = new Ferrari();
        Car specificCar = new Ferrari();
        specificCar.series = "A class";
        List<Car> cars = new ArrayList<Car>();
        cars.addAll(Arrays.asList(car, specificCar, ferrari));
        for (Car aCar : cars) {
            aCar.printName();
        }
    }

}

class Ferrari extends Car {

    @Override
    public void printName() {
        System.out.println("I am a Ferrari " + series);
    }

}

class Car {
    String series;

    public void printName() {
        System.out.println(series);
    }

}

class QuizClass implements QuizInterface {

    @Override
    public void testMethod() {

    }

    @Override
    public String getName(int parameter) {
        return null;
    }

}


