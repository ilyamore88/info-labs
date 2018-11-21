package Chat;

import java.io.*;
import java.net.Socket;

public class Client {
    static String host = "0.0.0.0";
    static int port = 32000;

    public static void main(String[] args) {
        Socket fromServer = null;
        BufferedReader in = null;
        PrintWriter out = null;
        BufferedReader inputBuf = null;
        try {
            String clientMsg, serverMsg;
            System.out.println("Connecting to " + host + ":" + port);
            fromServer = new Socket(host, port);    //Создаём сокет
            in = new BufferedReader(new InputStreamReader(fromServer.getInputStream()));
            out = new PrintWriter(fromServer.getOutputStream(), true);
            inputBuf = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                if (in.ready()) {   //Если от сервера что-то пришло, а мы это не прочитали, то читаем
                    serverMsg = in.readLine();
                    System.out.println(serverMsg);
                }
                if (inputBuf.ready()) {     //Если мы что-то ввели, то отправляем строку серверу
                    clientMsg = inputBuf.readLine();
                    out.println(clientMsg);
                    if (clientMsg.contains("exit")) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
                inputBuf.close();
                fromServer.close();
            } catch (IOException ex) {
            }
        }
    }
}
