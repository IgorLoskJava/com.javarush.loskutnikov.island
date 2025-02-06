package entity.predators;

import config.Utils;
import entity.Organism;
import entity.herbivores.*;

import java.util.Iterator;
import java.util.List;

public class Wolf extends Predators {

    public Wolf(int x, int y, double weight, int speedMove, double eatMax) {
        super.x = x;
        super.y = y;
        super.weight = weight;
        super.speedMove = speedMove;
        super.eatMax = eatMax;
    }

    public Wolf() {
    }


    public void eat(Organism predator, List<Organism> herbList) {
        predator.weight -= 10;
        int index = Utils.eatRandomIndex();
        Iterator<Organism> herbIter = herbList.iterator();

        while (herbIter.hasNext()) {
            Organism nextOrganism = herbIter.next();

            if (nextOrganism instanceof Rabbit | nextOrganism instanceof Goat
                    && predator.x == nextOrganism.x && predator.y == nextOrganism.y && index == 60) {
                predator.weight += nextOrganism.weight;
                System.out.println("Волк поел");
                herbIter.remove();
                break;
            }

            if (nextOrganism instanceof Horse | nextOrganism instanceof Buffalo
                    && predator.x == nextOrganism.x && predator.y == nextOrganism.y && index == 10) {
                predator.weight += nextOrganism.weight;
                herbIter.remove();
                System.out.println("Волк поел");
                break;
            }
            if (nextOrganism instanceof Deer | nextOrganism instanceof WildBoar
                    && predator.x == nextOrganism.x && predator.y == nextOrganism.y && index == 15) {
                predator.weight += nextOrganism.weight;
                herbIter.remove();
                System.out.println("Волк поел");
                break;
            }
            if (nextOrganism instanceof Mouse
                    && predator.x == nextOrganism.x && predator.y == nextOrganism.y && index == 80) {
                predator.weight += nextOrganism.weight;
                herbIter.remove();
                System.out.println("Волк поел");
                break;
            }
            if (nextOrganism instanceof Sheep
                    && predator.x == nextOrganism.x && predator.y == nextOrganism.y && index == 70) {
                predator.weight += nextOrganism.weight;
                herbIter.remove();
                System.out.println("Волк поел");
                break;
            }
            if (nextOrganism instanceof Duck
                    && predator.x == nextOrganism.x && predator.y == nextOrganism.y && index == 70) {
                predator.weight += nextOrganism.weight;
                herbIter.remove();
                System.out.println("Волк поел");
                break;
            }

        }
    }
}

