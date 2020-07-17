package java.com.crommvardek.designpatternexamples.creational.builder;

public class BasicComputerBuilder implements ComputerBuilder {

    private String os = "Windows 10";
    private int mbOfRam = 1024;
    private int nbrOfCores = 2;
    private int nbrOfUSBPorts = 1;
    private boolean hasWifiConnector = false;
    // In this example, a basic computer cannot have its HDD nor SSD memory changed.
    private final float hddMemoryInGb = 512.0f;
    private final float ssdMemoryInGb = 256.0f;

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

    public ComputerBuilder enableWifiConnector(){
        this.hasWifiConnector = true;
        return this;
    }

    public ComputerBuilder disableWifiConnector(){
        this.hasWifiConnector = false;
        return this;
    }

    public ComputerBuilder withHDDMemoryOf(float hddMemoryInGb) {
        //Cannot change the HDD Memory.
        return this;
    }

    public ComputerBuilder withSSDMemoryOf(float ssdMemoryInGb) {
        //Cannot change the SSD Memory.
        return this;
    }

}
