package test;

import com.opensymphony.xwork2.ActionSupport;

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
		Model model = new Model();
		User user = model.getUser(uname);
		if(password.equals(user.getPasword())) {
			status = true;
		}
		return status;
	}
	
}