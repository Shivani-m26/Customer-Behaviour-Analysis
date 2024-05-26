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
 * Servlet implementation class User_Psycho
 */
@WebServlet("/User_Psycho")
public class User_Psycho extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_Psycho() {
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
		
		String fstress=request.getParameter("db_fstress");
		String univstress=request.getParameter("db_univstress");
		String shr=request.getParameter("db_shr");
		String sochr=request.getParameter("db_sochr");
		String mobhr=request.getParameter("db_mobhr");
		String eyeprblm=request.getParameter("db_eyeprblm");
		String dropout=request.getParameter("db_dropout");
		
		Data_Bean db=new Data_Bean();
		db.setage(user);
		db.setannual_income(fstress);
		db.setemail(univstress);
		db.setetime(shr);
		db.setfamily_type(sochr);
		db.setfather_age(mobhr);
		db.setfather_edu(eyeprblm);
		db.setfather_occ(dropout);
		
		Secure I=new Secure_Implementations();
		int status=I.ins_userpsycho(db);
		String res=I.create_db();
		System.out.print(res);
		
		String preclass="";
		if(res.equals("1"))
		{
			preclass="Yes";
		}
		else if(res.equals("2"))
		{
			preclass="NotSure";
		}
		else
		{
			preclass="No";
		}
		
		Data_Bean db1=new Data_Bean();
		db1.setage(preclass);
		db1.setannual_income(user);
		
		Secure I1=new Secure_Implementations();
		I1.update_userpsycho(db1);
		
		s.setAttribute("uname",user);
		if(status==1)
		{
			response.sendRedirect("Home.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
