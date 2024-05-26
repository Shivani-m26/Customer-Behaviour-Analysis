package User;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Bean.Login_Bean;
import Implementations.Secure_Implementations;
import Interfaces.Secure;

/**
 * Servlet implementation class User_Register
 */
@WebServlet("/User_Register")
public class User_Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("lname");
		
		String gender=request.getParameter("gender");
		String state=request.getParameter("state");
		String email=request.getParameter("lemail");

		String cpassword=request.getParameter("lcpass");
		String password=request.getParameter("lpass");
		
		
		System.out.println(email);
		if(cpassword.equals(password) && !email.equals(""))
		{
			Login_Bean log=new Login_Bean();
			log.setemail(email);
			log.setuname(name);
			log.setpass(password);
			log.setstate(state);
			log.setgender(gender);
			Secure I=new Secure_Implementations();
			int status=I.register(log);
			if(status==1)
			{
				response.sendRedirect("Login.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
		
		
		

		}
		else
			
		{
			response.sendRedirect("error.jsp");
		
		}
		
		
		
	}

}
