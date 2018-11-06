package Computer.classes;

import Computer.interfaces.PeripheralsOut;

public class Printer implements PeripheralsOut {
    @Override
    public void writeData(String data) {
        System.out.println("Printer: " + data);
    }

    public int printError() {
        System.out.print("Printer: ");
        for (int i = 0; i < 600; i++) {
            if (i % 100 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print((char) i);         //Возможно реализую рандом, если не поленюсь
        }
        System.out.println();
        return 1;
    }
}
