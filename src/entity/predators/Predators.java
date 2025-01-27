package entity.predators;

import entity.Organism;

import java.util.Random;

public class Predators extends Organism {
    @Override
    public void move(int[] worldSize) {
        Random random = new Random();
        int i = random.nextInt(speedMove + 1);

        x = x + i;
        if (x > worldSize[1]) {
            x = 0;
        }
        y = y + speedMove - i;
        if (y > worldSize[2]) {
            y = 0;
        }
    }
}
