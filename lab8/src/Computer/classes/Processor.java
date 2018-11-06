package Computer.classes;

import Computer.interfaces.DataTransfer;

public class Processor implements DataTransfer {
    private int frequency;

    @Override
    public void transferFromTo(HardDrive hardDrive, Monitor monitor) {
        if (hardDrive.getData().isEmpty()) {
            System.out.println("HardDrive is empty!");
        } else {
            monitor.writeData(hardDrive.getData());
        }
    }

    @Override
    public void transferFromTo(HardDrive hardDrive, Printer printer) {
        if (hardDrive.getData().isEmpty()) {
            System.out.println("HardDrive is empty!");
        } else {
            printer.writeData(hardDrive.getData());
        }
    }

    @Override
    public void transferFromTo(MainMemory mainMemory, Monitor monitor) {
        if (mainMemory.getData().isEmpty()) {
            System.out.println("HardDrive is empty!");
        } else {
            monitor.writeData(mainMemory.getData());
        }
    }

    @Override
    public void transferFromTo(MainMemory mainMemory, Printer printer) {
        if (mainMemory.getData().isEmpty()) {
            System.out.println("HardDrive is empty!");
        } else {
            printer.writeData(mainMemory.getData());
        }
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
