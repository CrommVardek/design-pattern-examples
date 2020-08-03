package com.crommvardek.designpatternexamples.creational.factory;

public class Banana extends Fruit {
    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public boolean hasSeeds() {
        return true;
    }
}
