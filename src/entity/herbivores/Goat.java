package entity.herbivores;

public class Goat extends Herbivores{

    public Goat(int x, int y,double weight, int speedMove, double eatMax) {
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;

    }

    @Override
    public String toString() {
        return "Goat{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + weight +
                ", speedMove=" + speedMove +
                ", eatMax=" + eatMax +
                '}';
    }
}
