package Bean;

public class Login_Bean {

	private String email;
	private String pass;
	private String uname;
	private String state;
	private String gender;
	
	public String getemail() {
		return email;
	}
	public void setemail(String emailid) {
		this.email =emailid;
	}
	
	public String getpass() {
		return pass;
	}
	public void setpass(String passid) {
		this.pass =passid;
	}
	
	public String getuname() {
		return pass;
	}
	public void setuname(String passid) {
		this.uname =passid;
	}
	
	
	public String getstate() {
		return state;
	}
	public void setstate(String passid) {
		this.state =passid;
		
	}
	
	
	public String getgender() {
		return gender;
	}
	public void setgender(String passid) {
		this.gender =passid;
	}
}
