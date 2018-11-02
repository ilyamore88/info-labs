public class ShipTest {
    public static void main(String[] args) {
        Ship sh1 = new Ship();
        sh1.updateShipInfo("Abc", "Ilya", 2, 'A');
        sh1.updateShipInfo("Cdb", 4, 'C');
        sh1.updateShipInfo("Hex", 'G', 14);
    }
}
