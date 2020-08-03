package com.crommvardek.designpatternexamples.creational.factory;

public class Apple extends Fruit {

    @Override
    public String getColor() {
        return "Green and red";
    }

    @Override
    public boolean hasSeeds() {
        return true;
    }
}
