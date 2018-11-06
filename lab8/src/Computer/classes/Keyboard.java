package Computer.classes;

import Computer.interfaces.PeripheralsIn;

public class Keyboard implements PeripheralsIn {
    private boolean isCapsLock;

    @Override
    public void pushButton(String button) {
        System.out.println(button + " has pushed");
    }

    public boolean isCapsLock() {
        return isCapsLock;
    }

    public void setCapsLock(boolean capsLock) {
        isCapsLock = capsLock;
    }
}
