<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>validation success view-Response page</h1>
<p>here we access the userName from model name referring its key</p>
<b><core:out value="${empKey.userName}"/></b>
</body>
</html>