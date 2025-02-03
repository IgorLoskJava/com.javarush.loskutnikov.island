package entity;

import java.util.List;

public abstract class Organism {
    public int x;
    public int y;
    public double weight;
    public int speedMove;
    public double eatMax;
    public int cell;

    public void move(Organism organisms){};
    public void eat(Organism predator, List<Organism> herb){}
}
