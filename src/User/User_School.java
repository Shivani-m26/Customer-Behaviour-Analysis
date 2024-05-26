package User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.School_Bean;
import Implementations.Secure_Implementations;
import Interfaces.Secure;

/**
 * Servlet implementation class User_School
 */
@WebServlet("/User_School")
public class User_School extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_School() {
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
		String uname=(String)s.getAttribute("uname");
		String ssc=request.getParameter("db_ssc");
		String hsc=request.getParameter("db_hsc");
		String medium=request.getParameter("db_medium");
		String loc=request.getParameter("db_loc");
		String stream=request.getParameter("db_stream");
		
		School_Bean sb=new School_Bean();
		sb.setuser(uname);
		sb.setssc(ssc);
		sb.sethsc(hsc);
		sb.setmedium(medium);
		sb.setloc(loc);
		sb.setstream(stream);
		
		
		
		Secure I=new Secure_Implementations();
		int status=I.ins_userschool(sb);
		if(status==1)
		{
			response.sendRedirect("University.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
		
		
	}

}
