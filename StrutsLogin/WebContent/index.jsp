<%@ taglib prefix="s" uri="/struts-tags"%> 
<html>
<body> 
	<h4>
		Struts2 Login Example
	</h4>
	
	<s:form action="verify" >
		<s:textfield name="uname"  label="Enter Username"/>
		<br>
		<s:password name="password" label="Enter Password" />
		<br>
		<s:submit value="Login" align="center" />
	</s:form>  
	<br>
 
	
</body>
</html>