
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>'commandname' attribute will help to bind errormessages from messages from beanclass which is trigered by @valid
which the respective input controls of the UI page</p>
<form:form method="GET" action="forms/validationform.html">

<table>
<tr> <td>Username:<font color="red"></td>
 <td><form:input path="userName"/></td></tr>
 <tr> <td>age:<font color="red"></td>
 <td><form:input path="age"/></td></tr>
 <tr> <td>password:<font color="red"></td>
 <td><form:input path="password"/></td></tr>
 
 <tr><td colspan="2"><input type="submit" value="Submit"/></td></tr>
</table>
</form:form>
</body>
</html>