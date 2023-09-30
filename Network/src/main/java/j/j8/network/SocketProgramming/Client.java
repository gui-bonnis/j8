package j.j8.network.SocketProgramming;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        int portNumber = 8080;
        try (Socket socket = new Socket("serverAddress", portNumber)) {
            // Perform operations with the socket
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
