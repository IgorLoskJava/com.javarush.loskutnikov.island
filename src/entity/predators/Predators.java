package entity.predators;

import config.MoveDirection;
import entity.Organism;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class Predators extends Organism {

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
    public void eat(Organism predator, List<Organism> herbivores) {
        predator.eatCount = predator.eatCount - 1;
        for (int i = 0; i < herbivores.size(); i++) {
            if (predator.cell == herbivores.get(i).cell
                    && predator.x == herbivores.get(i).x && predator.y == herbivores.get(i).y) {
                herbivores.remove(i);
                predator.eatCount = 2;
                //System.out.println("Herb eated" + predator.eatCount);
                break;
            }

        }

    }

    @Override
    public Organism spawn(Organism predator, List<Organism> predatorList) {
        for (int i = 0; i < predatorList.size(); i++) {
            if (predator.cell == predatorList.get(i).cell && predator.x == predatorList.get(i).x && predator.y == predatorList.get(i).y) {
                //System.out.println("Predator spawn");
                return predator;
            }

        }
        return predator;
    }

    @Override
    public void die(List<Organism> predator) {
        for (int i = 0; i < predator.size(); i++) {
            if (predator.get(i).eatCount == 0) {
                predator.remove(i);
            }
        }
    }

}