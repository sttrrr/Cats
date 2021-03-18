package com.company;

abstract interface Breathe {

    default void breathe(){
        System.out.println("Кот дышит");
    }


}
