package com.company;

import java.awt.*;

public class Kitten extends Cat {

    public Kitten(){};

    public Kitten(int weight, String name){
        super(weight,name);

        if(weight<=200 || weight >=1000){
            isAlive = false;
        }
        else{
            isAlive = true;
        }
    }

    public void kittenDrink(){
        if(isAlive = true && weight<1000){
            weight+=150;
            if(weight>1000){
                isAlive = false;
            }
        }
        else{
            System.out.println("error");
        }
    }
    public void kittenRegurgitate(){
        if(isAlive = true && weight>200){
            weight-=50;
            if(weight<200){
                isAlive = false;
            }
        }
        else {
            System.out.println("Error");
        }
    }

    public String getKittenStatus(){
        if (weight <= 200){
            return "Dead";
        }
        else if(weight >= 1000){
            return "Boom";
        }
        else{
            return "Cat is normal";
        }

    }
}
