package com.xworkz.customer.runner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class PassengerRunner2 {


    public static void main(String[] args) {

        String query = "SELECT address FROM passenger_info WHERE first_name = 'John'AND phone_number = '123-456-7890'";

        try (Connection connection = DriverManager.getConnection(
        		PassengerEnum.URL.getValue(), 
        		PassengerEnum.USERNAME.getValue(), 
        		PassengerEnum.PASSWORD.getValue());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                System.out.println("Data from table: " + resultSet.getString("customer_id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}