package com.company;

public class Main {

    public static void main(String[] args) {
        Cat Vasya = new Cat();
        Vasya.setWeight(890);
        System.out.println( Vasya.getCatWeightAndName());

        Vasya.setName("Вася");
        System.out.println( Vasya.getCatWeightAndName());
        System.out.println( Vasya.getOriginWeight());
        System.out.println( Vasya.getEat());
        System.out.println( Vasya.getStatus());
        

    }
}
