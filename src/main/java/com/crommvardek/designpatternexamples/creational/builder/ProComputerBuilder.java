package com.crommvardek.designpatternexamples.creational.builder;

public class ProComputerBuilder implements ComputerBuilder {

    private String os = "Windows 10 Pro";
    private int mbOfRam = 4096;
    private int nbrOfCores = 4;
    private int nbrOfUSBPorts = 3;
    // In our example, a "pro" computer has a wifi connector and it cannot be removed
    private final boolean hasWifiConnector = true;
    private float hddMemoryInGb = 512.0f;
    private float ssdMemoryInGb = 256.0f;

    public Computer build(){

        return new Computer(os, mbOfRam, nbrOfCores, nbrOfUSBPorts, hasWifiConnector, hddMemoryInGb, ssdMemoryInGb);

    }

    public ComputerBuilder withOS(String OS){
        this.os = OS;
        return this;
    }

    public ComputerBuilder setMbOfRAM(int mbOfRAM){
        this.mbOfRam = mbOfRAM;
        return this;
    }

    public ComputerBuilder withCores(int nbrOfCores){
        if(nbrOfCores > 0){
            this.nbrOfCores = nbrOfCores;
        }
        else {
            throw new NegativeNumberException("Wrong number of Cores, value must be positive");
        }
        return this;
    }

    public ComputerBuilder addPorts(int USBports){
        if (USBports > 0) nbrOfUSBPorts += USBports;

        return this;
    }

    public ComputerBuilder removePorts(int USBports){
        if (USBports > 0) nbrOfUSBPorts += USBports;
        if(nbrOfUSBPorts < 0) nbrOfUSBPorts = 0;
        return this;
    }

    public ComputerBuilder enableWifiConnector() {
        //Always enable the wifi connection.
        return this;
    }

    public ComputerBuilder disableWifiConnector() {
        //Never Disable a wifi connector.
        return this;
    }

    public ComputerBuilder withHDDMemoryOf(float hddMemoryInGb) {
        this.hddMemoryInGb = hddMemoryInGb;
        return this;
    }


    public ComputerBuilder withSSDMemoryOf(float ssdMemoryInGb) {
        this.ssdMemoryInGb = ssdMemoryInGb;
        return this;
    }

}
