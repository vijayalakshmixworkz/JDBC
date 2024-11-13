package com.xworkz.customer.runner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class PassengerRunner1 {


	public static void main(String args[]) {

		String query = "SELECT first_name FROM passenger_info WHERE email = 'example@example.com' AND date_of_birth = 'YYYY-MM-DD'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(PassengerEnum.URL.getValue(), PassengerEnum.USERNAME.getValue(),
					PassengerEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("data from table ==" + resultSet.getString("total_amount"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
