package com.example.huascar.kaiju;

/**
 * Created by huascar on 01/11/2017.
 */

public abstract class Kaiju {
    String name;
    int healthValue;
    int attackValue;

    public String roar() {
        return "Roar!";
    }

    public void attack(Vehicle vehicle) {
        vehicle.healthValue -= attackValue;
    }
}
