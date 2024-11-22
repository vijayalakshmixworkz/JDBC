package com.xworkz.formJDBC.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.formJDBC.dto.FormDTO;
public class FormRepoImpl  implements FormRepo {

	@Override
	public boolean save(FormDTO dto) {
		boolean valid = true;

		Connection connection = null;
		PreparedStatement prepared = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(FormConnection.URL.getValue(),
					FormConnection.USERNAME.getValue(), FormConnection.PASSWORD.getValue());
			prepared = connection.prepareStatement("insert into smart_phone values(?,?,?,?,?,?,?)");
			prepared.setInt(1, dto.getId());
			prepared.setString(2, dto.getName());
			prepared.setLong(3, dto.getPhoneno());
			prepared.setString(4, dto.getEmail());
			prepared.setString(5, dto.getPassword());
			prepared.setString(6, dto.getAddress());
			prepared.setString(7, dto.getCity());

			int ref = prepared.executeUpdate();
			if (ref > 0) {
				valid = true;
				System.out.println("data is saved");
			} else {
				valid = false;
				System.err.println("data is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}

	// ==================================== List by id
	// =========================================
	@Override
	public String getlistById(int id) {
		String valid = null;
		Connection connection = null;
		PreparedStatement prepared = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(FormConnection.URL.getValue(),
					FormConnection.USERNAME.getValue(), FormConnection.PASSWORD.getValue());
			prepared = connection.prepareStatement("SELECT * FROM smart_phone WHERE id = ?");

			prepared.setInt(1, id);
			ResultSet set = prepared.executeQuery();
			while (set.next()) {
				int id1 = set.getInt("id");
				String name = set.getString("name");
				long phoneno1 = set.getLong("phoneno");
				String email = set.getString("email");
				String password = set.getString("password");
				String address = set.getString("address");
				String city = set.getString("city");
				valid = "Id: " + id1 + ",Name: " + name + ", Phoneno: " + phoneno1 + ", Email: " + email + ",Password:"
						+ password + ",address:" + address + ",city:" + city;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}

	// =============================================By
	// phoneno===========================================

	@Override
	public String getemailByPhone(long phoneno) {

		String isvalid = null;
		Connection connection = null;
		PreparedStatement prepared = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(FormConnection.URL.getValue(),
					FormConnection.USERNAME.getValue(), FormConnection.PASSWORD.getValue());
			prepared = connection.prepareStatement("select name, email from smart_phone where phoneno = ?");

			prepared.setLong(1, phoneno);

			ResultSet set = prepared.executeQuery();
			while (set.next()) {
				String name = set.getString("name");
				String email = set.getString("email");
				isvalid = "Name: " + name + ", Email: " + email;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isvalid;
	}

	// ====================================Email and Password
	// Match=====================================
	public String checkEmailPassword(String email, String password) {

		String valid = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection(FormConnection.URL.getValue(),
					FormConnection.USERNAME.getValue(), FormConnection.PASSWORD.getValue());
			PreparedStatement statement = connection
					.prepareStatement("select * from smart_phone where email = ? AND password = ?");
			statement.setString(1, email);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				valid = "success";
				System.out.println("Login successful");

			} else {

				System.out.println("Invalid email or password");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return valid;
	}

	// ============================================Delete by
	// ID=======================================================
	public int deleteById(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(FormConnection.URL.getValue(),
					FormConnection.USERNAME.getValue(), FormConnection.PASSWORD.getValue());

			preparedStatement = connection.prepareStatement("delete from smart_phone where id = ?");
			preparedStatement.setInt(1, id);

			int Delete = preparedStatement.executeUpdate();
			if (Delete > 0) {
				System.out.println(" deleted successfully");
			} else {
				System.out.println("No ID found ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public String updatedByemail(String name, String address, String email) {
		String valid = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(FormConnection.URL.getValue(),
					FormConnection.USERNAME.getValue(), FormConnection.PASSWORD.getValue());

			preparedStatement = connection
					.prepareStatement("Update  smart_phone set name=?, address=?  WHERE email = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, address);
			preparedStatement.setString(3, email);

			int update = preparedStatement.executeUpdate();
			if (update > 0) {
				System.out.println(" update successfully");
			} else {
				System.out.println("update is false");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}
}