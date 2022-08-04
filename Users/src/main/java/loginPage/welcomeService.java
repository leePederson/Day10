package loginPage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class welcomeService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
		PrintWriter out = response.getWriter();
		out.println("Welcome back!");
		
		response.sendRedirect("http://localhost:8080/Users/register.jsp");
	}

}
