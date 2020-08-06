package com.crommvardek.designpatternexamples.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class CountryHouseFactoryTest {

    private AbstractHouseFactory countryHouseFactory = new CountryHouseFactory();

    @Test
    public void createWallMakesABrickWall(){
        AbstractWall wall = countryHouseFactory.createWall();

        Assert.assertTrue(wall instanceof BrickWall);
    }

    @Test
    public void createRoof(){
        AbstractRoof roof = countryHouseFactory.createRoof();

        Assert.assertTrue(roof instanceof TileRoof);
    }
    @Test
    public void createDoor(){
        AbstractDoor door = countryHouseFactory.createDoor();

        Assert.assertTrue(door instanceof WoodDoor);
    }
    @Test
    public void createWindow(){
        AbstractWindow window = countryHouseFactory.createWindow();

        Assert.assertTrue(window instanceof DoubleGlazedWindow);
    }



}
