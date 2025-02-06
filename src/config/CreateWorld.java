package config;

import entity.Organism;
import entity.herbivores.*;
import entity.plants.Grass;
import entity.predators.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class CreateWorld {
    static Random rnd = new Random();

    public static List<Organism> getPredatorCreate() {
        List<Organism> predatorList = new ArrayList<>();
        for (int i = 0; i < Settings.maxValueWolf; i++) {
            predatorList.add(new Wolf(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightWolf, Settings.speedMoveWolf, Settings.eatMaxWolf));
        }

        for (int i = 0; i < Settings.maxValueBoa; i++) {
            predatorList.add(new Boa(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightBoa, Settings.speedMoveBoa, Settings.eatMaxBoa));
        }

        for (int i = 0; i < Settings.maxValueFox; i++) {
            predatorList.add(new Fox(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightFox, Settings.speedMoveFox, Settings.eatMaxFox));
        }

        for (int i = 0; i < Settings.maxValueBear; i++) {
            predatorList.add(new Bear(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightBear, Settings.speedMoveBear, Settings.eatMaxBear));
        }

        for (int i = 0; i < Settings.maxValueEagle; i++) {
            predatorList.add(new Eagle(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightEagle, Settings.speedMoveEagle, Settings.eatMaxEagle));
        }
        return predatorList;
    }

    public static List<Organism> getHerbivoreListCreate() {
        List<Organism> herbivoreList = new ArrayList<>();
        for (int i = 0; i < Settings.maxValueHorse; i++) {
            herbivoreList.add(new Horse(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightHorse, Settings.speedMoveHorse, Settings.eatMaxHorse));
        }
        for (int i = 0; i < Settings.maxValueDeer; i++) {
            herbivoreList.add(new Deer(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightDeer, Settings.speedMoveDeer, Settings.eatMaxDeer));
        }
        for (int i = 0; i < Settings.maxValueRabbit; i++) {
            herbivoreList.add(new Rabbit(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightRabbit, Settings.speedMoveRabbit, Settings.eatMaxRabbit));
        }
        for (int i = 0; i < Settings.maxValueMouse; i++) {
            herbivoreList.add(new Mouse(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightMouse, Settings.speedMoveMouse, Settings.eatMaxMouse));
        }
        for (int i = 0; i < Settings.maxValueGoat; i++) {
            herbivoreList.add(new Goat(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightGoat, Settings.speedMoveGoat, Settings.eatMaxGoat));
        }
        for (int i = 0; i < Settings.maxValueSheep; i++) {
            herbivoreList.add(new Sheep(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightSheep, Settings.speedMoveSheep, Settings.eatMaxSheep));
        }
        for (int i = 0; i < Settings.maxValueWildBoar; i++) {
            herbivoreList.add(new WildBoar(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightWildBoar, Settings.speedMoveWildBoar, Settings.eatMaxWildBoar));
        }
        for (int i = 0; i < Settings.maxValueBuffalo; i++) {
            herbivoreList.add(new Buffalo(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightBuffalo, Settings.speedMoveBuffalo, Settings.eatMaxBuffalo));
        }
        for (int i = 0; i < Settings.maxValueDuck; i++) {
            herbivoreList.add(new Duck(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightDuck, Settings.speedMoveDuck, Settings.eatMaxDuck));
        }
        for (int i = 0; i < Settings.maxValueCaterpillar; i++) {
            herbivoreList.add(new Caterpillar(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY), Settings.weightCaterpillar, Settings.speedMoveCaterpillar, Settings.eatMaxCaterpillar));
        }
        return herbivoreList;
    }

    public static List<Organism> getPlanList(){
        List<Organism> planList = new ArrayList<>();
        for (int i = 0; i < Settings.maxValueGrass; i++) {
            planList.add(new Grass(rnd.nextInt(Settings.globalX),
                    rnd.nextInt(Settings.globalY)));
        }
        return planList;
    }

}

