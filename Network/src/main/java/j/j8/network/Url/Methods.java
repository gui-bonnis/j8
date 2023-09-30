package j.j8.network.Url;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Methods {
    public static void main(String[] args) {
        // Example 1
        URL url = null;
        try {
            url = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = url.openStream()) {
            // Read and process the data from the URL
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Example 2
        try {
            url = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        URLConnection connection = null;
        try {
            connection = url.openConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        connection.setRequestProperty("User-Agent", "MyJavaApp");
        try (InputStream inputStream = connection.getInputStream()) {
            // Read and process the data from the URL with additional headers
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Example 3
        try {
            url = new URL("https://www.example.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        URI uri = null;
        try {
            uri = url.toURI();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println("URI: " + uri);

    }
}
