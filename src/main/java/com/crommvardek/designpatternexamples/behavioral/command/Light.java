package com.crommvardek.designpatternexamples.behavioral.command;

public class Light {

    private boolean isOn = false;

    Light(){}

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

}
