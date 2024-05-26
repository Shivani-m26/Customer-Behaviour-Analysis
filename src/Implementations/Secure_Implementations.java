
package Implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.Data_Bean;
import Bean.Login_Bean;
import Bean.School_Bean;
import Connection.Database;
import Interfaces.Secure;
import User.MyUtilsForWekaInstanceHelper;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;


public class Secure_Implementations implements Secure{
	Connection conn=Database.con();
	PreparedStatement statement;
	String query;
	public int status;
	public int register(Login_Bean bean) {
		
		int status=0;
		
		//	System.out.println(bean.getEmail());
			try
			{
				query="insert into register (email,name,pass,state,gender) values(?,?,?,?,?);" ;
				statement=conn.prepareStatement(query);
				statement.setString(1,bean.getemail());
				statement.setString(2,bean.getuname());
				statement.setString(3,bean.getpass());
				statement.setString(4,bean.getstate());
				statement.setString(5,bean.getgender());
				status=statement.executeUpdate();
				status=1;
				
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
				status=0;
			}
		    return status;
			
	

	}
public int encryptup(Data_Bean bean) {
		
		int status=0;
		
		//	System.out.println(bean.getEmail());
			try
			{
				query="insert into encryptup(user,filename,filesize,encrypttime,uploadtime) values(?,?,?,?,?);" ;
				statement=conn.prepareStatement(query);
				statement.setString(1,bean.getuser());
				statement.setString(2,bean.getfname());
				statement.setString(3,bean.getfsize());
				statement.setString(4,bean.getetime());
				statement.setString(5,bean.getuptime());
				status=statement.executeUpdate();
				status=1;
				
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
				status=0;
			}
		    return status;
			
	

	}
public int ins_userprofile(Data_Bean bean) {
	
	int status=0;
	
	//	System.out.println(bean.getEmail());
		try
		{
			query="insert into profile(username,name,email,phone,residence,state,age,fedu,focc,fage,medu,mocc,mage,ftype,annualincome) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);" ;
			statement=conn.prepareStatement(query);
			statement.setString(1,bean.getuser());
			statement.setString(2,bean.getfname());
			statement.setString(3,bean.getemail());
			statement.setString(4,bean.getphone());
			statement.setString(5,bean.getresidance());
			statement.setString(6,bean.getstate());
			statement.setString(7,bean.getage());
			statement.setString(8,bean.getfather_edu());
			statement.setString(9,bean.getfather_occ());
			statement.setString(10,bean.getfather_age());
			statement.setString(11,bean.getmother_edu());
			statement.setString(12,bean.getmother_occ());
			statement.setString(13,bean.getmother_age());
			statement.setString(14,bean.getfamily_type());
			statement.setString(15,bean.getannual_income());
			
			
			status=statement.executeUpdate();
			status=1;
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			status=0;
		}
	    return status;
		


}
public int ins_userschool(School_Bean bean) {
	
	int status=0;
	
	//	System.out.println(bean.getEmail());
		try
		{
			query="insert into availablespecification(username,capacity,type,battry,digital,producttype) values(?,?,?,?,?,?);" ;
			statement=conn.prepareStatement(query);
			statement.setString(1,bean.getuser());
			statement.setString(2,bean.getssc());
			statement.setString(3,bean.gethsc());
			statement.setString(4,bean.getmedium());
			statement.setString(5,bean.getloc());
			statement.setString(6,bean.getstream());
			
			
			status=statement.executeUpdate();
			status=1;
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			status=0;
		}
	    return status;
		


}
public int ins_useruniversity(Data_Bean bean) {
	
	int status=0;
	
	//	System.out.println(bean.getEmail());
		try
		{
			query="insert into requiredspecification(username,productbrand,producttype,ram,processor,backlit,harddisk,battrytype,gamming,productweight,battrylife) values(?,?,?,?,?,?,?,?,?,?,?);" ;
			statement=conn.prepareStatement(query);
			statement.setString(1,bean.getuser());
			statement.setString(2,bean.getage());
			statement.setString(3,bean.getannual_income());
			statement.setString(4,bean.getemail());
			statement.setString(5,bean.getetime());
			statement.setString(6,bean.getfamily_type());
			statement.setString(7,bean.getfather_age());
			statement.setString(8,bean.getfather_edu());
			statement.setString(9,bean.getfather_occ());
			statement.setString(10,bean.getfname());
			statement.setString(11,bean.getfsize());
			status=statement.executeUpdate();
			status=1;
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			status=0;
		}
	    return status;
		


}
public int ins_usercurricular(Data_Bean bean) {
	
	int status=0;
	
	//	System.out.println(bean.getEmail());
		try
		{
			query="insert into productreport(username,battrylife,productspeed,productoverheating) values(?,?,?,?);" ;
			statement=conn.prepareStatement(query);

			statement.setString(1,bean.getage());
			statement.setString(2,bean.getannual_income());
			statement.setString(3,bean.getemail());
			statement.setString(4,bean.getetime());

			status=statement.executeUpdate();
			status=1;
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			status=0;
		}
	    return status;
		


}
public int ins_userpsycho(Data_Bean bean) {
	
	int status=0;
	
	//	System.out.println(bean.getEmail());
		try
		{
			query="insert into userpsychofact(username,f_stress,univ_stress,study_hr,usg_s_media,usg_mobile,eye_prob,dropout) values(?,?,?,?,?,?,?,?);" ;
			statement=conn.prepareStatement(query);

			statement.setString(1,bean.getage());
			statement.setString(2,bean.getannual_income());
			statement.setString(3,bean.getemail());
			statement.setString(4,bean.getetime());
			statement.setString(5,bean.getfamily_type());
			statement.setString(6,bean.getfather_age());
			statement.setString(7,bean.getfather_edu());
			statement.setString(8,bean.getfather_occ());

			status=statement.executeUpdate();
			status=1;
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			status=0;
		}
	    return status;
		


}
public int update_userpsycho(Data_Bean bean) {
	
	int status=0;
	
	//	System.out.println(bean.getEmail());
		try
		{
			query="update userpsychofact set Result=? where username=?" ;
			statement=conn.prepareStatement(query);

			statement.setString(1,bean.getage());
			statement.setString(2,bean.getannual_income());

			status=statement.executeUpdate();
			status=1;
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			status=0;
		}
	    return status;
		


}
public int login_check(Login_Bean bean) {
		
				String email="";
				status=0;
				try
				{
					
						//System.out.println("user namein login"+log.getid());
						//System.out.println("user namein login"+log.getPassword());
						 //query="SELECT Email,password FROM docregister d where Email=? and password=?";
						 query="select * from register where email=? and pass=?";
						PreparedStatement statement = conn.prepareStatement(query);
						statement.setString(1,bean.getemail());
						statement.setString(2,bean.getpass());
						ResultSet resultSet = statement.executeQuery();
						
						

						if(resultSet.next())
						{
							email=resultSet.getString(1).toString().trim();
								
							status=1;
						}
						
				}
						catch (Exception e)
						{
							e.printStackTrace();
							System.out.println("SqlMethodsImplementation.login()");
						}
						return status;
	

	}
public String create_db() {
	
	String residence="";
	String state="";
	String age="";
	String fedu="";
	String focc="";
	String fage="";
	String medu="";
	String mocc="";
	String mage="";
	String ftype="";
	String annualincome="";
	String ssc="";
	String hsc="";
	String medium="";
	String location="";
	String hscstream="";
	String course="";
	String admtype="";
	String c_satisfy="";
	String s_satisfy="";
	String exp_src="";
	String univ_like="";
	String univ_edusys="";
	String univ_infra="";
	String extra_curri="";
	String enter_facility="";
	String e_curri_in="";
	String c_curri_in="";
	String place_conf="";
	String f_stress="";
	String univ_stress="";
	String study_hr="";
	String usg_s_media="";
	String usg_mobile="";
	String eye_prob="";
	String dropout="";
	String capacity="";
	String type="";
	String battry="";
	String digital="";
	String producttype="";
	
	String capasity="";
	String productbrand="";
	String ram="";
	String processor="";
	String backlit="";
	String harddisk="";
	String battrytype="";
	String gamming="";
	String productweight="";
	String battrylife="";
	String prductspeed="";
	
	
	String status1="No";
	
	
	
    String dataSetFileName = "E:\\data.arff";
    Instances data = MyUtilsForWekaInstanceHelper.getInstanceFromFile(dataSetFileName);
    System.out.println("Before adding");
    System.out.println(data);
	   		
	try
	{
		
		
		
			//System.out.println("user namein login"+log.getid());
			//System.out.println("user namein login"+log.getPassword());
			 //query="SELECT Email,password FROM docregister d where Email=? and password=?";
			query="SELECT residence,state,age,fedu,focc,fage,medu,mocc,mage,ftype,annualincome,capacity,type,battry,digital,producttype,productbrand,producttype,ram,processor,backlit,harddisk,battrytype,gamming,productweight,battrylife,battrylife,productspeed,productoverheating,f_stress,univ_stress,study_hr,usg_s_media,usg_mobile,eye_prob,dropout FROM profile,availablespecification,requiredspecification,productreport,userpsychofact where profile.id=productreport.id and profile.id=userpsychofact.id and profile.id=availablespecification.id and profile.id=requiredspecification.id order by profile.id desc limit 1;";
			PreparedStatement statement = conn.prepareStatement(query);
		    ResultSet resultSet = statement.executeQuery();
			
		    

			if(resultSet.next())
			{
				//residence=resultSet.getString(1).toString();
				
				if(resultSet.getString(1).toString().equals("Rural"))
				{
					residence="1";
				}
				else if(resultSet.getString(1).toString().equals("Urban"))
				{
					residence="2";
				}
				
				else 
				{
					residence="0";
				}
				

				
				
				
				//System.out.println(residence);
				//state=resultSet.getString(2).toString();
				
				if(resultSet.getString(2).toString().equals("TAMILNADU"))
				{
					state="1";
				}
				else if(resultSet.getString(2).toString().equals("ANDRAPRADESH"))
				{
					state="2";
				}
				else if(resultSet.getString(2).toString().equals("KERALA"))
				{
					state="3";
				}
				else if(resultSet.getString(2).toString().equals("KARNATAKA"))
				{
					state="4";
				}
				else 
				{
					state="0";
				}
				
				
				
				//age=resultSet.getString(3).toString();
				if(resultSet.getString(3).toString().equals("Below18"))
				{
					age="1";
				}
				else if(resultSet.getString(3).toString().equals("18-20"))
				{
					age="2";
				}
				else if(resultSet.getString(3).toString().equals("18Above"))
				{
					age="3";
				}
				
				else 
				{
					age="0";
				}
				//fedu=resultSet.getString(4).toString();
				if(resultSet.getString(4).toString().equals("Illiterate"))
				{
					fedu="1";
				}
				else if(resultSet.getString(4).toString().equals("Sec"))
				{
					fedu="2";
				}
				else if(resultSet.getString(4).toString().equals("HSec"))
				{
					fedu="3";
				}
				else if(resultSet.getString(4).toString().equals("UG"))
				{
					fedu="4";
				}
				else if(resultSet.getString(4).toString().equals("PG"))
				{
					fedu="5";
				}
				else 
				{
					fedu="0";
				}
				//focc=resultSet.getString(5).toString();
				//focc=resultSet.getString(5).toString();
				if(resultSet.getString(5).toString().equals("GovtService"))
				{
					focc="1";
				}
				else if(resultSet.getString(5).toString().equals("PvtServices"))
				{
					focc="2";
				}
				else if(resultSet.getString(5).toString().equals("Business"))
				{
					focc="3";
				}
				else if(resultSet.getString(5).toString().equals("Agriculture"))
				{
					focc="4";
				}
				else if(resultSet.getString(5).toString().equals("Retried"))
				{
					focc="5";
				}
				else 
				{
					focc="0";
				}
				//fage=resultSet.getString(6).toString();
				
				if(resultSet.getString(6).toString().equals("30-40"))
				{
					fage="1";
				}
				else if(resultSet.getString(6).toString().equals("40-50"))
				{
					fage="2";
				}
				else if(resultSet.getString(6).toString().equals("50-60"))
				{
					fage="3";
				}
				else if(resultSet.getString(6).toString().equals("60Above"))
				{
					fage="4";
				}
				
				else 
				{
					fage="0";
				}
				
				
				//medu=resultSet.getString(7).toString();
				if(resultSet.getString(7).toString().equals("Illiterate"))
				{
					medu="1";
				}
				else if(resultSet.getString(7).toString().equals("Sec"))
				{
					medu="2";
				}
				else if(resultSet.getString(7).toString().equals("HSec"))
				{
					medu="3";
				}
				else if(resultSet.getString(7).toString().equals("UG"))
				{
					medu="4";
				}
				else if(resultSet.getString(7).toString().equals("PG"))
				{
					medu="5";
				}
				else 
				{
					medu="0";
				}
				//mocc=resultSet.getString(8).toString();
				
				if(resultSet.getString(8).toString().equals("GovtService"))
				{
					mocc="1";
				}
				else if(resultSet.getString(8).toString().equals("PvtServices"))
				{
					mocc="2";
				}
				else if(resultSet.getString(8).toString().equals("Business"))
				{
					mocc="3";
				}
				else if(resultSet.getString(8).toString().equals("Agriculture"))
				{
					mocc="4";
				}
				else if(resultSet.getString(8).toString().equals("Retried"))
				{
					mocc="5";
				}
				else 
				{
					mocc="0";
				}
				
				
				
				//mage=resultSet.getString(9).toString();
				if(resultSet.getString(9).toString().equals("30-40"))
				{
					mage="1";
				}
				else if(resultSet.getString(9).toString().equals("40-50"))
				{
					mage="2";
				}
				else if(resultSet.getString(9).toString().equals("50-60"))
				{
					mage="3";
				}
				else if(resultSet.getString(9).toString().equals("60Above"))
				{
					mage="4";
				}
				
				else 
				{
					mage="0";
				}
				
				
				//ftype=resultSet.getString(10).toString();
				if(resultSet.getString(10).toString().equals("Nuclear"))
				{
					ftype="1";
				}
				else if(resultSet.getString(10).toString().equals("Joint"))
				{
					ftype="2";
				}
				else 
				{
					ftype="0";
				}
				
				//annualincome=resultSet.getString(11).toString();
				if(resultSet.getString(11).toString().equals("Low"))
				{
					annualincome="1";
				}
				else if(resultSet.getString(11).toString().equals("Medium"))
				{
					annualincome="2";
				}
				else if(resultSet.getString(11).toString().equals("High"))
				{
					annualincome="3";
				}
				else if(resultSet.getString(11).toString().equals("VHigh"))
				{
					annualincome="4";
				}
				else 
				{
					annualincome="0";
				}
				//ssc=resultSet.getString(12).toString();
				if(resultSet.getString(12).toString().equals("50 Gb"))
				{
					ssc="1";
				}
				else if(resultSet.getString(12).toString().equals("100 Gb"))
				{
					ssc="2";
				}
				else if(resultSet.getString(12).toString().equals("250 Gb"))
				{
					ssc="3";
				}
				else if(resultSet.getString(12).toString().equals("520 Gb"))
				{
					ssc="4";
				}
				else if(resultSet.getString(12).toString().equals("1 Tb"))
				{
					ssc="5";
				}
				else 
				{
					ssc="0";
				}
				//hsc=resultSet.getString(13).toString();
				if(resultSet.getString(13).toString().equals("smart"))
				{
					hsc="1";
				}
				else if(resultSet.getString(13).toString().equals("light-weight"))
				{
					hsc="2";
				}
				else if(resultSet.getString(13).toString().equals("powerfull"))
				{
					hsc="3";
				}
				else if(resultSet.getString(13).toString().equals("basic"))
				{
					hsc="4";
				}
				else if(resultSet.getString(13).toString().equals("touch-screen"))
				{
					hsc="5";
				}
				else 
				{
					hsc="0";
				}
				//medium=resultSet.getString(14).toString();
				
				if(resultSet.getString(14).toString().equals("Lithium"))
				{
					medium="1";
				}
				else if(resultSet.getString(14).toString().equals("Lead-Acid"))
				{
					medium="2";
				}
						else 
				{
							medium="0";
				}
				//location=resultSet.getString(15).toString();
				
				if(resultSet.getString(15).toString().equals("Yes"))
				{
					location="1";
				}
				else if(resultSet.getString(15).toString().equals("No"))
				{
					location="2";
				}
						else 
				{
							location="0";
				}
				//hscstream=resultSet.getString(16).toString();
				if(resultSet.getString(16).toString().equals("HP"))
				{
					hscstream="1";
				}
				else if(resultSet.getString(16).toString().equals("Lenovo"))
				{
					hscstream="2";
				}
				else if(resultSet.getString(16).toString().equals("Dell"))
				{
					hscstream="3";
				}
				else if(resultSet.getString(16).toString().equals("Acer"))
				{
					hscstream="4";
				}
						else 
				{
							hscstream="0";
				}
				
				//course=resultSet.getString(17).toString();
				
				if(resultSet.getString(17).toString().equals("HP"))
				{
					course="1";
				}
				else if(resultSet.getString(17).toString().equals("Lenovo"))
				{
					course="2";
				}
				else if(resultSet.getString(17).toString().equals("Dell"))
				{
					course="3";
				}
				else if(resultSet.getString(17).toString().equals("Acer"))
				{
					course="4";
				}
						else 
				{
							course="0";
				}
				
				//admtype=resultSet.getString(18).toString();
				if(resultSet.getString(18).toString().equals("Tochscreen"))
				{
					admtype="1";
				}
				else if(resultSet.getString(18).toString().equals("Backlight keyboard"))
				{
					admtype="2";
				}
				else if(resultSet.getString(18).toString().equals("SSD"))
				{
					admtype="3";
				}
				else 
				{
					admtype="0";
				}
				
				//c_satisfy=resultSet.getString(19).toString();
				
				if(resultSet.getString(19).toString().equals("4 GB"))
				{
					c_satisfy="1";
				}
				else if(resultSet.getString(19).toString().equals("8 GB"))
				{
					c_satisfy="2";
				}
				else if(resultSet.getString(19).toString().equals("16 GB"))
				{
					c_satisfy="3";
				}
				else 
				{
					c_satisfy="0";
				}
				
				
				
				//s_satisfy=resultSet.getString(20).toString();
				
				if(resultSet.getString(20).toString().equals("i3"))
				{
					s_satisfy="1";
				}
				else if(resultSet.getString(20).toString().equals("i5"))
				{
					s_satisfy="2";
				}
				else if(resultSet.getString(20).toString().equals("i7"))
				{
					s_satisfy="3";
				}
				else if(resultSet.getString(20).toString().equals("i9"))
				{
					s_satisfy="4";
				}
				else if(resultSet.getString(20).toString().equals("AMD"))
				{
					s_satisfy="5";
				}
				else 
				{
					s_satisfy="0";
				}
				
				
				
				
				//exp_src=resultSet.getString(21).toString();
				
				if(resultSet.getString(21).toString().equals("Yes"))
				{
					exp_src="1";
				}
				else if(resultSet.getString(21).toString().equals("No"))
				{
					exp_src="2";
				}
				else if(resultSet.getString(21).toString().equals("Not Sure"))
				{
					exp_src="3";
				}
				
				else 
				{
					exp_src="0";
				}
				
				
				
				
				//univ_like=resultSet.getString(22).toString();
				

				if(resultSet.getString(22).toString().equals("SSD"))
				{
					univ_like="1";
				}
				else if(resultSet.getString(22).toString().equals("HDD"))
				{
					univ_like="2";
				}
			
				else 
				{
					univ_like="0";
				}
				
				//univ_edusys=resultSet.getString(23).toString();
				
				

				if(resultSet.getString(23).toString().equals("Lithioum"))
				{
					univ_edusys="1";
				}
				else if(resultSet.getString(23).toString().equals("LeadAcid"))
				{
					univ_edusys="2";
				}
				else if(resultSet.getString(23).toString().equals("Li-on"))
				{
					univ_edusys="3";
				}
				else if(resultSet.getString(23).toString().equals("LeadAcid"))
				{
					univ_edusys="4";
				}
				else if(resultSet.getString(23).toString().equals("Lithioum"))
				{
					univ_edusys="5";
				}
				else 
				{
					univ_edusys="0";
				}
				
				
				
				
				
				//univ_infra=resultSet.getString(24).toString();
				
				if(resultSet.getString(24).toString().equals("Yes"))
				{
					univ_infra="1";
				}
				else if(resultSet.getString(24).toString().equals("No"))
				{
					univ_infra="2";
				}
				else if(resultSet.getString(24).toString().equals("Not Sure"))
				{
					univ_infra="3";
				}
				else if(resultSet.getString(24).toString().equals("Complesary"))
				{
					univ_infra="4";
				}
				else if(resultSet.getString(24).toString().equals("Optional"))
				{
					univ_infra="5";
				}
				else 
				{
					univ_infra="0";
				}
				
				
				
				//extra_curri=resultSet.getString(25).toString();
				
				if(resultSet.getString(25).toString().equals("1.3 kg"))
				{
					extra_curri="1";
				}
				else if(resultSet.getString(25).toString().equals("1.5 kg"))
				{
					extra_curri="2";
				}
				else if(resultSet.getString(25).toString().equals("1.6 kg"))
				{
					extra_curri="3";
				}
				else if(resultSet.getString(25).toString().equals("1.7 kg"))
				{
					extra_curri="4";
				}
				else if(resultSet.getString(25).toString().equals("2 kg"))
				{
					extra_curri="5";
				}
				else 
				{
					extra_curri="0";
				}
				
				
				
				
				//enter_facility=resultSet.getString(26).toString();
				
				if(resultSet.getString(26).toString().equals("4 Hrs"))
				{
					enter_facility="1";
				}
				else if(resultSet.getString(26).toString().equals("5 Hrs"))
				{
					enter_facility="2";
				}
				else if(resultSet.getString(26).toString().equals("6 Hrs"))
				{
					enter_facility="3";
				}
				else if(resultSet.getString(26).toString().equals("7 Hrs"))
				{
					enter_facility="4";
				}
				else if(resultSet.getString(26).toString().equals("8 Hrs"))
				{
					enter_facility="5";
				}
				else 
				{
					enter_facility="0";
				}
				
					
				
				
				//e_curri_in=resultSet.getString(27).toString();

				if(resultSet.getString(27).toString().equals("High"))
				{
					e_curri_in="1";
				}
				else if(resultSet.getString(27).toString().equals("Low"))
				{
					e_curri_in="2";
				}
			
				else 
				{
					e_curri_in="0";
				}
				
				//c_curri_in=resultSet.getString(28).toString();
				
				if(resultSet.getString(28).toString().equals("High"))
				{
					c_curri_in="1";
				}
				else if(resultSet.getString(28).toString().equals("Low"))
				{
					c_curri_in="2";
				}
			
				else 
				{
					c_curri_in="0";
				}
				
				
				
				//place_conf=resultSet.getString(29).toString();
				
				
				if(resultSet.getString(29).toString().equals("Below Avg"))
				{
					place_conf="1";
				}
				else if(resultSet.getString(29).toString().equals("Avg"))
				{
					place_conf="2";
				}
				else if(resultSet.getString(29).toString().equals("Good"))
				{
					place_conf="3";
				}
				else if(resultSet.getString(29).toString().equals("Very Good"))
				{
					place_conf="4";
				}
				else if(resultSet.getString(29).toString().equals("Excellent"))
				{
					place_conf="5";
				}
				else 
				{
					place_conf="0";
				}
				
				
				
				//f_stress=resultSet.getString(30).toString();
				
				if(resultSet.getString(30).toString().equals("No"))
				{
					f_stress="1";
				}
				else if(resultSet.getString(30).toString().equals("Finance"))
				{
					f_stress="2";
				}
				else if(resultSet.getString(30).toString().equals("Illness"))
				{
					f_stress="3";
				}
				else if(resultSet.getString(30).toString().equals("Other"))
				{
					f_stress="4";
				}
				
				else 
				{
					f_stress="0";
				}
				
				//univ_stress=resultSet.getString(31).toString();
				
				if(resultSet.getString(31).toString().equals("Education"))
				{
					univ_stress="1";
				}
				else if(resultSet.getString(31).toString().equals("Faculty"))
				{
					univ_stress="2";
				}
				else if(resultSet.getString(31).toString().equals("Collegues"))
				{
					univ_stress="3";
				}
				else if(resultSet.getString(31).toString().equals("No"))
				{
					univ_stress="4";
				}
				else if(resultSet.getString(31).toString().equals("Other"))
				{
					univ_stress="5";
				}
				
				else 
				{
					univ_stress="0";
				}
				
				//study_hr=resultSet.getString(32).toString();
				
				if(resultSet.getString(32).toString().equals("Below1Hr"))
				{
					study_hr="1";
				}
				else if(resultSet.getString(32).toString().equals("2-3Hrs"))
				{
					study_hr="2";
				}
				else if(resultSet.getString(32).toString().equals("4-5Hrs"))
				{
					study_hr="3";
				}
				else if(resultSet.getString(32).toString().equals("Above5Hrs"))
				{
					study_hr="4";
				}
								
				else 
				{
					study_hr="0";
				}
				
				
				
				//usg_s_media=resultSet.getString(33).toString();
				
				if(resultSet.getString(33).toString().equals("Below1Hr"))
				{
					usg_s_media="1";
				}
				else if(resultSet.getString(33).toString().equals("2-3Hrs"))
				{
					usg_s_media="2";
				}
				else if(resultSet.getString(33).toString().equals("4-5Hrs"))
				{
					usg_s_media="3";
				}
				else if(resultSet.getString(33).toString().equals("Above5Hrs"))
				{
					usg_s_media="4";
				}
								
				else 
				{
					usg_s_media="0";
				}
				
				//usg_mobile=resultSet.getString(34).toString();
				
				if(resultSet.getString(34).toString().equals("Below1Hr"))
				{
					usg_mobile="1";
				}
				else if(resultSet.getString(34).toString().equals("2-3Hrs"))
				{
					usg_mobile="2";
				}
				else if(resultSet.getString(34).toString().equals("4-5Hrs"))
				{
					usg_mobile="3";
				}
				else if(resultSet.getString(34).toString().equals("Above5Hrs"))
				{
					usg_mobile="4";
				}
								
				else 
				{
					usg_mobile="0";
				}
				
				//eye_prob=resultSet.getString(35).toString();
				
				if(resultSet.getString(35).toString().equals("Yes"))
				{
					eye_prob="1";
				}
				else if(resultSet.getString(35).toString().equals("No"))
				{
					eye_prob="2";
				}
									
				else 
				{
					eye_prob="0";
				}
				
				
				//dropout=resultSet.getString(36).toString();
				if(resultSet.getString(36).toString().equals("Yes"))
				{
					dropout="1";
				}
				else if(resultSet.getString(36).toString().equals("NotSure"))
				{
					dropout="2";
				}
				else if(resultSet.getString(36).toString().equals("No"))
				{
					dropout="3";
				}				
				else 
				{
					dropout="4";
				}
				
				
				
				
				double[] instanceValue1 = new double[data.numAttributes()];
				//System.out.println(data.numAttributes());
			    instanceValue1[0] =Double.valueOf(residence);
			    instanceValue1[1] = Double.valueOf(state);
			    instanceValue1[2] = Double.valueOf(age);
			    instanceValue1[3] = Double.valueOf(fedu);
			    instanceValue1[4] = Double.valueOf(focc);
			    instanceValue1[5] = Double.valueOf(fage);
			    instanceValue1[6] = Double.valueOf(medu);
			    instanceValue1[7] = Double.valueOf(mocc);
			    instanceValue1[8] = Double.valueOf(mage);
			    instanceValue1[9] = Double.valueOf(ftype);
			    instanceValue1[10] =Double.valueOf(annualincome);
			    
				instanceValue1[11] =Double.valueOf(capasity);
			    instanceValue1[12] =Double.valueOf(type);
			    instanceValue1[13] = Double.valueOf(battry);
			    instanceValue1[14] = Double.valueOf(digital);
			    instanceValue1[15] = Double.valueOf(producttype);
			    
				instanceValue1[16] =Double.valueOf(productbrand);
			    instanceValue1[17] = Double.valueOf(producttype);
			    
				instanceValue1[18] = Double.valueOf(ram);
			    
				instanceValue1[19] = Double.valueOf(processor);
			    
				instanceValue1[20] = Double.valueOf(backlit);
			    
				instanceValue1[21] = Double.valueOf(harddisk);
			    
				instanceValue1[22] = Double.valueOf(battrytype);
			    
				instanceValue1[23] = Double.valueOf(gamming);
			    
				instanceValue1[24] = Double.valueOf(productweight);
			    
				instanceValue1[25] = Double.valueOf(battrylife);
			    instanceValue1[26] = Double.valueOf(battrylife);
			    
				instanceValue1[27] = Double.valueOf(prductspeed);
			    instanceValue1[28] = Double.valueOf(f_stress);
			    instanceValue1[29] = Double.valueOf(univ_stress);
			    instanceValue1[30] = Double.valueOf(study_hr);
			    instanceValue1[31] = Double.valueOf(usg_s_media);
			    instanceValue1[32] = Double.valueOf(usg_mobile);
			    instanceValue1[33] = Double.valueOf(usg_mobile);
			    instanceValue1[34] = Double.valueOf(eye_prob);
			    instanceValue1[35] = Double.valueOf(dropout);
			    
			   // instanceValue1[36] = data.attribute(36).addStringValue(dropout);

			    
			    data.add(new DenseInstance(1.0, instanceValue1));
			    
			    System.out.println("-----------------------------------------------------------");
			    System.out.println("After adding");
			    System.out.println(data);
								
			    BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\data.arff"));
			    writer.write(data.toString());
			    writer.flush();
			    writer.close();
				
			    
			    
			    
			    
		        weka.classifiers.trees.RandomForest desicion=new  weka.classifiers.trees.RandomForest();
		        //Classifier temp=AbstractClassifier.makeCopy(desicion);
		        //weka.classifiers.bayes.NaiveBayes desicion1 = new weka.classifiers.bayes.NaiveBayes();
		        //desicion1.buildClassifier(data);
		        //weka.classifiers.functions.supportVector.PolyKernel desicion2 = new weka.classifiers.functions.supportVector.PolyKernel();
		        //desicion2.buildKernel(data);
		        
		        
		       
		        
		        int classIndex = data.numAttributes()-1;
		        data.setClassIndex(classIndex);
		        
		        desicion.buildClassifier(data);

		        
		        
		        
		        Evaluation evaluation = null;
				try {
					evaluation = new Evaluation(data);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        try {
					evaluation.evaluateModel(desicion, data);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
		        double pred = desicion.classifyInstance(data.instance(data.numInstances()-1));
	            System.out.print("Actual: " + data.instance(data.numInstances()-1).value(35));
	            System.out.println(", predicted: " + pred);
	       
			    
			    
			    
			    
		
				int res=(int)pred;
				status1=String.valueOf(res);
			}
			
	}
			catch (Exception e)
			{
				e.printStackTrace();
				System.out.println("SqlMethodsImplementation.login()");
			}
			return status1;


}
}
