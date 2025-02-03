package entity.herbivores;

public class Rabbit extends Herbivores {
    public Rabbit(int cell, int x, int y, double weight, int speedMove, double eatMax) {
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
