package com.crommvardek.designpatternexamples.behavioral.command;

public class LightsOnCommand implements Command {

    private Light light;

    LightsOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
