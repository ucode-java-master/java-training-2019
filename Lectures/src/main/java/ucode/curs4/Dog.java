package ucode.curs4;

public class Dog {

    private int weight;
    private String color;
    int happiness;
    private boolean isHungry;

    public Dog(int weight, String color, int happiness) {
        this.weight = weight;
        this.color = color;
        this.happiness = happiness;
        this.isHungry = false;
    }

    public Dog() {
        this(0, null, 0);
    }

    public void feed(int amountOfFood) {
        if (amountOfFood > 5) {
            System.out.println("Dog cannot eat that much");
            return;
        }
        if (isHungry) {
            weight += (amountOfFood / 2);
            modifyHappiness(1);
        } else {
            weight += amountOfFood;
            modifyHappiness(-1);
        }
        if (weight >= 35) {
            isHungry = false;
        }
    }

    private void modifyHappiness(int amount) {
        happiness += amount;
        if (happiness >= 15) {
            happiness = 15;
        }
        if (happiness <= 0) {
            happiness = 0;
        }
    }

    /**
     * the doq is happy if happiness is high enough and he is not fat
     *
     * @return
     */
    public boolean isDogHappy() {
        return happiness >= 10 && !isDogFat();
    }

    public boolean isDogFat() {
        return weight >= 40;
    }

    public void takeForAWalk() {
        modifyHappiness(3);
        weight -= 5;
        isHungry = true;
    }


    public String getDogColor() {
        return color;
    }

    public void passTime() {
        weight -= 2;
        modifyHappiness(-1);
        if (weight <= 30) {
            isHungry = true;
        }
    }

    enum Color {
        BLUE,
        GREEN,
        RED;
    }

}
