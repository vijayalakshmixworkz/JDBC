package com.xworkz.servelet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.HolidayDto;
import com.xworkz.service.HolidayServiceImpl;
@webServlet("/jdbcServelet")
public class JdbcServelet extends HttpServlet {

	@Override
	protected  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		super.doPost(request, response);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		HolidayDto dto=new HolidayDto(name,email);
		HolidayServiceImpl holidayServiceImpl=new HolidayServiceImpl();
		boolean saved=holidayServiceImpl.save(dto);
		System.out.println("this is servlet class"+"name=="+name+"email"+email);
		

		
	}

}
