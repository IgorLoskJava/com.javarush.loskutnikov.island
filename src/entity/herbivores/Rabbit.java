package entity.herbivores;

import config.MoveDirection;
import entity.Organism;

import java.util.List;

public class Rabbit extends Herbivores {
    public Rabbit(int cell, int x, int y, double weight, int speedMove, int eatCount) {
        super.cell = cell;
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatCount = eatCount;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "x=" + x +
                ", y=" + y +
                ", cell=" + cell +
                ", eatCount=" + eatCount +
                '}';
    }
}
