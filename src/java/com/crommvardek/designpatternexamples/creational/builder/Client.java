package java.com.crommvardek.designpatternexamples.creational.builder;

//Client is the consumer of the builder.
public class Client {

    public void buildSomeComputers(){

        ComputerBuilder basicComputerBuilder = new BasicComputerBuilder();
        ProComputerBuilder proComputerBuilder = new ProComputerBuilder();

        Computer basicComputer = basicComputerBuilder
                                .withCores(4)
                                .setMbOfRAM(4096)
                                .addPorts(2)
                                .withOS("Linux Ubuntu")
                                .enableWifiConnector()
                                .build();

        Computer proComputer = proComputerBuilder
                               .withSSDMemoryOf(512)
                               .withHDDMemoryOf(0f)
                               .withCores(8)
                               .setMbOfRAM(8192)
                               .build();

    }


}
