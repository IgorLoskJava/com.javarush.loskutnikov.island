package entity;

import java.util.List;

public abstract class Organism {
    public int x;
    public int y;
    public int weight;
    public int speedMove;
    public double eatMax;
    public int probability;

    public void move(int [] worldSize){}

}
