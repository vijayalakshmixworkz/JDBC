package com.xworkz.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClipRunner {


		public static void main(String[] args) {
			
			ClipDTO clipDTO1 = new ClipDTO(1, "Elegant Claw Clip", "Plastic","Black", "Medium", "Claw", 150, "StyleCo", "2024-01-15");
			ClipDTO clipDTO2 = new ClipDTO(2, "Classic Snap Clip", "Metal", "Silver", "Small", "Snap", 50, "TrendyAccessories", "2023-10-10");
			ClipDTO clipDTO3 = new ClipDTO(3, "Floral Hair Clip", "Fabric", "Pink", "Large", "Decorative", 200, "FashionFlair", "2024-02-05");
			try {
				Connection connection = null;
				connection = DriverManager.getConnection(ClipEnum.URL.getValue(), ClipEnum.USERNAME.getValue(), ClipEnum.PASSWORD.getValue());

				PreparedStatement preparedStatement = null;
				preparedStatement = connection.prepareStatement("INSERT INTO clip_info (clip_id, clip_name, material, color, size, style, price, manufacturer, release_date) values(?, ?, ?, ?,?,?,?,?,?)");

				preparedStatement.setInt(1, 1);
				preparedStatement.setString(2, clipDTO1.getClip_name());
				preparedStatement.setString(3, clipDTO1.getMaterial());
				preparedStatement.setString(4, clipDTO1.getColor());
				preparedStatement.setString(5, clipDTO1.getSize());
				preparedStatement.setString(6, clipDTO1.getStyle());
				preparedStatement.setInt(7, clipDTO1.getPrice());
				preparedStatement.setString(8, clipDTO1.getManufacturer());
				preparedStatement.setString(9, clipDTO1.getRelease_date());

				preparedStatement.setInt(1, 2);
				preparedStatement.setString(2, clipDTO2.getClip_name());
				preparedStatement.setString(3, clipDTO2.getMaterial());
				preparedStatement.setString(4, clipDTO2.getColor());
				preparedStatement.setString(5, clipDTO2.getSize());
				preparedStatement.setString(6, clipDTO2.getStyle());
				preparedStatement.setInt(7, clipDTO2.getPrice());
				preparedStatement.setString(8, clipDTO2.getManufacturer());
				preparedStatement.setString(9, clipDTO2.getRelease_date());
				preparedStatement.addBatch();

				preparedStatement.setInt(1, 3);
				preparedStatement.setString(2, clipDTO3.getClip_name());
				preparedStatement.setString(3, clipDTO3.getMaterial());
				preparedStatement.setString(4, clipDTO3.getColor());
				preparedStatement.setString(5, clipDTO3.getSize());
				preparedStatement.setString(6, clipDTO3.getStyle());
				preparedStatement.setInt(7, clipDTO3.getPrice());
				preparedStatement.setString(8, clipDTO3.getManufacturer());
				preparedStatement.setString(9, clipDTO3.getRelease_date());

				preparedStatement.addBatch();


				int[] value = preparedStatement.executeBatch();
				if(value.length > 0) {
					System.out.println("Data is saved");
				}else {
					System.out.println("Data is not saved");
				}

			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}