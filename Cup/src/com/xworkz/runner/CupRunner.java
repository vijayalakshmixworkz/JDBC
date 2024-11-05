package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CupRunner {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/fruits";
		String name = "root";
		String password = "7483381416";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, name, password);

			if (connection != null) {
				System.out.println("Successfully Connected");
			} else {
				System.err.println("Not connected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}