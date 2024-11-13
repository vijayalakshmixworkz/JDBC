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
			prst.setInt(1, 1);
			prst.setString(2,"Nemo");
			prst.setString(3, "Clownfish");
			prst.setString(4, "Coral Reef");
			prst.setInt(5,2);
			
			prst.setInt(1, 2);
			prst.setString(2,"Dory");
			prst.setString(3, "Blue Tang");
			prst.setString(4, "Coral Reef");
			prst.setInt(5,3);
			
			prst.setInt(1, 3);
			prst.setString(2,"Goldie");
			prst.setString(3, "Goldfish");
			prst.setString(4, "Freshwater Aquarium");
			prst.setInt(5,1);
			
			prst.setInt(1, 4);
			prst.setString(2,"Sammy");
			prst.setString(3, "Salmon");
			prst.setString(4, "Coral Reef");
			prst.setInt(5,3);
			
			prst.setInt(1, 5);
			prst.setString(2,"Bubbles");
			prst.setString(3, "Betta Fish");
			prst.setString(4, "Freshwater Aquarium");
			prst.setInt(5,4);
			

			prst.setInt(1, 6);
			prst.setString(2,"Sharky");
			prst.setString(3, "Great White Shark");
			prst.setString(4, "Open Ocean");
			prst.setInt(5,10);

			prst.setInt(1, 7);
			prst.setString(2,"Ray");
			prst.setString(3, "Stingray");
			prst.setString(4, "Shallow Seas");
			prst.setInt(5,5);
			
			
			prst.setInt(1, 8);
			prst.setString(2,"Spike");
			prst.setString(3, "Pufferfish");
			prst.setString(4, "Coral Reef");
			prst.setInt(5,3);
			
			prst.setInt(1, 9);
			prst.setString(2,"Flippy");
			prst.setString(3, "Guppy");
			prst.setString(4, "Freshwater Aquarium");
			prst.setInt(5,1);

			prst.setInt(1, 10);
			prst.setString(2,"Finn");
			prst.setString(3, "Swordfish");
			prst.setString(4, "Deep Ocean");
			prst.setInt(5,6);
			
			prst.setInt(1, 11);
			prst.setString(2,"Whaley");
			prst.setString(3, "Blue Whale");
			prst.setString(4, "Ocean");
			prst.setInt(5,25);
			
			
			prst.setInt(1, 12);
			prst.setString(2,"Gill");
			prst.setString(3, "Moorish Idol");
			prst.setString(4, "Coral Reef");
			prst.setInt(5,4);
			
			prst.setInt(1, 13);
			prst.setString(2,"Tiny");
			prst.setString(3, "Seahorse");
			prst.setString(4, "Seagrass Beds");
			prst.setInt(5,2);
		
			prst.setInt(1, 14);
			prst.setString(2,"Rocky");
			prst.setString(3, "Rockfish");
			prst.setString(4, "Rocky Reefs");
			prst.setInt(5,8);
			
			
			prst.setInt(1, 15);
			prst.setString(2,"Shelly");
			prst.setString(3, "Sea Turtle");
			prst.setString(4, "Coastal Waters");
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
