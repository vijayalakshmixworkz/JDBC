package com.xworkz.customer.runner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class OwnerRunner3 {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "SELECT email, date_of_birth FROM owner_info WHERE phone_number = '123-456-7890'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(OwnerEnum.URL.getValue(), OwnerEnum.USERNAME.getValue(),OwnerEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while(resultSet.next()) {
				System.out.println("discount_percentage ==" + resultSet.getString("discount_percentage"));
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}