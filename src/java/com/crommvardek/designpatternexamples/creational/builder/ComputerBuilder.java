package java.com.crommvardek.designpatternexamples.creational.builder;

public interface ComputerBuilder {

    ComputerBuilder withOS(String OS);

    ComputerBuilder setMbOfRAM(int mbOfRAM);

    ComputerBuilder withCores(int nbrOfCores);

    ComputerBuilder addPorts(int USBports);

    ComputerBuilder removePorts(int USBports);

    ComputerBuilder enableWifiConnector();

    ComputerBuilder disableWifiConnector();

    ComputerBuilder withHDDMemoryOf(float hddMemoryInGb);

    ComputerBuilder withSSDMemoryOf(float ssdMemoryInGb);

    Computer build();

}
