package com.xworkz.customer.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PassengerRunner4 {

	public static void main(String[] args) {

		String query = "SELECT email, date_of_birth FROM passenger_info WHERE first_name = 'John'AND phone_number = '123-456-7890'";
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(PassengerEnum.URL.getValue(), PassengerEnum.USERNAME.getValue(),
					PassengerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("email") + " " + resultSet.getString("date_of_birth"));
			}

		} catch (SQLException e) {
			e.fillInStackTrace();
		}

	}
}