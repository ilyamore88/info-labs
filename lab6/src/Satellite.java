public class Satellite {
    String name;
    Double radius;
    Double period;

    public Satellite(String name, Double radius, Double period) {
        this.name = name;
        this.radius = radius;
        this.period = period;
    }

    public Double getPeriod() {
        return period;
    }

    public Double getPeriodInDays() {
        return period / 24;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Period: " + period);
    }
}
