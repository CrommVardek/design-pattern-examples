package com.crommvardek.designpatternexamples.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class CityHouseFactoryTest {

    private AbstractHouseFactory cityHouseFactory = new CityHouseFactory();

    @Test
    public void createWallMakesABlockWall(){
        AbstractWall wall = cityHouseFactory.createWall();

        Assert.assertTrue(wall instanceof BlockWall);
    }

    @Test
    public void createRoof(){
        AbstractRoof roof = cityHouseFactory.createRoof();

        Assert.assertTrue(roof instanceof FlatRoof);
    }
    @Test
    public void createDoor(){
        AbstractDoor door = cityHouseFactory.createDoor();

        Assert.assertTrue(door instanceof MetalDoor);
    }
    @Test
    public void createWindow(){
        AbstractWindow window = cityHouseFactory.createWindow();

        Assert.assertTrue(window instanceof TripleGlazedWindow);
    }

}
