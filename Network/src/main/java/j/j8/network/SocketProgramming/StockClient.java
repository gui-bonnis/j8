package j.j8.network.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class StockClient {
    public static void main(java.lang.String[] args) {
        if (0 == args.length) {
            System.out.println("Usage: java Client Symbol");
            System.exit(-1);
        }
        Socket clientSocket = null;
        try {
            // Open a client socket connection
            clientSocket = new Socket("localhost", 3000);
            System.out.println("Client: " + clientSocket);
        } catch (UnknownHostException uhe) {
            System.out.println("UnknownHostException: " + uhe);
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe);
        }
        try (OutputStream outbound = clientSocket.getOutputStream();
             BufferedReader inbound = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            // Send stock symbol to the server
            outbound.write((args[0] + "\n").getBytes());
            String quote;
            while (true) {
                quote = inbound.readLine();
                if (0 == quote.length()) continue;
                if (quote.equals("End")) {
                    break;
                }
                System.out.println("Got the quote for " + args[0] + ":" + quote);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
