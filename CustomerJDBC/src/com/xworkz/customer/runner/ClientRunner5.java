package com.xworkz.customer.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ClientRunner5 {
	public static void main(String[] args) {

		String query = "SELECT first_name FROM client_info WHERE client_id > 10";
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(ClientEnum.URL.getValue(), ClientEnum.USERNAME.getValue(),
					ClientEnum.PASSWORD.getValue());
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