import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CallerServlet")
public class CallerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException   {
        // URL of the second program
        String url = "http://localhost:8081/SumServlet";

        // Make an HTTP request to the second program
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        // Read the response from the second program
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String responseBody = new java.util.Scanner(connection.getInputStream()).useDelimiter("\\A").next();
            // Print the response to the client
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("The sum of 2+2 is: " + responseBody);
        } else {
            response.sendError(responseCode, "Failed to get the sum");
            throw new ServletException("This was a problem, I think!");
        }
    }
}

