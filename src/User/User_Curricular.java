package User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Data_Bean;
import Implementations.Secure_Implementations;
import Interfaces.Secure;

/**
 * Servlet implementation class User_Curricular
 */
@WebServlet("/User_Curricular")
public class User_Curricular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_Curricular() {
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
		HttpSession s=request.getSession();
		String user=(String)s.getAttribute("uname");
		String ecurri=request.getParameter("db_ecurri");
		String cocurri=request.getParameter("db_cocurri");
		String conf=request.getParameter("db_conf");
		
		Data_Bean be=new Data_Bean();
		be.setage(user);
		be.setannual_income(ecurri);
		be.setemail(cocurri);
		be.setetime(conf);
		
		
		Secure I=new Secure_Implementations();
		int status=I.ins_usercurricular(be);
		if(status==1)
		{
			response.sendRedirect("Psychological.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
		
		
		
		
		
		
		
		
	}

}
