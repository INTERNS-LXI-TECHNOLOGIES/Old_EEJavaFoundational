<html>
<!--contacts app-->

<head>
	<title>Delete</title>
	<%@ page import="com.lxisoft.controller.*,com.lxisoft.model.*,java.util.*,java.sql.*" %>
</head>
<h1>Delete Contact<h1>
<style>
	body
	{
		background-color:lightpink;
	}
	h1
	{
		color:White;
		text-align:center;
	}
	.button{
	background-color:cornflowerblue;
	color:white;
}
.button:hover{
	background-color:green;
}
	
</style>

<body>
<p align="left">
<a href="Contact.jsp"><img src="/ContactsApp/images/homePic.jpg" width="50" height="50"></a></br></br>
</p>
<form action="Contact.jsp" method="post">


 <% String name=request.getParameter("name");
	//out.println(""+name);
	
	
	try{
		Connection conn = null;
		Statement stmt = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcontact", "root", "root");

		stmt = conn.createStatement();
		String sql = "delete from contacts where name='"+name+"'";
		//out.println(" "+sql);
		//ResultSet rs = null;
		out.println("Do you want to delete this entry");
		int rs=stmt.executeUpdate(sql);
	}
		catch(Exception e){
		
		out.println(e);
	}

       %>
			
	
		<input align="center" type="submit" value="Submit" class="button" >
		<input  type="reset" value="Cancel" class="button" >	
			
			
			
			
			
		
		</form>
</body>

</html>