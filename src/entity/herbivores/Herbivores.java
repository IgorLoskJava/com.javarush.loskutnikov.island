package entity.herbivores;

import config.MoveDirection;
import entity.Organism;


public class Herbivores extends Organism {

    @Override
    public void move(Organism organisms) {
        int[] moveDir = MoveDirection.moveDir();
        int defX = organisms.x;
        int defY = organisms.y;

        organisms.x = organisms.x + (organisms.speedMove * moveDir[0]);
        organisms.y = organisms.y + (organisms.speedMove * moveDir[1]);

        if (organisms.cell == 0) {
            if (organisms.x < 0 || organisms.y < 0 || organisms.y > 20) {
                organisms.x = defX;
                organisms.y = defY;
            } else if (organisms.x > 100) {
                organisms.x = organisms.x - 100;
                organisms.cell = 1;
            }

        }

        if (organisms.cell == 1) {
            if (organisms.x < 0) {
                organisms.x = organisms.x + 100;
                organisms.cell = 0;
            } else if (organisms.x > 100) {
                organisms.x = organisms.x - 100;
                organisms.cell = 2;
            }
            if (organisms.y < 0 || organisms.y > 20) {
                organisms.y = defY;
            }
        }

        if (organisms.cell == 2) {
            if (organisms.x > 100 || organisms.y < 0 || organisms.y > 20) {
                organisms.x = defX;
                organisms.y = defY;
            } else if (organisms.x < 0) {
                organisms.x = organisms.x - 100;
                organisms.cell = 1;
            }

        }
    }

}