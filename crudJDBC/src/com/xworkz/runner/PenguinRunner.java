package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class PenguinRunner {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst=null;
		try {
			connection=DriverManager.getConnection(
					Penguin.URL.getValue(),
					Penguin.USERNAME.getValue(),
					Penguin.PASSWORD.getValue());
			prst=connection.prepareStatement("insert into penguin_info values(?,?,?,?)");
			prst.setInt(1, 2);
			prst.setString(2,"kiki");
			prst.setString(3, "Adelie");
			prst.setInt(4,3);
			
			
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
