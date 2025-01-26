package view;

import entity.Organism;
import entity.herbivores.Horse;
import entity.herbivores.Rabbit;
import entity.predators.Boa;
import entity.predators.Wolf;

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

    }
}

