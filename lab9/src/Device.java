public class Device {
    private int id;
    private int capacity;

    public Device(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getInfo() {
        return "id: " + this.id + "; capacity: " + this.capacity + ";";
    }
}
