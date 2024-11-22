package com.xworkz.formJDBC.servlet;

public class EmailServlet {

}
package com.xworkz.register.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.register.service.RegistrationServiceimpl;

@WebServlet("/login")
public class EmailServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		RegistrationServiceimpl registrationService = new RegistrationServiceimpl();
		String ref = registrationService.checkEmailPassword(email, password);
		if (ref != null) {
			req.setAttribute("message", "Login successful");
		} else {
			req.setAttribute("message1", "Invalid email or password, try again.");
		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/email.jsp");
		requestDispatcher.forward(req, resp);
	}

}