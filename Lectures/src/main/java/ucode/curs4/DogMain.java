package ucode.curs4;

public class DogMain {

    public static void main(String[] args) {
        final Dog dog = new Dog(30, "blue", 5);
        final Dog dog2 = new Dog(40, "green", 10);

        System.out.println("We adopted a new dog, of color " + dog.getDogColor());
        System.out.println("let's feed the dog");
        dog.feed(2);
        System.out.println("Have we made the dog happy? " + dog.isDogHappy());

        while (!dog.isDogFat()) {
            dog.feed(1);
        }

        dog.happiness = 100;

        System.out.println(" we fed the dog to fatness :( " + dog.isDogHappy());

        dog.passTime();
        dog.takeForAWalk();

        System.out.println("What is the state of the dog now? is happy? " + dog.isDogHappy() + ". Is it still fat? " + dog.isDogFat());
    }

}
