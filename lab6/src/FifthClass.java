public class FifthClass {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth-01", 6371.0, 149.6);
        System.out.println(planet.name);
        planet.setName("Earth");
        System.out.println(planet.getName());
        System.out.println(planet.toThousandKm("radius"));

        planet.satellite = new Satellite("Moon", 1737.0, 648.0);
        planet.getSatelliteInfo();
        System.out.println(planet.satellite.getPeriod());
        System.out.println(planet.satellite.getPeriodInDays());
    }
}
