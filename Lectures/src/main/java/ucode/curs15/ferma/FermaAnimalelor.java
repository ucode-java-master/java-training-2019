package ucode.curs15.ferma;

import java.util.ArrayList;
import java.util.List;

public class FermaAnimalelor {

    List<Animal> animals = new ArrayList<>();

    public FermaAnimalelor() {
        animals.add(new Caine());
        animals.add(new Pisica());
        animals.add(new Pisica());
        animals.add(new Caine());
        animals.add(new Caine());

    }

    public void feedAllTheAnimals() {
        for (Animal animal : animals) {
            animal.mananca();
        }
    }

    public void playWithTheAnimals() {
        for (Animal animal : animals) {
            if (animal instanceof Caine) {
                Caine caine = (Caine) animal;
                caine.fugi();
            }
            if (animal instanceof Pisica) {
                Pisica pisica = (Pisica) animal;
                pisica.sari();
            }
        }
    }

}
