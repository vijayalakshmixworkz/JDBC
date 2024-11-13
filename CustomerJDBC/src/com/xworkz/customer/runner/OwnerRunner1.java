package com.xworkz.customer.runner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class OwnerRunner1 {


	public static void main(String args[]) {

		String query = "SELECT first_name FROM owner_info WHERE email = 'example@example.com' AND date_of_birth = 'YYYY-MM-DD'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(OwnerEnum.URL.getValue(), OwnerEnum.USERNAME.getValue(),
					OwnerEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("data from table ==" + resultSet.getString("first_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
