package itis.hw5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/update")
public class UpdatePerson extends HttpServlet {

    private Person personToUpdate;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> personList = PersonDao.getAllPersons();
        String tempId = request.getParameter("id");
        int id = Integer.parseInt(tempId);
        Person person = personList
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .get();
        personToUpdate = person;
        request.getSession().setAttribute("person", person);
        RequestDispatcher dispatcher = request.getRequestDispatcher("updatetable.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String userPass = req.getParameter("userPass");
        String userEmail = req.getParameter("userEmail");
        String userCountry = req.getParameter("userCountry");

        personToUpdate.setUserName(userName.isBlank() ? personToUpdate.getUserName() : userName);
        personToUpdate.setUserPass(userPass.isBlank() ? personToUpdate.getUserPass() : userPass);
        personToUpdate.setUserEmail(userEmail.isBlank() ? personToUpdate.getUserEmail() : userEmail);
        personToUpdate.setUserCountry(userCountry.isBlank() ? personToUpdate.getUserCountry() : userCountry);

        int status = PersonDao.update(personToUpdate);
        PrintWriter printWriter = resp.getWriter();
        req.getRequestDispatcher("index.html").include(req, resp);

        if (status > 0) {
            printWriter.print("<h2 class=\"center\">User succesfully updated!</h2>");
        } else {
            printWriter.print("<h2 class=\"center\">Something went wrong, try again later</h2>");
        }
    }
}
