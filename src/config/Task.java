package config;

import entity.Organism;
import entity.herbivores.Herbivores;
import entity.predators.Predators;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task {


    public static void moveAll(List<Organism> predator, List<Organism> herb) {

        for (int i = 0; i < predator.size(); i++) {
            new Predators().move(predator.get(i));
        }
        for (int i = 0; i < herb.size(); i++) {
            new Herbivores().move(herb.get(i));
        }

    }

    public static void predatorsEat(List<Organism> predator, List<Organism> herb) {

        for (int i = 0; i < predator.size(); i++) {
            new Predators().eat(predator.get(i), herb);
        }

    }

    public static void herbEat(List<Organism> herb, List<Organism> grass) {

        for (int i = 0; i < herb.size(); i++) {
            new Herbivores().eat(herb.get(i), grass);
        }

    }

    public static void herbivoresSpawn(List<Organism> herbivoresList, List<Organism> tempSpawnList) {

        for (int i = 0; i < herbivoresList.size(); i++) {
            tempSpawnList.add(new Herbivores().spawn(herbivoresList.get(i), herbivoresList));
        }
        herbivoresList.addAll(0, tempSpawnList);
        tempSpawnList.clear();
    }

    public static void predatorsSpawn(List<Organism> predatorList, List<Organism> tempSpawnList) {
        for (int i = 0; i < predatorList.size(); i++) {
            tempSpawnList.add(new Predators().spawn(predatorList.get(i), predatorList));
        }
        predatorList.addAll(0, tempSpawnList);
        tempSpawnList.clear();
    }

    public static void grassSpawn(List<Organism> grassList) {
        List<Organism> tempSpawnList;
        tempSpawnList = CreateWorld.plantsCreate();
        grassList.addAll(0,tempSpawnList);
        tempSpawnList.clear();
    }


}
