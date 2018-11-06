package Computer.classes;

import Computer.interfaces.MemoryKeeper;

public class MainMemory implements MemoryKeeper {
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
        return data;
    }

    public boolean isAlsoHard() {
        System.out.println("No, but I'm main");
        return false;
    }
}
