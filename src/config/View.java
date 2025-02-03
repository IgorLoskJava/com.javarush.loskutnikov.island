package config;

import entity.Organism;
import entity.herbivores.*;
import entity.plants.Grass;
import entity.predators.*;

import java.util.List;

public class View {

    public static void locationView(int [] location) {
        System.out.println("_".repeat(90));
        System.out.println("Все организмы в локации "
                + location[0] + ". Размер локации: " + location[1] + " на " + location[2] + ".");
    }

    public static void predatorsView(List<Organism> organisms) {

        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Wolf.class)).count() + "\uD83D\uDC3A ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Boa.class)).count() + "\uD83D\uDC0D ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Bear.class)).count() + "\uD83D\uDC3B ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Eagle.class)).count() + "\uD83E\uDD85 ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Fox.class)).count() + "\uD83E\uDD8A ");

    }

    public static void herbivoresView(List<Organism> organisms) {

        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Horse.class)).count() + "\uD83D\uDC0E ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Rabbit.class)).count() + "\uD83D\uDC07 ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(WildBoar.class)).count() + "\uD83D\uDC17 ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Buffalo.class)).count() + "\uD83D\uDC03 ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Caterpillar.class)).count() + "\uD83D\uDC1B ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Deer.class)).count() + "\uD83E\uDD8C ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Duck.class)).count() + "\uD83E\uDD86 ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Goat.class)).count() + "\uD83D\uDC10 ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Mouse.class)).count() + "\uD83D\uDC01 ");
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Sheep.class)).count() + "\uD83D\uDC11 ");

    }

    public static void plantsView(List<Organism> organisms) {
        System.out.print(organisms.stream()
                .filter(organism -> organism.getClass().equals(Grass.class)).count() + "\uD83C\uDF3F");
        System.out.println();
    }
}

