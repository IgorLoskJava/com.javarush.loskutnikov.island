import config.CreateWorld;
import config.PrintStatistic;

public class App {

    public static void main(String[] args) {
        PrintStatistic.printStatistic(CreateWorld.getPredatorCreate()
                ,CreateWorld.getHerbivoreListCreate(),CreateWorld.getPlanList());

    }

}

