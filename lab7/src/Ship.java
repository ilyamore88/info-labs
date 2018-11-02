public class Ship {
    private String title;
    private String captainName;
    private int port;
    private char type;

    public void updateShipInfo(String title, String captainName, int port, char type) {
        this.title = title;
        this.captainName = captainName;
        this.port = port;
        this.type = type;
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }

//    public void updateShipInfo(String captainName, String title, int port, char type) {
//        this.title = title;
//        this.captainName = captainName;
//        this.port = port;
//        this.type = type;
//        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
//    }

    public void updateShipInfo(String title, int port, char type) {
        this.title = title;
        this.port = port;
        this.type = type;
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }

    public void updateShipInfo(String title, char type, int port) {
        this.title = title;
        this.port = port;
        this.type = type;
        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
    }

//    public void updateShipInfo(String captainName, int port, char type) {
//        this.captainName = captainName;
//        this.port = port;
//        this.type = type;
//        System.out.println("\nTitle: " + this.title + "\nCaptain's name: " + this.captainName + "\nPort: " + this.port + "\nType: " + this.type);
//    }
}
