package config;

import entity.Organism;
import entity.herbivores.Rabbit;
import entity.predators.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateWorld {

    public List<Organism> createLocation (int [] locationParameters) {
        Random random = new Random();
        List<Organism> organismList = new ArrayList<>();

        for (int i = 0; i < Settings.wolfMaxValue; i++) {
            organismList.add(new Wolf(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightWolf, Settings.speedMoveWolf, Settings.eatMaxWolf));
        }
        return organismList;
    }
}
