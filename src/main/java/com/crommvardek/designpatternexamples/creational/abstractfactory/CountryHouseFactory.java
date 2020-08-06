package com.crommvardek.designpatternexamples.creational.abstractfactory;

public class CountryHouseFactory implements AbstractHouseFactory {
    @Override
    public AbstractWall createWall() {
        return new BrickWall();
    }

    @Override
    public AbstractDoor createDoor() {
        return new WoodDoor();
    }

    @Override
    public AbstractRoof createRoof() {
        return new TileRoof();
    }

    @Override
    public AbstractWindow createWindow() {
        return new DoubleGlazedWindow();
    }
}
