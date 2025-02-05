package entity.herbivores;

public class Mouse extends Herbivores{

    public Mouse (int cell, int x, int y, double weight, int speedMove, int eatCount) {
        super.cell = cell;
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatCount = eatCount;
    }
}
