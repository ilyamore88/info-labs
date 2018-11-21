package Chat;

import java.io.*;
import java.net.Socket;

public class ClientStream implements Runnable {
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    int id;

    public ClientStream(Socket socket, int id) {
        try {
            this.socket = socket;
            this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            this.id = id;
        } catch (IOException ex) {
        }
    }

    @Override
    public void run() {
        try {
            String input;
            while ((input = in.readLine()) != null) {   //Если получаем сообщение от пользователя, то вызываем метод сервера
                String msg = input;
                Server.getMessage(msg, this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
            } catch (IOException ex) {
            }
        }
    }
}
