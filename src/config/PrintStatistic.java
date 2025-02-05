package config;


import entity.Organism;
import entity.herbivores.Mouse;
import entity.herbivores.Rabbit;
import entity.plants.Grass;
import entity.predators.Eagle;
import entity.predators.Fox;
import entity.predators.Wolf;

import java.util.List;
import java.util.function.Predicate;

public class PrintStatistic {

    public static void printAll(List<Organism> predator, List<Organism> herb, List<Organism> grass, int cell) {

        System.out.print("На острове, в ячейке №" + cell + " находятся: ");
        System.out.print(predator.stream()
                .filter(organism -> organism.getClass().equals(Wolf.class))
                .filter(organism -> organism.cell == cell).count() + Settings.wolfIcon + "   ");
        System.out.print(predator.stream()
                .filter(organism -> organism.getClass().equals(Fox.class))
                .filter(organism -> organism.cell == cell).count() + Settings.foxIcon + "   ");
        System.out.print(predator.stream()
                .filter(organism -> organism.getClass().equals(Eagle.class))
                .filter(organism -> organism.cell == cell).count() + Settings.eagleIcon + "   ");
        System.out.print(herb.stream()
                .filter(organism -> organism.getClass().equals(Rabbit.class))
                .filter(organism -> organism.cell == cell).count() + Settings.rabbitIcon + "   ");
        System.out.print(herb.stream()
                .filter(organism -> organism.getClass().equals(Mouse.class))
                .filter(organism -> organism.cell == cell).count() + Settings.mouseIcon + "   ");
        System.out.print(grass.stream()
                .filter(organism -> organism.getClass().equals(Grass.class))
                .filter(organism -> organism.cell == cell).count() + Settings.grassIcon + "   ");


        System.out.println();


    }

    public static void printTest(List<Organism> predator, List<Organism> herb, List<Organism> grass){
        System.out.println(predator.stream()
                .filter(organism -> organism.getClass().equals(Wolf.class))
                .count() + Settings.wolfIcon + "   ");
    }

}


