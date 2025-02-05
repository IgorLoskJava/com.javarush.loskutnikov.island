package entity.predators;

public class Fox extends Predators {

    public Fox(int cell, int x, int y, double weight, int speedMove, int eatCount) {
        super.cell = cell;
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatCount = eatCount;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "x=" + x +
                ", y=" + y +
                ", cell=" + cell +
                ", eatCount=" + eatCount +
                '}';
    }
}
