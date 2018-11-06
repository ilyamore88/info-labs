package Computer.interfaces;

import Computer.classes.HardDrive;
import Computer.classes.MainMemory;
import Computer.classes.Monitor;
import Computer.classes.Printer;

public interface DataTransfer {
    void transferFromTo(HardDrive hardDrive, Monitor monitor);

    void transferFromTo(HardDrive hardDrive, Printer printer);

    void transferFromTo(MainMemory mainMemory, Monitor monitor);

    void transferFromTo(MainMemory mainMemory, Printer printer);
}