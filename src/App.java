import config.CreateWorld;
import config.PrintStatistic;
import config.Task;
import entity.Organism;

import java.util.List;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {
        List<Organism> predatorList = CreateWorld.predatorsCreate();
        List<Organism> herbivoresList = CreateWorld.herbivoresCreate();
        List<Organism> grassList = CreateWorld.plantsCreate();
        List<Organism> tempSpawnList = new CopyOnWriteArrayList<>();

//        for (int i = 0; i < 3; i++) {
//            PrintStatistic.printAll(predatorList,herbivoresList,grassList,i);
//        }
        PrintStatistic.printTest(predatorList,herbivoresList,grassList);


        for (int i = 0; i < 10; i++) {
            Task.predatorsEat(predatorList,herbivoresList);
            Task.herbEat(herbivoresList,grassList);
            Task.moveAll(predatorList,herbivoresList);
            Task.predatorsSpawn(predatorList,tempSpawnList);
            Task.herbivoresSpawn(herbivoresList,tempSpawnList);
            Task.moveAll(predatorList,herbivoresList);
            Task.grassSpawn(grassList);


//            for (int j = 0; j < 3; j++) {
//                PrintStatistic.printAll(predatorList,herbivoresList,grassList,j);
//            }
            PrintStatistic.printTest(predatorList,herbivoresList,grassList);
        }

    }

}

