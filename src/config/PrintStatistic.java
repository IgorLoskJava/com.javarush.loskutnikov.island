package config;


import entity.Organism;
import entity.herbivores.Rabbit;
import entity.predators.Fox;
import entity.predators.Wolf;

import java.util.List;
import java.util.function.Predicate;

public class PrintStatistic {

    public static void printAll(List<Organism> predator, List<Organism> herb, int cell) {
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
        System.out.println();
    }

}


