package Computer.classes;

import Computer.interfaces.MemoryKeeper;

public class HardDrive implements MemoryKeeper {
    private String data = "";

    @Override
    public void addData(String data) {
        if (!(this.data.isEmpty())) {
            this.data += "\n";
        }
        this.data += data;
    }

    @Override
    public String getData() {
        return this.data;
    }

    public boolean isHard() {
        System.out.println("Yeah, I'm hard!");
        return true;
    }
}
