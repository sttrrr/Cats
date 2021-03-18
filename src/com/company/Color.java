package com.company;

import java.net.SocketTimeoutException;
import java.util.Random;

public enum Color {
    Green, gray,black,white, red;
Random random = new Random();
    public static Color getRandom() {
        return values()[(int) (Math.random() *  values().length)];
    }



}


