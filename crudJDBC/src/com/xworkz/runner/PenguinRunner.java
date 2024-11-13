package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
			//prst.setInt(1, 2);
			//prst.setString(2,"kiki");
			//prst.setString(3, "Adelie");
			//prst.setInt(4,3);
			
			prst.setInt(1, 1);
			prst.setString(2,"Pingu");
			prst.setString(3, "Emperor");
			prst.setInt(4,4);
			
			prst.setInt(1, 3);
			prst.setString(2,"Momo");
			prst.setString(3, "Chinstrap");
			prst.setInt(4,4);
			
			prst.setInt(1, 4);
			prst.setString(2,"Lulu");
			prst.setString(3, "Little Blue");
			prst.setInt(4,2);
			
			prst.setInt(1, 5);
			prst.setString(2,"Raju");
			prst.setString(3, "King");
			prst.setInt(4,6);
			
			prst.setInt(1, 6);
			prst.setString(2,"Toto");
			prst.setString(3, "Gentoo");
			prst.setInt(4,3);
			
			prst.setInt(1, 7);
			prst.setString(2,"Bobo");
			prst.setString(3, "Rockhopper");
			prst.setInt(4,7);
			
			prst.setInt(1, 8);
			prst.setString(2,"Rani");
			prst.setString(3, "Macaroni");
			prst.setInt(4,5);

			prst.setInt(1, 9);
			prst.setString(2,"Chintu");
			prst.setString(3, "Royal");
			prst.setInt(4,8);
			
			prst.setInt(1, 10);
			prst.setString(2,"Sasha");
			prst.setString(3, "Fiordland");
			prst.setInt(4,4);
			
			prst.setInt(1, 11);
			prst.setString(2,"Tina");
			prst.setString(3, "Humboldt");
			prst.setInt(4,6);

			prst.setInt(1, 12);
			prst.setString(2,"Pip");
			prst.setString(3, "Magellanic");
			prst.setInt(4,2);
			
			prst.setInt(1, 13);
			prst.setString(2,"Benny");
			prst.setString(3, "Snares");
			prst.setInt(4,3);
			
			prst.setInt(1, 14);
			prst.setString(2,"Mili");
			prst.setString(3, "Yellow-eyed");
			prst.setInt(4,5);

			prst.setInt(1, 15);
			prst.setString(2,"Luna");
			prst.setString(3, "African");
			prst.setInt(4,4);
			
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
