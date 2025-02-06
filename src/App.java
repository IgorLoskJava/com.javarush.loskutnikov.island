import config.CreateWorld;
import config.PrintStatistic;
import config.Utils;
import entity.Organism;
import entity.herbivores.Rabbit;
import entity.predators.Wolf;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class App {

    public static void main(String[] args) {
        List<Organism> predatorList = CreateWorld.getPredatorCreate();
        List<Organism> herbivoreList = CreateWorld.getHerbivoreListCreate();
        List<Organism> planList = CreateWorld.getPlanList();
        PrintStatistic.printStatistic(predatorList, herbivoreList, planList);

        for (int i = 0; i < predatorList.size(); i++) {
            new Wolf().eat(predatorList.get(i), herbivoreList);
        }
        PrintStatistic.printStatistic(predatorList, herbivoreList, planList);

    }


}

