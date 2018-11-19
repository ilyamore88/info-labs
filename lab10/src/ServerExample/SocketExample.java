package ServerExample;

public class SocketExample {
    public static void main(String[] args) {
        String host = "0.0.0.0";
        int port = 32000;
        Thread server = new Server(port);
        server.start();
        Thread client = new Client(host, port, 1);
        client.start();
    }
}
