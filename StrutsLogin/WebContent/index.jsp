<%@ taglib prefix="s" uri="/struts-tags"%> 
<html>
<body> 
	<h4>
		CZ3002 Struts2 Login Assignment
	</h4>
	
	<s:if test="hasActionErrors()">
		<div class="errorDiv">
			<s:actionerror/>
		</div>
	</s:if>
	
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