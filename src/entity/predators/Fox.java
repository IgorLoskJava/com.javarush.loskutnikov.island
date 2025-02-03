package entity.predators;

public class Fox extends Predators {

    public Fox(int cell, int x, int y, double weight, int speedMove, double eatMax) {
        super.cell = cell;
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + weight +
                ", speedMove=" + speedMove +
                ", eatMax=" + eatMax +
                ", cell=" + cell +
                '}';
    }
}
