package entity.herbivores;

import config.MoveDirection;
import config.Settings;
import entity.Organism;

import java.util.List;


public class Herbivores extends Organism {

    @Override
    public void move(Organism organisms) {
        int[] moveDir = MoveDirection.moveDir();
        int defX = organisms.x;
        int defY = organisms.y;

        organisms.x = organisms.x + (organisms.speedMove * moveDir[0]);
        organisms.y = organisms.y + (organisms.speedMove * moveDir[1]);

        if (organisms.cell == 0) {
            if (organisms.x < 0 || organisms.y < 0 || organisms.y > 20) {
                organisms.x = defX;
                organisms.y = defY;
            } else if (organisms.x > 100) {
                organisms.x = organisms.x - 100;
                organisms.cell = 1;
            }

        }

        if (organisms.cell == 1) {
            if (organisms.x < 0) {
                organisms.x = organisms.x + 100;
                organisms.cell = 0;
            } else if (organisms.x > 100) {
                organisms.x = organisms.x - 100;
                organisms.cell = 2;
            }
            if (organisms.y < 0 || organisms.y > 20) {
                organisms.y = defY;
            }
        }

        if (organisms.cell == 2) {
            if (organisms.x > 100 || organisms.y < 0 || organisms.y > 20) {
                organisms.x = defX;
                organisms.y = defY;
            } else if (organisms.x < 0) {
                organisms.x = organisms.x - 100;
                organisms.cell = 1;
            }

        }
    }

    @Override
    public void eat(Organism herbivore, List<Organism> grass) {
        herbivore.eatCount = herbivore.eatCount - 1;
        for (int i = 0; i < grass.size(); i++) {
            if (herbivore.cell == grass.get(i).cell
                    && herbivore.x == grass.get(i).x && herbivore.y == grass.get(i).y) {
                grass.remove(i);
                herbivore.eatCount = 2;
                //System.out.println("Grass eated");
                break;
            }

        }

    }

    @Override
    public Organism spawn(Organism herb, List<Organism> herbList) {
        for (int i = 0; i < herbList.size(); i++) {
            if (herb.cell == herbList.get(i).cell && herb.x == herbList.get(i).x && herb.y == herbList.get(i).y) {
                //System.out.println("Herbivores spawn");
                return herb;
            }
        }
        return null;
    }

    @Override
    public void die(List<Organism> herb) {
        for (int i = 0; i < herb.size(); i++) {
            if (herb.get(i).eatCount == 0) {
                herb.remove(i);
            }
        }
    }

}