package essay;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class welcome extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest reqe, HttpServletResponse resps) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(reqe, resps);
	
	}

}
