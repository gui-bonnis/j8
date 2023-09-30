package j.j8.network.SocketProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int portNumber = 8080;
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                // Handle the client connection
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
