// MathService.java
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class MathService {

    public static void main(String[] args) throws IOException {
        // Create an HTTP server
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Create a context for the "/add" endpoint
        server.createContext("/add", new MathHandler());

        // Start the server
        server.start();
    }

    static class MathHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Perform the math operation
            int num1 = 2;
            int num2 = 2;
            int sum = num1 + num2;

            // Convert the result to a string
            String result = Integer.toString(sum);

            // Send the result as the response
            exchange.sendResponseHeaders(200, result.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(result.getBytes());
            }
        }
    }
}

