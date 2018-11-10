import java.util.ArrayList;

public class Research {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Sample> samples = new ArrayList<>();
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }
}

class Sample {
    private int id;

    public Sample() {
        this.id = this.hashCode();      //Уникальный ID из hashCode объекта класса
    }

    @Override
    public String toString() {
        return "id: " + id;
    }
}
