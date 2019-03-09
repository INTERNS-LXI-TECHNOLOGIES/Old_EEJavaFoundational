package com.lxisoft.contactapp.web;
import java.io.*;  
import java.sql.*; 
import javax.servlet.ServletException;  
import javax.servlet.http.*; 
import com.lxisoft.contactapp.model.Contact;
import com.lxisoft.contactapp.service.ContactService;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

public class SearchServlet extends HttpServlet{
	
	ContactService contactService = new ContactService();
	ArrayList<Contact> list;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String searchName=request.getParameter("searchName");
			list=contactService.searchContact(searchName);
			request.setAttribute("list",list);
			RequestDispatcher rd= request.getRequestDispatcher("SearchContacts.jsp");
			rd.forward(request, response);
		
		}	
	
}