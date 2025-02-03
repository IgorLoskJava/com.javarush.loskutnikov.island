package config;

import java.util.Arrays;
import java.util.Random;

public class MoveDirection {

    public static int[] moveDir() {
        int[] direction = new int[2];

        Random rnd = new Random();

        switch (rnd.nextInt(5)) {

            case (0):
                direction[0] = 1;
                break;
            case (1):
                direction[0] = -1;
                break;
            case (2):
                direction[1] = 1;
                break;
            case (3):
                direction[1] = -1;
                break;
            default:
                direction[0] = 1;
                direction[1] = 1;
        }

        return direction;
    }
}
