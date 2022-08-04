package loginPage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/login")

public class LoginServletEx2 extends GenericServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void init() {
		System.out.println("inside init of generic servlet.");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println("From service of servlet interface");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("hi...<br/>");
		out.println("welcome to servlet interface ex...!");
		
		boolean loginSuccess = false;

		if(username == null || username.isEmpty() ||password == null || password.isEmpty()) {
			loginSuccess = false;
		} 
		loginSuccess = LoginValidate.validate(username, password);
		 if (loginSuccess){
		  		System.out.println("login success");
				RequestDispatcher rd = req.getRequestDispatcher("./welcome");
				
				rd.forward(req,  res);
		 }else {
			System.out.println("Login fail");
			RequestDispatcher rd = req.getRequestDispatcher("./loginError");
			rd.forward(req, res);
		}		 
	
	}

}
