<html>
	<head>
		<title>delete</title>
		<%@ page import = "com.lxisoft.model.*,com.lxisoft.controller.*,java.util.ArrayList"%>
		
	</head>
	<body>
			
		<h2 align="center">Delete complete......</h2></br>
		<p align="center"><a href="Contacts.jsp"><img align="center" src="/Contactsv1.2/images/homeIcon.ico" height="50" width></a></p></br>
		<%
			String sid=request.getParameter("id");
			ContactController cc=new ContactController();
			int id=Integer.parseInt(sid);
			cc.remove(id);
			
		%>
		
		
	</body>
</html>