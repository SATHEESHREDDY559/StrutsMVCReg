<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reg Form with struts tag lib</title>
</head>
<body>
<h2> Bejjank's Software Solutions</h2>
<s:form method="POST" action="reg">
<s:textfield name="eid" label="Employee Id"></s:textfield>
<s:textfield name="ename" label="Employee Name"></s:textfield>
<s:textfield name="eemail" label="Employee Email Id"></s:textfield>
<s:textfield name="emobile" label="Employee Mobile no"></s:textfield>
<s:submit value="Register"/>
</s:form>


</body>
</html>