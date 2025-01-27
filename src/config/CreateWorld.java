package config;

import entity.Organism;
import entity.herbivores.*;
import entity.predators.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateWorld {

    public List<Organism> createLocation(int[] locationParameters) {
        Random random = new Random();
        List<Organism> organismList = new ArrayList<>();

        for (int i = 0; i < Settings.maxValueWolf; i++) {
            organismList.add(new Wolf(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightWolf, Settings.speedMoveWolf, Settings.eatMaxWolf));
        }

        for (int i = 0; i < Settings.maxValueBoa; i++) {
            organismList.add(new Boa(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightBoa, Settings.speedMoveBoa, Settings.eatMaxBoa));
        }

        for (int i = 0; i < Settings.maxValueHorse; i++) {
            organismList.add(new Horse(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightHorse, Settings.speedMoveHorse, Settings.eatMaxHorse));
        }

        for (int i = 0; i < Settings.maxValueRabbit; i++) {
            organismList.add(new Rabbit(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightRabbit, Settings.speedMoveRabbit, Settings.eatMaxRabbit));
        }

        for (int i = 0; i < Settings.maxValueBoar; i++) {
            organismList.add(new Boar(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightBoar, Settings.speedMoveBoar, Settings.eatMaxBoar));
        }

        for (int i = 0; i < Settings.maxValueBuffalo; i++) {
            organismList.add(new Buffalo(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightBuffalo, Settings.speedMoveBuffalo, Settings.eatMaxBuffalo));
        }

        for (int i = 0; i < Settings.maxValueCaterpillar; i++) {
            organismList.add(new Caterpillar(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightCaterpillar, Settings.speedMoveCaterpillar, Settings.eatMaxCaterpillar));
        }

        for (int i = 0; i < Settings.maxValueDeer; i++) {
            organismList.add(new Deer(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightDeer, Settings.speedMoveDeer, Settings.eatMaxDeer));
        }

        for (int i = 0; i < Settings.maxValueDuck; i++) {
            organismList.add(new Duck(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightDuck, Settings.speedMoveDuck, Settings.eatMaxDuck));
        }

        for (int i = 0; i < Settings.maxValueGoat; i++) {
            organismList.add(new Goat(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightGoat, Settings.speedMoveGoat, Settings.eatMaxGoat));
        }

        for (int i = 0; i < Settings.maxValueMouse; i++) {
            organismList.add(new Mouse(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightMouse, Settings.speedMoveMouse, Settings.eatMaxMouse));
        }

        for (int i = 0; i < Settings.maxValueSheep; i++) {
            organismList.add(new Sheep(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightSheep, Settings.speedMoveSheep, Settings.eatMaxSheep));
        }

        for (int i = 0; i < Settings.maxValueBear; i++) {
            organismList.add(new Bear(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightBear, Settings.speedMoveBear, Settings.eatMaxBear));
        }

        for (int i = 0; i < Settings.maxValueEagle; i++) {
            organismList.add(new Eagle(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightEagle, Settings.speedMoveEagle, Settings.eatMaxEagle));
        }

        for (int i = 0; i < Settings.maxValueFox; i++) {
            organismList.add(new Fox(random.nextInt(locationParameters[1]),
                    random.nextInt(locationParameters[2]),
                    Settings.weightFox, Settings.speedMoveFox, Settings.eatMaxFox));
        }

        return organismList;
    }
}
