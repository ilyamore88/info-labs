public class MainForSpy {
    public static void main(String[] args) {
        Spy spy = new Spy();
        spy.setName("Руслан Боширов");
        spy.setRealName("Анатолий Чепига");
        spy.setSquad(47);

        spy.print();
        System.out.println("Name with getter: "+spy.getName());
        System.out.println("Real name with getter: "+spy.getRealName());
        System.out.println("Squad with getter: "+spy.getSquad());
    }
}
