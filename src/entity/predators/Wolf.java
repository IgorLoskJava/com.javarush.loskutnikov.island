package entity.predators;

import java.util.Random;

public class Wolf extends Predators {


    public Wolf(int x, int y, int weight, int speedMove, double eatMax) {
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;

    }

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


    @Override
    public String toString() {
        return "Wolf{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + weight +
                ", speedMove=" + speedMove +
                ", eatMax=" + eatMax +
                ", probability=" + probability +
                '}';
    }
}
