package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StarRunner {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst=null;
		try {
			connection=DriverManager.getConnection(
					Star.URL.getValue(),
					Star.USERNAME.getValue(),
					Star.PASSWORD.getValue());
			prst=connection.prepareStatement("insert into star_info values(?,?,?,?)");
			//prst.setInt(1, 4);
			//prst.setString(2,"yellow_dwarf");
			//prst.setString(3, "sun");
			//prst.setInt(4,100);
		
			
					prst.setInt(1, 1);
					prst.setString(2,"Red _dwarf");
					prst.setString(3, "Proxima Centauri");
					prst.setInt(4,42);

					prst.setInt(1, 2);
					prst.setString(2,"Blue Giant");
					prst.setString(3, "Rigel");
					prst.setInt(4,86);
					
					prst.setInt(1, 3);
					prst.setString(2,"White_dwarf");
					prst.setString(3, "Sirius B");
					prst.setInt(4,81);

					prst.setInt(1, 5);
					prst.setString(2,"Red Giant");
					prst.setString(3, "Betelgeuse");
					prst.setInt(4,64);

					prst.setInt(1, 6);
					prst.setString(2,"Neutron Star");
					prst.setString(3, "PSR B191921");
					prst.setInt(4,100);

					prst.setInt(1, 7);
					prst.setString(2,"Supergiant");
					prst.setString(3, "VY Canis Majoris");
					prst.setInt(4,49);

					prst.setInt(1, 8);
					prst.setString(2,"Brown_dwarf");
					prst.setString(3, "WISE 0855−0714");
					prst.setInt(4,72);

					prst.setInt(1, 9);
					prst.setString(2,"Hypergiant");
					prst.setString(3, "UY Scuti");
					prst.setInt(4,95);
				
					prst.setInt(1, 10);
					prst.setString(2,"Pulsar");
					prst.setString(3, "Crab Pulsar");
					prst.setInt(4,65);

					prst.setInt(1, 11);
					prst.setString(2,"White Giant");
					prst.setString(3, "Deneb");
					prst.setInt(4,26);

					prst.setInt(1, 12);
					prst.setString(2,"yellow Supergiant");
					prst.setString(3, "Polaris");
					prst.setInt(4,43);
					
					prst.setInt(1, 4);
					prst.setString(2,"yellow_dwarf");
					prst.setString(3, "sun");
					prst.setInt(4,100);
					
					prst.setInt(1, 13);
					prst.setString(2,"Wolf-Rayet Star");
					prst.setString(3, "WR");
					prst.setInt(4,80);
					
					
					prst.setInt(1, 14);
					prst.setString(2,"Variable Star");
					prst.setString(3, "Algol");
					prst.setInt(4,93);
				

					prst.setInt(1, 15);
					prst.setString(2,"Binary Star");
					prst.setString(3, "Alpha Centauri");
					prst.setInt(4,41);
					
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