package entity.predators;

import config.MoveDirection;
import config.Settings;
import entity.Organism;

import java.util.Arrays;
import java.util.List;

public class Wolf extends Predators {

    public Wolf(int cell, int x, int y, double weight, int speedMove, double eatMax) {
        super.cell = cell;
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + weight +
                ", speedMove=" + speedMove +
                ", eatMax=" + eatMax +
                ", cell=" + cell +
                '}';
    }

}
