package com.xworkz.formJDBC.servlet;

public class IdServlet {

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

@WebServlet("/search")
public class IdServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		int id1 = Integer.valueOf(id);

		RegistrationServiceimpl registrationServiceimpl = new RegistrationServiceimpl();
		String valid = registrationServiceimpl.getlistById(id1);

		if (valid != null) {
			req.setAttribute("id", valid);
		}

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/id.jsp");
		requestDispatcher.forward(req, resp);
	}

}