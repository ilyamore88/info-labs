package Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server {
    static LinkedList<ClientStream> users = new LinkedList<>();     //Список всех пользователей

    public static void main(String[] args) {
        ServerSocket server = null;

        try {
            server = new ServerSocket(32000);   //Создаём серверный сокет
            while (true) {
                Socket socket = server.accept();    //Получаем сокет, если кто-то подключается
                serverMessage("User #" + (users.size() + 1) + " connected");
                users.add(new ClientStream(socket, users.size() + 1));  //Добавляем поток для пользователя в массив и запускаем новый поток
                new Thread(users.getLast()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException ex) {
            }
        }
    }

    static synchronized void serverMessage(String message) {     //Отправка серверного сообщения
        System.out.println(message);
        for (ClientStream user : users) {
            user.out.println(message);
        }
    }

    public static synchronized void getMessage(String message, ClientStream fromUser) {      //Рассылка сообщения пользователя всем остальным
        System.out.println("Message: \"" + message + "\" from #" + fromUser.id);
        fromUser.out.println("Me:\n" + message);
        for (ClientStream user : users) {
            if (user != fromUser) {
                user.out.println("Other: #" + fromUser.id + "\n" + message);
            }
        }
    }
}
