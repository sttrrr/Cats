package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Kitten Vasya = new Kitten( 250, "Vasya");
        Vasya.setWeight(250);

        System.out.println( Vasya.getCatWeightAndName());
        System.out.println(Color.getRandom());
        Vasya.setName("Вася");
        Vasya.kittenRegurgitate();
        Vasya.kittenRegurgitate();
        Vasya.kittenRegurgitate();
        Vasya.kittenRegurgitate();
        Vasya.getKittenStatus();
        System.out.println( Vasya.getCatWeightAndName());

        

    }
}
