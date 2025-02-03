package config;

import entity.Organism;
import entity.herbivores.Herbivores;
import entity.predators.Predators;

import java.util.List;

public class Task {


    public static void moveAll(List<Organism> predator, List<Organism> herb) {
        Predators predators = new Predators();
        Herbivores herbivores = new Herbivores();
        for (int i = 0; i < predator.size(); i++) {
            predators.move(predator.get(i));
        }
        for (int i = 0; i < herb.size(); i++) {
            herbivores.move(herb.get(i));
        }

    }

    public static void eating(List<Organism> predator, List<Organism> herb) {
        Predators predators = new Predators();
        Herbivores herbivores = new Herbivores();

        for (int i = 0; i < predator.size(); i++) {
            predators.eat(predator.get(i), herb);
        }

        for (int i = 0; i < predator.size(); i++) {
            herbivores.eat(predator.get(i), herb);
        }

    }
}
