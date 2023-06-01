package com.vanas.game.dracak;

import java.util.Random;

public class RandomGenerator {

    public static int randomZRozsahu(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        System.out.println(randomZRozsahu(0, 6));
    }

}
