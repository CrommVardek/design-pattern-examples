package com.crommvardek.designpatternexamples.creational.abstractfactory;

public class CityHouseFactory implements AbstractHouseFactory {
    @Override
    public AbstractWall createWall() {
        return new BlockWall();
    }

    @Override
    public AbstractDoor createDoor() {
        return new MetalDoor();
    }

    @Override
    public AbstractRoof createRoof() {
        return new FlatRoof();
    }

    @Override
    public AbstractWindow createWindow() {
        return new TripleGlazedWindow();
    }
}
