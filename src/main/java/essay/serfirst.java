package essay;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class serfirst extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = "looool ll l ";
		request.setAttribute("var",message);
		String name = request.getParameter("name");
		request.setAttribute("name");
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, resp);
	}

}
