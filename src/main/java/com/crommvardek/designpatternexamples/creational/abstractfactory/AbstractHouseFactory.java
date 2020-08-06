package com.crommvardek.designpatternexamples.creational.abstractfactory;

public interface AbstractHouseFactory {

    AbstractWall createWall();

    AbstractDoor createDoor();

    AbstractRoof createRoof();

    AbstractWindow createWindow();
}
