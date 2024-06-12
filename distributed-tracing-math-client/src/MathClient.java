// MathClient.java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MathClient {

    public static void main(String[] args) {
        try {
            // URL of the MathService endpoint
            URL url = new URL("http://localhost:8080/add");

            // Open a connection to the MathService endpoint
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set up the request
            connection.setRequestMethod("GET");

            // Read the response
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Assuming the output is a single line containing the result
                    int result = Integer.parseInt(line);

                    // Print the result
                    System.out.println("The sum of 2 + 2 is: " + result);
                }
            }

            // Close the connection
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

