package j.j8.network.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StockQuoteServer {
    public static void main(java.lang.String[] args) {
        ServerSocket serverSocket = null;
        Socket client = null;
        BufferedReader inbound = null;
        OutputStream outbound = null;
        try {
            // Create a server socket
            serverSocket = new ServerSocket(3000);
            System.out.println("Waiting for a quote request...");
            while (true) {
                // Wait for a request
                client = serverSocket.accept();
                // Get the streams
                inbound = new BufferedReader(new InputStreamReader(client.getInputStream()));
                outbound = client.getOutputStream();
                String symbol = inbound.readLine();
                //Generate a random stock price
                String price = Double.toString(Math.random() * 100);
                outbound.write(("\n The price of " + symbol + " is " + price + "\n").getBytes());
                System.out.println("Request for " + symbol + " has been processed - the price of " + symbol + " is " + price + "\n");
                outbound.write("End\n".getBytes());
            }
        } catch (IOException ioe) {
            System.out.println("Error in Server: " + ioe);
        } finally {
            try {
                inbound.close();
                outbound.close();
            } catch (Exception e) {
                System.out.println("StockQuoteServer: can't close streams" + e.getMessage());
            }
        }
    }
}
