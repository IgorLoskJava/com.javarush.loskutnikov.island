package config;

import entity.Organism;
import entity.herbivores.Rabbit;
import entity.plants.Grass;
import entity.predators.Fox;
import entity.predators.Wolf;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class CreateWorld {

    static Random rnd = new Random();
    static int width = 100;
    static int height = 20;
    static int maxCell = 3;


    public static List<Organism> predatorsCreate() {
        List<Organism> predatorsList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < maxCell; i++) {
            for (int j = 0; j < rnd.nextInt(Settings.maxValueWolf); j++) {
                predatorsList.add(new Wolf(i, rnd.nextInt(width)
                        , rnd.nextInt(height), Settings.weightWolf, Settings.speedMoveWolf, Settings.eatMaxWolf));
            }
        }

        for (int i = 0; i < maxCell; i++) {
            for (int j = 0; j < rnd.nextInt(Settings.maxValueFox); j++) {
                predatorsList.add(new Fox(i, rnd.nextInt(width)
                        , rnd.nextInt(height), Settings.weightFox, Settings.speedMoveFox, Settings.eatMaxFox));
            }
        }

        return predatorsList;
    }
    public static List<Organism> herbivoresCreate (){
        List<Organism> herbivoresList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < maxCell; i++) {
            for (int j = 0; j < rnd.nextInt(Settings.maxValueRabbit); j++) {
                herbivoresList.add(new Rabbit(i, rnd.nextInt(width)
                        , rnd.nextInt(height), Settings.weightRabbit, Settings.speedMoveRabbit, Settings.eatMaxRabbit));
            }
        }
        return herbivoresList;
    }

    public static List<Organism> plantsCreate (){
        List<Organism> plantList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < maxCell; i++) {
            for (int j = 0; j < rnd.nextInt(Settings.maxValueGrass); j++) {
                plantList.add(new Grass(i, rnd.nextInt(width), rnd.nextInt(height)));
            }
        }
        return plantList;
    }

}

