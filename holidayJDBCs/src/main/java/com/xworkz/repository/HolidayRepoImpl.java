package com.xworkz.repository;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import com.xworkz.dto.HolidayDto;

	public class HolidayRepoImpl implements HolidayRepo {

		@Override
		public boolean save(HolidayDto dto) {
		
	System.out.println("this si dats");
			Connection connection = null;
			PreparedStatement prep = null;
			boolean ifSaved = false;

			try {
				connection = DriverManager.getConnection(ConnectionData.URL.getValue(), ConnectionData.USERNAME.getValue(),
						ConnectionData.PASSWORD.getValue());
				prep = connection.prepareStatement("insert into holiday_data values(?,?)");
				prep.setString(1, dto.getName());
				prep.setString(2, dto.getEmail());

				int values = prep.executeUpdate();
				if (values > 0) {
					System.out.println("data saved");
					ifSaved = true;
				} else {
					System.out.println("data not saved");
					ifSaved = false;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			return ifSaved;
		}

		

	}