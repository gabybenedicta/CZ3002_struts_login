package test;

public class User {
	private String uname = "";
	private String password = "";
	
	public User(String uname, String password) {
		this.uname = uname;
		this.password = password;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasword() {
		return this.password;
	}
	
	public String getUname() {
		return this.uname;
	}
}
