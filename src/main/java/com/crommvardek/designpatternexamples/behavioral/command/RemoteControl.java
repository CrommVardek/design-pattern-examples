package com.crommvardek.designpatternexamples.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    List<Command> commandList = new ArrayList<>();

    RemoteControl(){}

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void runCommandsInOrder(){
        commandList.stream().forEach(c -> c.execute());
        commandList.clear();
    }

    public void runAllCommandUnordered(){
        commandList.parallelStream().forEach(c->c.execute());
        commandList.clear();
    }

}
