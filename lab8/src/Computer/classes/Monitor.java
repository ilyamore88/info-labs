package Computer.classes;

import Computer.interfaces.PeripheralsOut;

public class Monitor implements PeripheralsOut {
    @Override
    public void writeData(String data) {
        System.out.println("Monitor: " + data);
    }

    public void shutdown(String name) {
        System.out.println("Bye, " + name);
    }
}