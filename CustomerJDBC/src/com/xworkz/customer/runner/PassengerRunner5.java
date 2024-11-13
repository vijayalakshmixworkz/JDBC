package com.xworkz.customer.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PassengerRunner5 {


	public static void main(String[] args) {

		String query = "SELECT first_name FROM passenger_info WHERE passenger_id > 10";
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(PassengerEnum.URL.getValue(), PassengerEnum.USERNAME.getValue(),
					PassengerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("first_name"));
			}

		} catch (SQLException e) {
			e.fillInStackTrace();
		}

	}
}