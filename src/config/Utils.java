package config;

import java.util.Random;

public class Utils {


    public static int eatRandomIndex() {
        Random rnd = new Random();
        int index = rnd.nextInt(100);

        if (index > 0 && index <= 10) {
            index = 10;
        } else if (index > 10 && index <= 15) {
            index = 15;
        } else if (index > 15 && index <= 20) {
            index = 20;
        } else if (index > 20 && index <= 40) {
            index = 40;
        } else if (index > 40 && index <= 50) {
            index = 50;
        } else if (index > 50 && index <= 60) {
            index = 60;
        } else if (index > 60 && index <= 70) {
            index = 70;
        }else if (index > 70 && index <= 80){
            index = 80;
        }else if (index > 80 && index <= 90) {
            index = 90;
        }else if (index > 90)
            index = 100;


        return index;
    }


}
