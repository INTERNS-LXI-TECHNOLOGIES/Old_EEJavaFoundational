package com.lxisoft.contact.repo;
//import com.lxisoft.contact.repo.*;
import com.lxisoft.contact.model.*;
//import com.lxisoft.controller.*;
import java.util.*;
import java.sql.*;
public class RepositoryImpl 
//implements ContactRepository
{
Connection con;
Statement st;
ResultSet rs;

public RepositoryImpl(){
try{
Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","root");
}
catch(Exception e){System.out.println(e);}
}

public void create(Contact c)
{
	try{
	PreparedStatement ps;
	String sql="insert into contactlist (name,phoneNo) values(?,?)";
	ps=con.prepareStatement(sql);
	ps.setString(1,c.getName());
	System.out.println(c.getName()+" "+c.getPhoneNumber());
	ps.setString(2,c.getPhoneNumber());
	ps.executeUpdate();
	}
	catch(Exception e){//System.out.println(e);
	e.printStackTrace();}
	
}

public void view(ArrayList<Contact> list)
{
	try{
		PreparedStatement ps;	 
		String sql="select * from contactlist";
		ps=con.prepareStatement(sql); 
		rs=ps.executeQuery();
		//System.out.println("jfjhj"); 
		while(rs.next())
		{	
	        String n=rs.getString(1);
			String p=rs.getString(2);
			Contact co=new Contact();
			co.setName(n);
			co.setPhoneNumber(p);
			list.add(co);
			//System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		
	}
catch(Exception e){ System.out.println(e);}    
  
}


public void delete(String n)
{
	try{
		PreparedStatement ps;
		String sql="delete from contactlist where name='"+n+"'";
		ps=con.prepareStatement(sql);
		ps.executeUpdate();
	}
	
	catch(Exception e){ System.out.println(e);}   
}

public void edit(String data,String cont,String f)
{
	try{
		PreparedStatement ps;
		String sql;
		if(f.equals("name")){
		sql="update contactlist set name='"+data+"' where name='"+cont+"'";
		ps=con.prepareStatement(sql);
		ps.executeUpdate();
		}
		if(f.equals("phno"))
		{
			sql="update contactlist set phoneNo='"+data+"' where name='"+cont+"'";
		ps=con.prepareStatement(sql);
		ps.executeUpdate();
		}
	}
	catch(Exception e){ System.out.println(e);}   		
}

public void search(String x)
{
	try{
		PreparedStatement ps;
		int i=0;
		String sql="select * from contactlist where name='"+x+"'";
		ps=con.prepareStatement(sql);
		//ps.executeUpdate();
		rs=ps.executeQuery();
		//System.out.println("jfjhj"); 
		while(rs.next())
		{	
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
			i++;
		}
		if(i==0)
		{
			System.out.println("Not found");
		}
	}
	
	catch(Exception e){ System.out.println(e);}   
		
}
}