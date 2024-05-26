package User;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Bean.Login_Bean;
import Implementations.Secure_Implementations;
import Interfaces.Secure;

/**
 * Servlet implementation class User_Login
 */
@WebServlet("/User_Login")
public class User_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_Login() {
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
		String id=request.getParameter("lemail");
		String password=request.getParameter("lpwd");
		String fid=null;
		String fid1=null;
		Login_Bean log=new Login_Bean();
		log.setemail(id);
		log.setpass(password);
		Secure I=new Secure_Implementations();
		int status=I.login_check(log);
		HttpSession s=request.getSession();  
		s.setAttribute("uname",id);

		if(status==1)
		{
			response.sendRedirect("Home.jsp");
		}
		else if(id.equals("admin") && password.equals("admin"))
		{
			response.sendRedirect("AdmHome.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
		
		System.out.println(id);
		System.out.println(password);
		
		
		
	}

}
