package com.crommvardek.designpatternexamples.creational.builder;

// This is the class we want to build, but is rather "complex" to create and/or not straightforward (because of the long
// constructor method).
public class Computer {

    private final String os;
    private final int mbOfRAM;
    private final int nbrOfCores;
    private final int nbrOfUSBPorts;
    private final boolean hasWifiConnector;
    private final float hddMemoryInGb;
    private final float ssdMemoryInGb;

    protected Computer(String os, int mbOfRAM, int nbrOfCores, int nbrOfUSBPorts, boolean hasWifiConnector, float hddMemoryInGb, float ssdMemoryInGb){
        this.os = os;
        this.mbOfRAM = mbOfRAM;
        this.nbrOfCores = nbrOfCores;
        this.nbrOfUSBPorts = nbrOfUSBPorts;
        this.hasWifiConnector = hasWifiConnector;
        this.hddMemoryInGb = hddMemoryInGb;
        this.ssdMemoryInGb = ssdMemoryInGb;
    }

}
