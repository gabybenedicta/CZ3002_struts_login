package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model {
	public User getUser(String uname) {
		String queriedUname = "";
		String password = "";
		
	    Connection conn = null;

	    try {
	    	 Class.forName("com.mysql.jdbc.Driver");
	  	  	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts2database?allowPublicKeyRetrieval=true&useSSL=false", "root", "rootroot");
	         String sql = "SELECT userID, passwordID FROM logincredentials WHERE userID = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, uname);
	         ResultSet rs = ps.executeQuery(); 
	         if(rs.next()) {
	        	 queriedUname = rs.getString("userID");
		         password = rs.getString("passwordID");
	         }
	      }
	    catch(Exception e){
	    	  e.printStackTrace();
	      }
	    User user = new User(queriedUname, password);
		return user;
	}
}
	

