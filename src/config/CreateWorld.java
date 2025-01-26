package config;

import entity.Organism;
import entity.herbivores.Horse;
import entity.herbivores.Rabbit;
import entity.predators.Boa;
import entity.predators.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CreateWorld {

    public List<Organism> createLocation(int[] locationParameters) {
        Random random = new Random();
        List<Organism> organismList = new ArrayList<>();

        for (int i = 0; i < Settings.wolfMaxValue; i++) {
            organismList.add(new Wolf(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightWolf, Settings.speedMoveWolf, Settings.eatMaxWolf));
        }

        for (int i = 0; i < Settings.boaMaxValue; i++) {
            organismList.add(new Boa(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightBoa, Settings.speedMoveBoa, Settings.eatMaxBoa));
        }

        for (int i = 0; i < Settings.horseMaxValue; i++) {
            organismList.add(new Horse(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightHorse, Settings.speedMoveHorse, Settings.eatMaxHorse));
        }

        for (int i = 0; i < Settings.rabbitMaxValue; i++) {
            organismList.add(new Rabbit(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightRabbit, Settings.speedMoveRabbit, Settings.eatMaxRabbit));
        }
        return organismList;
    }
}
