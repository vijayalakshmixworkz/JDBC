package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PassengerRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not installed");
			e.printStackTrace();
		}
		String insertQuery = "INSERT INTO passenger_info "
				+"(passenger_id, first_name, last_name, email, phone_number, date_of_birth, gender, nationality, address, city, state, postal_code) VALUES"
				+"(1, 'Raj', 'Sharma', 'raj.sharma@example.com', '9876500001', '1980-02-15', 'Male', 'Indian', '101 First Avenue', 'Mumbai', 'Maharashtra', '400001'),"
				+"(2, 'Sita', 'Patel', 'sita.patel@example.com', '9876500002', '1992-03-05', 'Female', 'Indian', '202 Second Street', 'Ahmedabad', 'Gujarat', '380002'),"
				+"(3, 'Arjun', 'Reddy', 'arjun.reddy@example.com', '9876500003', '1985-04-10', 'Male', 'Indian', '303 Third Road', 'Hyderabad', 'Telangana', '500003'),"
				+"(4, 'Meena', 'Desai', 'meena.desai@example.com', '9876500004', '1990-06-20', 'Female', 'Indian', '404 Fourth Lane', 'Pune', 'Maharashtra', '411004'),"
				+"(5, 'Karan', 'Singh', 'karan.singh@example.com', '9876500005', '1983-08-25', 'Male', 'Indian', '505 Fifth Circle', 'Jaipur', 'Rajasthan', '302005'),"
				+"(6, 'Neha', 'Khan', 'neha.khan@example.com', '9876500006', '1987-09-15', 'Female', 'Indian', '606 Sixth Way', 'Lucknow', 'Uttar Pradesh', '226006'),"
				+"(7, 'Vikas', 'Verma', 'vikas.verma@example.com', '9876500007', '1995-01-30', 'Male', 'Indian', '707 Seventh Blvd', 'Chandigarh', 'Chandigarh', '160007'),"
				+"(8, 'Anjali', 'Gupta', 'anjali.gupta@example.com', '9876500008', '1999-05-18', 'Female', 'Indian', '808 Eighth Square', 'Bhopal', 'Madhya Pradesh', '462008'),"
				+"(9, 'Aman', 'Joshi', 'aman.joshi@example.com', '9876500009', '1991-12-05', 'Male', 'Indian', '909 Ninth Alley', 'Kolkata', 'West Bengal', '700009'),"
				+"(10, 'Priya', 'Das', 'priya.das@example.com', '9876500010', '1988-07-07', 'Female', 'Indian', '1010 Tenth Lane', 'Delhi', 'Delhi', '110010'),"
				+"(11, 'Rohit', 'Bose', 'rohit.bose@example.com', '9876500011', '1982-11-20', 'Male', 'Indian', '1111 Eleventh Drive', 'Guwahati', 'Assam', '781011'),"
				+"(12, 'Sneha', 'Yadav', 'sneha.yadav@example.com', '9876500012', '1994-02-22', 'Female', 'Indian', '1212 Twelfth Road', 'Ranchi', 'Jharkhand', '834012'),"
				+"(13, 'Manish', 'Mishra', 'manish.mishra@example.com', '9876500013', '1986-03-25', 'Male', 'Indian', '1313 Thirteenth Path', 'Patna', 'Bihar', '800013'),"
				+"(14, 'Ritu', 'Kapoor', 'ritu.kapoor@example.com', '9876500014', '1993-04-17', 'Female', 'Indian', '1414 Fourteenth Row', 'Kochi', 'Kerala', '682014'),"
				+"(15, 'Ajay', 'Mehta', 'ajay.mehta@example.com', '9876500015', '1989-06-13', 'Male', 'Indian', '1515 Fifteenth Park', 'Chennai', 'Tamil Nadu', '600015'),"
				+"(16, 'Pooja', 'Sen', 'pooja.sen@example.com', '9876500016', '1984-08-11', 'Female', 'Indian', '1616 Sixteenth Lane', 'Surat', 'Gujarat', '395016'),"
				+"(17, 'Rahul', 'Banerjee', 'rahul.banerjee@example.com', '9876500017', '1996-09-09', 'Male', 'Indian', '1717 Seventeenth Court', 'Shimla', 'Himachal Pradesh', '171017'),"
				+"(18, 'Deepa', 'Thakur', 'deepa.thakur@example.com', '9876500018', '1997-10-12', 'Female', 'Indian', '1818 Eighteenth Place', 'Dehradun', 'Uttarakhand', '248018'),"
				+"(19, 'Vivek', 'Kumar', 'vivek.kumar@example.com', '9876500019', '1998-12-01', 'Male', 'Indian', '1919 Nineteenth Gate', 'Agra', 'Uttar Pradesh', '282019'),"
				+"(20, 'Shreya', 'Rao', 'shreya.rao@example.com', '9876500020', '1992-05-03', 'Female', 'Indian', '2020 Twentieth Avenue', 'Nagpur', 'Maharashtra', '440020');";

				try {
					Connection connection = null;
					System.out.println("Connection established");
					connection = DriverManager.getConnection(PassengerEnum.URL.getValue(), PassengerEnum.USERNAME.getValue(),
							PassengerEnum.PASSWORD.getValue());
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
