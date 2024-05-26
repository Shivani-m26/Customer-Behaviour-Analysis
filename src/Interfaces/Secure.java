package Interfaces;

import Bean.Data_Bean;
import Bean.Login_Bean;
import Bean.School_Bean;

public interface Secure {

	public int register(Login_Bean bean);
	public int encryptup(Data_Bean bean);
	public int ins_userprofile(Data_Bean bean);
	public int login_check(Login_Bean bean);
	public int ins_userschool(School_Bean bean);
	public int ins_useruniversity(Data_Bean bean);
	public int ins_usercurricular(Data_Bean bean);
	public int ins_userpsycho(Data_Bean bean);
	public String create_db();
	public int update_userpsycho(Data_Bean bean);
	
}
