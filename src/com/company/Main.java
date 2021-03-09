package com.company;

public class Main {

    public static void main(String[] args) {
        Cat Vasya = new Cat();
        Vasya.setWeight(1500);
        System.out.println( Vasya.getCatWeightAndName());

        Vasya.setName("Вася");
        System.out.println( Vasya.getCatWeightAndName());
        Vasya.catEat();
        Vasya.catEat();
        Vasya.catEat();
        Vasya.catEat();
        Vasya.catEat();
        Vasya.catEat();

        System.out.println( Vasya.getStatus());
        

    }
}
