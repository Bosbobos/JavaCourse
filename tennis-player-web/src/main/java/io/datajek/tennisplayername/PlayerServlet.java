package io.datajek.tennisplayername;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {
    PlayerService service = new PlayerService();
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String playerName = request.getParameter("name");
        Player player = service.getPlayerByName(playerName);
        request.setAttribute("name", playerName);
        request.setAttribute("country", player.getNationality());
        request.setAttribute("dob", player.getBirthDate());
        request.setAttribute("titles", player.getTitles());
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
    }
}
