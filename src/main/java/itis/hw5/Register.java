package itis.hw5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reg")
public class Register extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");
        String userEmail = request.getParameter("userEmail");
        String userCountry = request.getParameter("userCountry");

        Person person = new Person();
        person.setUserName(userName);
        person.setUserPass(userPass);
        person.setUserEmail(userEmail);
        person.setUserCountry(userCountry);

        int status = PersonDao.save(person);
        request.getRequestDispatcher("index.html").include(request, response);

        if (status > 0) {
            printWriter.print("<h2 class=\"center\"> User succesfully saved</h2>");
        } else {
            printWriter.print("<h2 class=\"center\">Something went wrong, try again later</h2>");
        }

        printWriter.close();
    }

}
