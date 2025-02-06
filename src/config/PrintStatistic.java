package config;

import entity.Organism;
import entity.herbivores.*;
import entity.plants.Grass;
import entity.predators.*;

import java.util.List;

public class PrintStatistic {

    public static void printStatistic(List<Organism> predatorList, List<Organism> herbList, List<Organism> grassList){
        System.out.println("-".repeat(50));
        System.out.print(predatorList.stream()
                .filter(organism -> organism.getClass().equals(Wolf.class)).count() + Settings.iconWolf + ",");
        System.out.print(predatorList.stream()
                .filter(organism -> organism.getClass().equals(Boa.class)).count() + Settings.iconBoa + ",");
        System.out.print(predatorList.stream()
                .filter(organism -> organism.getClass().equals(Fox.class)).count() + Settings.iconFox + ",");
        System.out.print(predatorList.stream()
                .filter(organism -> organism.getClass().equals(Bear.class)).count() + Settings.iconBear + ",");
        System.out.print(predatorList.stream()
                .filter(organism -> organism.getClass().equals(Eagle.class)).count() + Settings.iconEagle + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Horse.class)).count() + Settings.iconHorse + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Deer.class)).count() + Settings.iconDeer + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Rabbit.class)).count() + Settings.iconRabbit + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Mouse.class)).count() + Settings.iconMouse + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Goat.class)).count() + Settings.iconGoat + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Sheep.class)).count() + Settings.iconSheep + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(WildBoar.class)).count() + Settings.iconWildBoar + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Buffalo.class)).count() + Settings.iconBuffalo + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Duck.class)).count() + Settings.iconDuck + ",");
        System.out.print(herbList.stream()
                .filter(organism -> organism.getClass().equals(Caterpillar.class)).count() + Settings.iconCaterpillar + ",");
        System.out.print(grassList.stream()
                .filter(organism -> organism.getClass().equals(Grass.class)).count() + Settings.iconGrass + ".");
    }

}


