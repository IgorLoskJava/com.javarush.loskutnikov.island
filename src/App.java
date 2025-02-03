import config.CreateWorld;
import config.PrintStatistic;
import config.Task;
import entity.Organism;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Organism> predatorList = CreateWorld.predatorsCreate();
        List<Organism> herbivoresList = CreateWorld.herbivoresCreate();
        List<Organism> grassList = CreateWorld.plantsCreate();

        for (int i = 0; i < 3; i++) {
            PrintStatistic.printAll(predatorList, herbivoresList, grassList, i);
        }
        for (int j = 0; j < 10; j++) {
            Task.predatorsEat(predatorList, herbivoresList);
            Task.herbEat(herbivoresList, grassList);
            Task.moveAll(predatorList, herbivoresList);
        }
        for (int i = 0; i < 3; i++) {
            PrintStatistic.printAll(predatorList, herbivoresList, grassList, i);
        }

    }
}

