package com.example.huascar.kaiju;

/**
 * Created by huascar on 01/11/2017.
 */

public class Chopper extends Vehicle{
    public Chopper(String type, int healthValue) {
        super(type, healthValue);
    }

    /**
     * Created by huascar on 01/11/2017.
     */

    public static class Kaijuman extends Kaiju{

        public Kaijuman(String name, int healthValue, int attackValue) {
            super(name, healthValue, attackValue);
        }

        public String roar() {
            return "Roar!";
        }

    }
}
