package config;

import entity.Organism;

import java.util.List;

public class Task {

    public static void moveAll(List<Organism> organismList, int [] startParameters) {
        organismList.stream().forEach(organism -> organism.move(startParameters));

    }
}
