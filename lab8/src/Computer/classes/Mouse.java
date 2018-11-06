package Computer.classes;

import Computer.interfaces.PeripheralsIn;

public class Mouse implements PeripheralsIn {
    private Pos currentPos = new Pos();

    @Override
    public void pushButton(String button) {
        System.out.println(button + " has pushed");
    }

    public void getCurrentPos() {
        System.out.println("Mouse:");
        System.out.println("Current x: " + currentPos.getX());
        System.out.println("Corrent y: " + currentPos.getY());
    }

    public void setCurrentPos(int x, int y) {
        this.currentPos.setPosition(x, y);
    }
}
