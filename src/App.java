import config.CreateWorld;
import config.MoveDirection;
import config.PrintStatistic;
import config.Task;
import entity.Organism;
import entity.herbivores.Herbivores;
import entity.predators.Predators;
import entity.predators.Wolf;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Organism> predatorList = CreateWorld.predatorsCreate();
        List<Organism> herbivoresList = CreateWorld.herbivoresCreate();

        for (int i = 0; i < 3; i++) {
            PrintStatistic.printAll(predatorList, herbivoresList, i);
        }

        for (int i = 0; i < 20; i++) {
            Task.moveAll(predatorList,herbivoresList);
        }



        for (int i = 0; i < 3; i++) {
            PrintStatistic.printAll(predatorList, herbivoresList, i);
        }


    }
}

