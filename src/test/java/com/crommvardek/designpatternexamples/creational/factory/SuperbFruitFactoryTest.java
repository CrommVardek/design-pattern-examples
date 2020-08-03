package com.crommvardek.designpatternexamples.creational.factory;

import org.junit.Assert;
import org.junit.Test;

public class SuperbFruitFactoryTest {

    FruitFactory superbFruitFactory = new SuperbFruitFactory();

    @Test
    public void incorrectFruitReturnsNull(){

        Fruit nullFruit = superbFruitFactory.getFruit("This is a car");

        Assert.assertNull(nullFruit);

    }

    @Test
    public void getBananaReturnsBanana(){

        Fruit banana = superbFruitFactory.getFruit("Banana");

        Assert.assertTrue(banana instanceof Banana);

    }

    @Test
    public void getAppleReturnsApple(){

        Fruit apple = superbFruitFactory.getFruit("Apple");

        Assert.assertTrue(apple instanceof Apple);

    }

}
