package com.company;

import java.util.Random;

public class Cat {


    String name;
    int weight;
    boolean isAlive;

    public Cat() { }



    public Cat(int weight, String name, boolean isAlive, String Color)  {}





    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat(int weight, String name)
    {
        this.weight = this.weight;
        this.name = this.name;

            this.isAlive = true;
        }


    public Cat(int weight, String name, boolean isAlive)
    {
      this.weight = this.weight;
        this.name = this.name;

        if(this.weight >2000){
            this.isAlive = false;
        }
        else if(this.weight <500){
            this.isAlive = false;
        }
        else{
            this.isAlive = true;
        }
    }



    public String getCatWeightAndName() {

        return ("Кот " + name + " имеет вес: " + weight + "г " + isAlive +" Цвет кота: " + Color.getRandom());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void catEat() {
        if (isAlive = true && weight < 2000) {
            weight = weight + 100;
            if (weight > 2000) {
                isAlive = false;
            }
        }
        else{
            System.out.println("Нельзя кормить мертвого кота( Он уже взорвался");
        }
    }
    public void catMeow() {
        if(isAlive = true && weight>500) {
            weight = weight - 10;
            if(weight<500){
                isAlive = false;
            }
        }
        else {
            System.out.println("Кот замяукался до смерти");
        }
    }


    public String getStatus () {
        if (weight <= 500) {

            return "Dead";
        } else if (weight >=2000) {

            return "Boom";
        } else {
            return "Cat is normal";
        }


    }

}
