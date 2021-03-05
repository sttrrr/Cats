
package com.company;

public class Cat {

    String name;
    int weight;
    int originWeight = weight;

    public Cat()  {}

    public int getOriginWeight() {
        return originWeight;
    }

    public void setOriginWeight(int originWeight) {
        this.originWeight = originWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Cat (int weight, String name, int originWeight )
    {
        this.weight = weight;
        this.name = name;
        this.originWeight = weight;

    }



    public String getCatWeightAndName() {

        return ("Кот " + name + " имеет вес: " + originWeight + "г");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




            public int getEat(){
                weight = (originWeight + 700);

                System.out.println("Вес кота" + name + ": " + originWeight + "г");
                return weight;
        }
            public int getMeow(){
                weight = (originWeight - 5);
                System.out.println("Вес кота" + name + ": " + originWeight + "г");
                return weight;
        }



        public String getStatus () {
            if (weight == originWeight - 200) {
              return "Dead";
            } else if (weight == originWeight + 600) {
                 return "Boom";
            } else {
            return "Cat is normal";
            }


    }

}
