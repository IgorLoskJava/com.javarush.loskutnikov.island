package entity.herbivores;

public class Mouse extends Herbivores{

    public Mouse (int x, int y, double weight, int speedMove, double eatMax) {
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "x=" + x +
                ", y=" + y +
                ", weight=" + weight +
                ", speedMove=" + speedMove +
                ", eatMax=" + eatMax +
                ", probability=" + probability +
                '}';
    }
}
