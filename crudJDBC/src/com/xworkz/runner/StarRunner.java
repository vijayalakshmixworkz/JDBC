package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StarRunner {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst=null;
		try {
			connection=DriverManager.getConnection(
					Star.URL.getValue(),
					Star.USERNAME.getValue(),
					Star.PASSWORD.getValue());
			prst=connection.prepareStatement("insert into star_info values(?,?,?,?)");
			prst.setInt(1, 4);
			prst.setString(2,"yellow_dwarf");
			prst.setString(3, "sun");
			prst.setInt(4,100);
			int value=prst.executeUpdate();
			if (value > 0) {
				System.out.println("Data saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			System.err.println("Connection is not established");
			e.printStackTrace();
		}

}
}