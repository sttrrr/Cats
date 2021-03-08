
package com.company;

public class Cat {

    String name;
    int weight;
    boolean isAlive;
    int originWeight;

    public Cat()  {}





    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat (int weight, String name)
    {
        isAlive = true;
        this.weight = weight;
        this.name = name;
        originWeight = weight;

    }



    public String getCatWeightAndName() {

        return ("Кот " + name + " имеет вес: " + weight + "г");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




            public int catEat(){

                weight = weight + 100;
                return weight;


             }
            public int catMeow() {

                weight = weight - 5;
                return weight;
            }



        public String getStatus () {
            if (weight <= originWeight - 50) {
                isAlive = false;
                return "Dead";
            } else if (weight >= originWeight + 600) {
                isAlive = false;
                return "Boom";
            } else {
                return "Cat is normal";
            }


        }

}
