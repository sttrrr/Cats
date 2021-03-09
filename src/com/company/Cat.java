
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


            public void catEat() {
                if (isAlive = true && weight < 2000) {
                    weight = weight + 100;
                    if (weight > 2000) {
                        isAlive = false;
                    }
                }
            }
            public void catMeow() {
                if(isAlive = true && weight>500) {
                    weight = weight - 10;
                    if(weight<500){
                        isAlive = false;
                    }
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

