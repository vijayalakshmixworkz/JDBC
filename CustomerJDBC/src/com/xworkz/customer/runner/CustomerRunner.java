package com.xworkz.customer.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerRunner {
	
		public static void main(String[] args) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver installed");
			} catch (ClassNotFoundException e) {
				System.out.println("Driver not installed");
				e.printStackTrace();
			}
			String insertQuery = "INSERT INTO customer_info "
					+"(id, first_name, last_name, email, phone_number, date_of_birth, address, city, state, postal_code, account_balance, loyalty_points) VALUES"
					+"(1, 'Aarav', 'Sharma', 'aarav.sharma@example.com', '9876543210', '1990-02-14', '123 Main Street', 'Mumbai', 'Maharashtra', '400001', 5000, 120),"
					+"(2, 'Vivaan', 'Gupta', 'vivaan.gupta@example.com', '9876543211', '1988-05-23', '456 Market Road', 'Delhi', 'Delhi', '110001', 12000, 450),"
					+"(3, 'Aanya', 'Kapoor', 'aanya.kapoor@example.com', '9876543212', '1992-08-09', '789 Park Lane', 'Bengaluru', 'Karnataka', '560001', 8000, 300),"
					+"(4, 'Krishna', 'Reddy', 'krishna.reddy@example.com', '9876543213', '1995-11-30', '101 Garden Avenue', 'Hyderabad', 'Telangana', '500001', 7000, 200),"
					+"(5, 'Diya', 'Mehta', 'diya.mehta@example.com', '9876543214', '1985-04-18', '202 Lake View', 'Chennai', 'Tamil Nadu', '600001', 6500, 250),"
					+"(6, 'Arjun', 'Patel', 'arjun.patel@example.com', '9876543215', '1989-12-25', '303 Hilltop Street', 'Ahmedabad', 'Gujarat', '380001', 5500, 100),"
					+"(7, 'Ishaan', 'Singh', 'ishaan.singh@example.com', '9876543216', '1991-07-07', '404 Palm Drive', 'Jaipur', 'Rajasthan', '302001', 9800, 380),"
					+"(8, 'Maya', 'Chauhan', 'maya.chauhan@example.com', '9876543217', '1993-10-19', '505 Maple Street', 'Pune', 'Maharashtra', '411001', 11000, 500),"
					+"(9, 'Kabir', 'Joshi', 'kabir.joshi@example.com', '9876543218', '1994-09-21', '606 Birch Avenue', 'Lucknow', 'Uttar Pradesh', '226001', 7500, 320),"
					+"(10, 'Tara', 'Nair', 'tara.nair@example.com', '9876543219', '1996-03-03', '707 Oak Lane', 'Kochi', 'Kerala', '682001', 9000, 410),"
					+"(11, 'Rohan', 'Desai', 'rohan.desai@example.com', '9876543220', '1987-01-12', '808 Cedar Boulevard', 'Surat', 'Gujarat', '395001', 6700, 150),"
					+"(12, 'Sanya', 'Varma', 'sanya.varma@example.com', '9876543221', '1998-06-17', '909 Elm Street', 'Bhopal', 'Madhya Pradesh', '462001', 8500, 360),"
					+"(13, 'Aarohi', 'Saxena', 'aarohi.saxena@example.com', '9876543222', '1997-02-28', '1010 Ash Road', 'Kanpur', 'Uttar Pradesh', '208001', 10500, 470),"
					+"(14, 'Dev', 'Chandra', 'dev.chandra@example.com', '9876543223', '1984-05-05', '1111 Spruce Circle', 'Patna', 'Bihar', '800001', 5800, 180),"
					+"(15, 'Priya', 'Bajpai', 'priya.bajpai@example.com', '9876543224', '1999-09-14', '1212 Willow Drive', 'Indore', 'Madhya Pradesh', '452001', 7300, 290),"
					+"(16, 'Rudra', 'Malhotra', 'rudra.malhotra@example.com', '9876543225', '1986-08-11', '1313 Cypress Way', 'Chandigarh', 'Chandigarh', '160001', 6200, 140),"
					+"(17, 'Meera', 'Yadav', 'meera.yadav@example.com', '9876543226', '1982-03-08', '1414 Poplar Street', 'Gurgaon', 'Haryana', '122001', 7600, 320),"
					+"(18, 'Kunal', 'Thakur', 'kunal.thakur@example.com', '9876543227', '1990-12-22', '1515 Sycamore Lane', 'Noida', 'Uttar Pradesh', '201301', 8900, 400),"
					+"(19, 'Riya', 'Pandey', 'riya.pandey@example.com', '9876543228', '1983-11-02', '1616 Magnolia Avenue', 'Faridabad', 'Haryana', '121001', 9400, 370),"
					+"(20, 'Aryan', 'Bose', 'aryan.bose@example.com', '9876543229', '1995-10-27', '1717 Redwood Place', 'Guwahati', 'Assam', '781001', 7100, 260);";

			try {
				Connection connection = null;
				System.out.println("Connection established");
				connection = DriverManager.getConnection(CustomerEnum.URL.getValue(), CustomerEnum.USERNAME.getValue(),
						CustomerEnum.PASSWORD.getValue());
				Statement statement = connection.createStatement();
				int value = statement.executeUpdate(insertQuery);
				if (value > 0) {
					System.out.println("Data saved");
				} else {
					System.out.println("Not saved");
				}
			} catch (SQLException e) {
				System.err.println("Connection not established");
				e.printStackTrace();
			}

		}
	}
