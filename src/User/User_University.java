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
 * Servlet implementation class User_University
 */
@WebServlet("/User_University")
public class User_University extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_University() {
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
		String course=request.getParameter("db_course");
		String admtype=request.getParameter("db_admtype");
		String coursesatify=request.getParameter("db_coursesatisfy");
		String sylsatisfy=request.getParameter("db_sylsatisfy");
		String expsrc=request.getParameter("db_expsrc");
		String univlike=request.getParameter("db_univlike");
		String edusys=request.getParameter("db_edusys");
		String infra=request.getParameter("db_infra");
		String ecurri=request.getParameter("db_ecurri");
		
		String enter=request.getParameter("db_entertainment");
		
		
		Data_Bean db=new Data_Bean();
		db.setuser(uname);
		db.setage(course);
		db.setannual_income(admtype);
		db.setemail(coursesatify);
		db.setetime(sylsatisfy);
		db.setfamily_type(expsrc);
		db.setfather_age(univlike);
		db.setfather_edu(edusys);
		db.setfather_occ(infra);
		db.setfname(ecurri);
		db.setfsize(enter);
		
		Secure I=new Secure_Implementations();
		int status=I.ins_useruniversity(db);
		if(status==1)
		{
			response.sendRedirect("Curricular.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
		
		
		
		
	}

}
