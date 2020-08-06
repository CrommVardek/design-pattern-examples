package com.crommvardek.designpatternexamples.behavioral.command;

public class CommandExample {

    public static void callCommandExample(){

        Light light = new Light();

        Command com1 = new LightsOnCommand(light);
        Command com2 = new LightsOffCommand(light);

        RemoteControl rc = new RemoteControl();

        rc.addCommand(com1);
        rc.addCommand(com2);

        rc.runCommandsInOrder();
    }

    // Example using method reference
    public static void callCommandOtherExample(){

        Light light = new Light();

        // Signature of the methods must match the functional interface Command.
        Command com1 = light::turnOn;
        Command com2 = light::turnOff;

        RemoteControl rc = new RemoteControl();

        rc.addCommand(com1);
        rc.addCommand(com2);

        rc.runCommandsInOrder();
    }

}
