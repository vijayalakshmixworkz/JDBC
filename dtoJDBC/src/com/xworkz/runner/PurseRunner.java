package com.xworkz.runner;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class PurseRunner {

	    public static void main(String[] args) {
	        
	        PurseDTO purseDTO1 = new PurseDTO(1, "Elegant Leather Purse", "Leather", "Black", "Medium", "Handbag", 5000, "StyleCo", "2024-01-15");
	        PurseDTO purseDTO2 = new PurseDTO(2, "Classic Tote Bag", "Fabric", "Blue", "Large", "Tote", 3000, "TrendyAccessories", "2023-10-10");
	        PurseDTO purseDTO3 = new PurseDTO(3, "Chic Clutch", "Synthetic", "Red", "Small", "Clutch", 2000, "FashionFlair", "2024-02-05");

	        try {
	            Connection connection = null;
	            connection = DriverManager.getConnection(PurseEnum.URL.getValue(), PurseEnum.USERNAME.getValue(), PurseEnum.PASSWORD.getValue());

	            PreparedStatement preparedStatement = null;
	            preparedStatement = connection.prepareStatement("INSERT INTO purse_info (purse_id, purse_name, material, color, size, style, price, brand, release_date) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");

	            
	            preparedStatement.setInt(1, purseDTO1.getPurse_id());
	            preparedStatement.setString(2, purseDTO1.getPurse_name());
	            preparedStatement.setString(3, purseDTO1.getMaterial());
	            preparedStatement.setString(4, purseDTO1.getColor());
	            preparedStatement.setString(5, purseDTO1.getSize());
	            preparedStatement.setString(6, purseDTO1.getStyle());
	            preparedStatement.setInt(7, purseDTO1.getPrice());
	            preparedStatement.setString(8, purseDTO1.getBrand());
	            preparedStatement.setString(9, purseDTO1.getRelease_date());
	            preparedStatement.addBatch();

	           
	            preparedStatement.setInt(1, purseDTO2.getPurse_id());
	            preparedStatement.setString(2, purseDTO2.getPurse_name());
	            preparedStatement.setString(3, purseDTO2.getMaterial());
	            preparedStatement.setString(4, purseDTO2.getColor());
	            preparedStatement.setString(5, purseDTO2.getSize());
	            preparedStatement.setString(6, purseDTO2.getStyle());
	            preparedStatement.setInt(7, purseDTO2.getPrice());
	            preparedStatement.setString(8, purseDTO2.getBrand());
	            preparedStatement.setString(9, purseDTO2.getRelease_date());
	            preparedStatement.addBatch();

	           
	            preparedStatement.setInt(1, purseDTO3.getPurse_id());
	            preparedStatement.setString(2, purseDTO3.getPurse_name());
	            preparedStatement.setString(3, purseDTO3.getMaterial());
	            preparedStatement.setString(4, purseDTO3.getColor());
	            preparedStatement.setString(5, purseDTO3.getSize());
	            preparedStatement.setString(6, purseDTO3.getStyle());
	            preparedStatement.setInt(7, purseDTO3.getPrice());
	            preparedStatement.setString(8, purseDTO3.getBrand());
	            preparedStatement.setString(9, purseDTO3.getRelease_date());
	            preparedStatement.addBatch();

	            
	            int[] value = preparedStatement.executeBatch();
	            if (value.length > 0) {
	                System.out.println("Data is saved");
	            } else {
	                System.out.println("Data is not saved");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

