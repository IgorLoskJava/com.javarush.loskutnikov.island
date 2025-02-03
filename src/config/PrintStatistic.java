package config;


import entity.Organism;
import entity.herbivores.Rabbit;
import entity.plants.Grass;
import entity.predators.Fox;
import entity.predators.Wolf;

import java.util.List;

public class PrintStatistic {

    public static void printAll(List<Organism> predator, List<Organism> herb, List<Organism> grass, int cell) {
        System.out.print("На острове, в ячейке №" + cell + " находятся: ");
        System.out.print(predator.stream()
                .filter(organism -> organism.getClass().equals(Wolf.class))
                .filter(organism -> organism.cell == cell).count() + Settings.wolfIcon);
        System.out.print(predator.stream()
                .filter(organism -> organism.getClass().equals(Fox.class))
                .filter(organism -> organism.cell == cell).count() + Settings.foxIcon);
        System.out.print(herb.stream()
                .filter(organism -> organism.getClass().equals(Rabbit.class))
                .filter(organism -> organism.cell == cell).count() + Settings.rabbitIcon);
        System.out.print(grass.stream()
                .filter(organism -> organism.getClass().equals(Grass.class))
                .filter(organism -> organism.cell == cell).count() + Settings.grassIcon);

        System.out.println();
    }

}


