package entity.predators;

import config.MoveDirection;
import config.Settings;
import entity.Organism;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Wolf extends Predators {

    public Wolf(int cell, int x, int y, double weight, int speedMove, int eatCount) {
        super.cell = cell;
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatCount = eatCount;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "x=" + x +
                ", y=" + y +
                ", cell=" + cell +
                ", eatCount=" + eatCount +
                '}';
    }


}
