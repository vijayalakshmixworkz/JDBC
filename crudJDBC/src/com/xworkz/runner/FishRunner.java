package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FishRunner {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst=null;
		try {
			connection=DriverManager.getConnection(
					Fish.URL.getValue(),
					Fish.USERNAME.getValue(),
					Fish.PASSWORD.getValue());
			prst=connection.prepareStatement("insert into fish_info values(?,?,?,?,?)");
			prst.setInt(1, 2);
			prst.setString(2,"Dory");
			prst.setString(3, "Blue Tang");
			prst.setString(4, "Coral Reef");
			prst.setInt(5,3);
			
			
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
