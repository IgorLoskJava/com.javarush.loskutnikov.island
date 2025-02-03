package entity.plants;

import entity.Organism;

public class Grass extends Organism {
    public Grass(int cell, int x, int y) {
        super.cell = cell;
        super.x = x;
        super.y = y;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "x=" + x +
                ", y=" + y +
                ", cell=" + cell +
                '}';
    }
}
