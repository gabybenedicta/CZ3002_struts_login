package test;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String uname, password;
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password= password;
	}
	
	
	public String execute(){  
	    if(this.validate(uname, password)){  
	        return "SUCCESS";  
	    }  
	    else{
	    	addActionError("Error: Incorrect username or password, please try again.");
	        return "ERROR";  
	    }  
	}  

	public boolean validate(String uname, String password) {
		boolean status= false;
		
	      Connection conn = null;

	      try {
	    	 Class.forName("com.mysql.jdbc.Driver");
	  	  	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts2database?allowPublicKeyRetrieval=true&useSSL=false", "root", "rootroot");
	         String sql = "SELECT * FROM logincredentials WHERE userID = ? AND passwordID = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, uname);
	         ps.setString(2, password);
	         ResultSet rs = ps.executeQuery();
	         status=rs.next();  
	      }catch(Exception e){e.printStackTrace();}  

		return status;
	}
	
}