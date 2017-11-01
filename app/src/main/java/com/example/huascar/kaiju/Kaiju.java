package com.example.huascar.kaiju;

/**
 * Created by huascar on 01/11/2017.
 */

public abstract class Kaiju {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String roar();

    public void attack(Vehicle vehicle) {
        vehicle.healthValue -= attackValue;
    }

    public abstract String move();

}
