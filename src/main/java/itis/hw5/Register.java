package itis.hw5;

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
        if (status > 0) {
            printWriter.print("<h1>User succesfully saved</h1>");
            request.getRequestDispatcher("index.html").include(request, response);
        } else {
            printWriter.print("Something went wrong");
        }


        printWriter.close();
    }

}
