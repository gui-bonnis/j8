package j.j8.network.Url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class WebSiteReader {

    public static void main(String[] args) {
        String nextLine;
        URL url = null;
        URLConnection urlConn = null;

        try {
            // Assume index.html is a default home page name
            url = new URL("http://www.google.com");
            urlConn = url.openConnection();
        } catch (IOException e) {
            System.out.println("Can't connect to the provided URL:" + e);
        }

        try (InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream(), StandardCharsets.UTF_8);
             BufferedReader buff = new BufferedReader(inStream)) {

            // Read and print the content of the Google's home page
            while (true) {
                nextLine = buff.readLine();
                if (null != nextLine) {
                    System.out.println(nextLine);
                } else {
                    break;
                }
            }
        } catch (IOException ioe) {
            System.out.println("Can't read from the Internet: " +
                    ioe);
        }
    }
}
