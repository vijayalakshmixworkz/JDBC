package com.xworkz.formJDBC.servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.formJDBC.dto.FormDTO;
import com.xworkz.formJDBC.service.FormServiceimpl;

@WebServlet("/first")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		String id=req.getParameter("id");
		int convertedId=Integer.valueOf(id);
		
		String name=req.getParameter("name");
		String phoneNo=req.getParameter("phoneno");
		long convertedPhone=Long.valueOf(phoneNo);
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		
		FormDTO registrationDTO=new FormDTO(convertedId,name,convertedPhone,email,password,address,city);
	
		FormServiceimpl registrationService = new FormServiceimpl();
		 registrationService.save(registrationDTO);
		 
		 RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(req, resp);
	
}
}