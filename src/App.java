import config.CreateWorld;
import config.Menu;
import entity.Organism;

import java.util.List;


public class App {
    public static void main(String[] args) {
        int[] startParameters = Menu.start();
        CreateWorld createWorld = new CreateWorld();
        if (startParameters[0] == 1) {
            List<Organism> location1 = createWorld.createLocation(startParameters);
        } else if (startParameters[0] == 2) {
            List<Organism> location1 = createWorld.createLocation(startParameters);
            List<Organism> location2 = createWorld.createLocation(startParameters);
        } else if (startParameters[0] == 3) {
            List<Organism> location1 = createWorld.createLocation(startParameters);
            List<Organism> location2 = createWorld.createLocation(startParameters);
            List<Organism> location3 = createWorld.createLocation(startParameters);
        }


    }
}
