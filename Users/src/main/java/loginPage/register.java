package loginPage;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class register extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void init() {
		System.out.println("Inside of register generic servlet.");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userName = request.getParameter("username");
		String gender = request.getParameter("duration");
		String duration = request.getParameter("duration");
		
		String[] languages = request.getParameterValues("language");
		String selectedLanguages = "";
		for (String lang: languages) {
			selectedLanguages = selectedLanguages + lang + " ";
		}
		PrintWriter out = response.getWriter();
		out.println(userName + " "  + gender + " " + duration + " " + selectedLanguages);
	}
		
}
	


