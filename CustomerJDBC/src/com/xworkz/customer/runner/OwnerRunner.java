package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OwnerRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not installed");
			e.printStackTrace();
		}
		String insertQuery = "INSERT INTO client_info "
				+"(owner_id, first_name, last_name, email, phone_number, date_of_birth, gender, address, city, state, postal_code, business_name, business_type) VALUES"
				+"(1, 'Raj', 'Sharma', 'raj.sharma@business.com', '9876511111', '1975-03-21', 'Male', '101 Business Ave', 'Mumbai', 'Maharashtra', '400001', 'Tech Solutions', 'IT Services'),"
				+"(2, 'Simran', 'Patel', 'simran.patel@enterprise.com', '9876511112', '1982-11-12', 'Female', '202 Market Street', 'Ahmedabad', 'Gujarat', '380002', 'Patel Retail', 'Retail'),"
				+"(3, 'Arun', 'Reddy', 'arun.reddy@corp.com', '9876511113', '1979-05-08', 'Male', '303 Trade Road', 'Hyderabad', 'Telangana', '500003', 'Reddy Constructions', 'Construction'),"
				+"(4, 'Neha', 'Kumar', 'neha.kumar@venture.com', '9876511114', '1985-07-17', 'Female', '404 Industry Blvd', 'Pune', 'Maharashtra', '411004', 'Kumar Ventures', 'Finance'),"
				+"(5, 'Vikram', 'Singh', 'vikram.singh@innovate.com', '9876511115', '1990-09-30', 'Male', '505 Innovation Drive', 'Jaipur', 'Rajasthan', '302005', 'Singh Innovations', 'Startup Incubator'),"
				+"(6, 'Priya', 'Desai', 'priya.desai@fashion.com', '9876511116', '1988-02-22', 'Female', '606 Style Lane', 'Lucknow', 'Uttar Pradesh', '226006', 'Desai Fashion', 'Fashion Design'),"
				+"(7, 'Karan', 'Mehta', 'karan.mehta@realty.com', '9876511117', '1977-10-05', 'Male', '707 Realty Row', 'Chandigarh', 'Chandigarh', '160007', 'Mehta Realty', 'Real Estate'),"
				+"(8, 'Ananya', 'Bose', 'ananya.bose@wellness.com', '9876511118', '1983-01-15', 'Female', '808 Health Avenue', 'Bhopal', 'Madhya Pradesh', '462008', 'Bose Wellness', 'Healthcare'),"
				+"(9, 'Rishi', 'Kapoor', 'rishi.kapoor@auto.com', '9876511119', '1978-04-11', 'Male', '909 Car Street', 'Kolkata', 'West Bengal', '700009', 'Kapoor Automobiles', 'Automobile Dealership'),"
				+"(10, 'Pooja', 'Nair', 'pooja.nair@media.com', '9876511120', '1987-06-25', 'Female', '1010 Media Blvd', 'Delhi', 'Delhi', '110010', 'Nair Media', 'Media Production'),"
				+"(11, 'Sandeep', 'Yadav', 'sandeep.yadav@logistics.com', '9876511121', '1984-12-18', 'Male', '1111 Transport Ave', 'Guwahati', 'Assam', '781011', 'Yadav Logistics', 'Transportation'),"
				+"(12, 'Meera', 'Gupta', 'meera.gupta@consult.com', '9876511122', '1980-08-29', 'Female', '1212 Advisor Lane', 'Ranchi', 'Jharkhand', '834012', 'Gupta Consulting', 'Business Consulting'),"
				+"(13, 'Anil', 'Mishra', 'anil.mishra@exports.com', '9876511123', '1976-11-02', 'Male', '1313 Trade Blvd', 'Patna', 'Bihar', '800013', 'Mishra Exports', 'Exports'),"
				+"(14, 'Radhika', 'Joshi', 'radhika.joshi@edu.com', '9876511124', '1989-04-14', 'Female', '1414 Education Park', 'Kochi', 'Kerala', '682014', 'Joshi Academy', 'Education'),"
				+"(15, 'Manoj', 'Banerjee', 'manoj.banerjee@hospitality.com', '9876511125', '1981-09-09', 'Male', '1515 Hotel Row', 'Chennai', 'Tamil Nadu', '600015', 'Banerjee Hospitality', 'Hotel Management'),"
				+"(16, 'Sneha', 'Roy', 'sneha.roy@eco.com', '9876511126', '1992-03-11', 'Female', '1616 Eco Way', 'Surat', 'Gujarat', '395016', 'Roy Eco Products', 'Eco-friendly Goods'),"
				+"(17, 'Vikash', 'Ahuja', 'vikash.ahuja@food.com', '9876511127', '1986-12-24', 'Male', '1717 Gourmet Blvd', 'Shimla', 'Himachal Pradesh', '171017', 'Ahuja Foods', 'Food and Beverage'),"
				+"(18, 'Pallavi', 'Sen', 'pallavi.sen@travel.com', '9876511128', '1993-05-19', 'Female', '1818 Travel Lane', 'Dehradun', 'Uttarakhand', '248018', 'Sen Travels', 'Travel Agency'),"
				+"(19, 'Ashish', 'Khan', 'ashish.khan@sports.com', '9876511129', '1975-08-10', 'Male', '1919 Sports Street', 'Agra', 'Uttar Pradesh', '282019', 'Khan Sports', 'Sports Equipment'),"
				+"(20, 'Neelam', 'Rao', 'neelam.rao@designs.com', '9876511130', '1991-07-03', 'Female', '2020 Design Blvd', 'Nagpur', 'Maharashtra', '440020', 'Rao Designs', 'Interior Design');";

				try {
					Connection connection = null;
					System.out.println("Connection established");
					connection = DriverManager.getConnection(OwnerEnum.URL.getValue(), OwnerEnum.USERNAME.getValue(),
							OwnerEnum.PASSWORD.getValue());
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
