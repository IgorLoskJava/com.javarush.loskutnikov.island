import config.CreateWorld;
import config.Menu;
import config.Task;
import entity.Organism;
import entity.herbivores.Horse;
import entity.predators.Wolf;
import view.View;

import java.util.List;
import java.util.function.Consumer;


public class App {
    public static void main(String[] args) {
        int[] startParameters = Menu.start();
        CreateWorld createWorld = new CreateWorld();
        List<Organism> location1 = null;
        List<Organism> location2 = null;

        if (startParameters[0] == 1) {
            location1 = createWorld.createLocation(startParameters);
            View.statistic(location1, 1);
        } else if (startParameters[0] == 2) {
            location1 = createWorld.createLocation(startParameters);
            location2 = createWorld.createLocation(startParameters);
            View.statistic(location1, 1);
            View.statistic(location2, 2);
        }

        Task.moveAll(location1, startParameters);


    }
}
