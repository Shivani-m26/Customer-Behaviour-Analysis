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
 * Servlet implementation class User_Profile
 */
@WebServlet("/User_Profile")
public class User_Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_Profile() {
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
		
		String name=request.getParameter("fname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String residence=request.getParameter("db_residence");
		String state=request.getParameter("db_state");
		String age=request.getParameter("db_age");
		String fedu=request.getParameter("db_fedu");
		String medu=request.getParameter("db_medu");
		String focc=request.getParameter("db_focc");
		String mocc=request.getParameter("db_mocc");
		String fage=request.getParameter("db_fage");
		String mage=request.getParameter("db_mage");
		String ftype=request.getParameter("db_ftype");
		String income=request.getParameter("db_income");
		
		
		Data_Bean db=new Data_Bean();
		db.setuser(uname);
		db.setfname(name);
		db.setemail(email);
		db.setphone(phone);
		db.setresidance(residence);
		db.setstate(state);
		db.setage(age);
		db.setfather_edu(fedu);
		db.setmother_edu(medu);
		db.setfather_occ(focc);
		db.setmother_occ(mocc);
		db.setfather_age(fage);
		db.setmother_age(mage);
		db.setfamily_type(ftype);
		db.setannual_income(income);
		Secure I=new Secure_Implementations();
		int status=I.ins_userprofile(db);
		if(status==1)
		{
			response.sendRedirect("School.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
		
		
	}

}
