package com.crommvardek.designpatternexamples.behavioral.command;

public class LightsOffCommand implements Command{

    private Light light;

    LightsOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
