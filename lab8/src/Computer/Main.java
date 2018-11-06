package Computer;

import Computer.classes.*;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.writeData("Hello, World!");
        monitor.shutdown("Ilya");

        Printer printer = new Printer();
        printer.writeData("Hello, World??");
        printer.printError();

        HardDrive hd = new HardDrive();
        hd.addData("This is a first data");
        System.out.println("HardDrive: " + hd.getData());
        if (hd.isHard()) {
            System.out.println("okay, bro...");     //Сейчас час ночи, если что
        }

        MainMemory mm = new MainMemory();
        mm.addData("я не знаю, что написать");
        mm.addData("услышал слово угольки");
        System.out.println("MainMemory: " + mm.getData());
        if (!mm.isAlsoHard()) {
            System.out.println("It's bad");
        }

        Keyboard keyboard = new Keyboard();
        if (keyboard.isCapsLock()) {
            System.out.println("Turn off Caps!");
        } else {
            System.out.println("All ok.");
        }
        keyboard.setCapsLock(true);
        keyboard.pushButton("F");

        Mouse mouse = new Mouse();
        mouse.setCurrentPos(1, 4);
        mouse.getCurrentPos();
        mouse.pushButton("Left button");

        Processor processor = new Processor();
        processor.setFrequency(4);
        System.out.println("Processor's frequency is " + processor.getFrequency() + " GHz");
        processor.transferFromTo(hd, monitor);
        processor.transferFromTo(hd, printer);
        processor.transferFromTo(mm, monitor);
        processor.transferFromTo(mm, printer);

        ComputerBus cb = new ComputerBus();
        cb.setBitDepth(16);
        System.out.println("ComputerBuses bit depth is " + cb.getBitDepth() + " bit");
        cb.transferFromTo(hd, monitor);
        cb.transferFromTo(hd, printer);
        cb.transferFromTo(mm, monitor);
        cb.transferFromTo(mm, printer);
    }
}