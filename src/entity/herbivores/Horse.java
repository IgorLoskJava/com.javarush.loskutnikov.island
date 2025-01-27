package entity.herbivores;

import java.util.Random;

public class Horse extends Herbivores {

    public Horse(int x, int y, double weight, int speedMove, double eatMax) {
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;

    }

    @Override
    public String toString() {
        return "Horse{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + weight +
                ", speedMove=" + speedMove +
                ", eatMax=" + eatMax +
                ", probability=" + probability +
                '}';
    }
}
