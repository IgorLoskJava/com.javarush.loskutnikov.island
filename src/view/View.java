package view;

import entity.Organism;
import entity.herbivores.*;
import entity.predators.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class View {

    public static void statistic(List<Organism> organisms, int locNumber) {
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Wolf.class)).count() + "\uD83D\uDC3A");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Boa.class)).count() + "\uD83D\uDC0D");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Horse.class)).count() + "\uD83D\uDC0E");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Rabbit.class)).count() + "\uD83D\uDC07");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Boar.class)).count() + "\uD83D\uDC17");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Buffalo.class)).count() + "\uD83D\uDC03");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Caterpillar.class)).count() + "\uD83D\uDC1B");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Deer.class)).count() + "\uD83E\uDD8C");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Duck.class)).count() + "\uD83E\uDD86");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Goat.class)).count() + "\uD83D\uDC10");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Mouse.class)).count() + "\uD83D\uDC01");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Sheep.class)).count() + "\uD83D\uDC11");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Bear.class)).count() + "\uD83D\uDC3B");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Eagle.class)).count() + "\uD83E\uDD85");
        System.out.println("В локации №" + locNumber + " сейчас " + organisms.stream()
                .filter(organism -> organism.getClass().equals(Fox.class)).count() + "\uD83E\uDD8A");


    }
}

