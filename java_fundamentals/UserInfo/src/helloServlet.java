import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloServlet")
public class helloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String language = request.getParameter("language");
        String hometown = request.getParameter("hometown");
        response.setContentType("text/html");
        // writes the response
        PrintWriter out = response.getWriter();
        out.write("<h1>Hello World, from " + firstName +" "+ lastName+ "</h1>");
        out.write("<h2>Your favorite language is " + language+ "</h2>");
        out.write("<h2>Your Hometown is " + hometown+ "</h2>");
    }
}
