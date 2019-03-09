package com.lxisoft.contactapp.web;
import java.io.*;  
import java.sql.*; 
import javax.servlet.ServletException;  
import javax.servlet.http.*; 
import com.lxisoft.contactapp.model.Contact;
import com.lxisoft.contactapp.service.ContactService;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

public class ContactServlet extends HttpServlet{
	
	ContactService contactService = new ContactService();
	ArrayList<Contact> contactList=null;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			contactList=contactService.getContact();
			request.setAttribute("contactList",contactList);
			RequestDispatcher rd= request.getRequestDispatcher("ContactDetails.jsp");
			rd.forward(request, response);
	}	

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException 
	{
	response.setContentType("text/html"); 
	PrintWriter out = response.getWriter();
	System.out.println("@@@@@@@@@@@@@@@addContact");
	String name=request.getParameter("name"); 
	String phone=request.getParameter("phone"); 
	String number=request.getParameter("number");  
	String email=request.getParameter("email");  
	Contact contact=new Contact(name,phone,number,email);
	String result = contactService.addContact(contact);
	HttpSession session = request.getSession();
	session.setAttribute("result", result);
    RequestDispatcher rd= request.getRequestDispatcher("AddContact.jsp");
    rd.forward(request, response);
	out.close();
	}
	
}