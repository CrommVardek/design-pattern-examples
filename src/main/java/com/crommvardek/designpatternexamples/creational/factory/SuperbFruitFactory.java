package com.crommvardek.designpatternexamples.creational.factory;

public class SuperbFruitFactory implements FruitFactory {


    @Override
    public Fruit getFruit(String name) {

        switch (name.toUpperCase()){
            case "APPLE" : return new Apple();
            case "BANANA" : return new Banana();
        }

        return null;
    }
}
