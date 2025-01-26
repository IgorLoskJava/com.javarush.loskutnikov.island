package config;

import java.util.Scanner;

public class Menu {

    public static int [] start (){
        int [] inputParameters = new int[3];
        System.out.println("Добро пожаловать на остров!");
        System.out.println("Введите параметры для симуляции острова:");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите количество локаций на острове (от 1 до 2):");
        inputParameters[0] = userInput.nextInt();
        System.out.println("Введите ширину каждой локации (от 1 до 100):");
        inputParameters[1] = userInput.nextInt();
        System.out.println("Введите длинну каждой локации (от 1 до 20):");
        inputParameters[2] = userInput.nextInt();
        System.out.println("Спасибо! Игра на выживаниие началась!");

        return inputParameters;
    }
}
