package entity.herbivores;

import entity.Organism;

import java.util.Random;

public class Rabbit extends Herbivores {

    public Rabbit(int x, int y, double weight, int speedMove, double eatMax) {
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + weight +
                ", speedMove=" + speedMove +
                ", eatMax=" + eatMax +
                ", probability=" + probability +
                '}';
    }
}
