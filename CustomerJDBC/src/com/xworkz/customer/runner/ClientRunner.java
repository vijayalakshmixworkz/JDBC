package com.xworkz.customer.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ClientRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not installed");
			e.printStackTrace();
		}
		String insertQuery = "INSERT INTO client_info "
				+" (client_id, first_name, last_name, email, phone_number, date_of_birth, company_name, job_title, address, city, state, postal_code, annual_income, credit_score) VALUES"
				+"(1, 'Rohan', 'Sharma', 'rohan.sharma@example.com', '9876543100', '1988-01-15', 'Tech Innovations', 'Software Engineer', '123 Main Street', 'Mumbai', 'Maharashtra', '400001', 900000, 750),"
				+"(2, 'Simran', 'Verma', 'simran.verma@example.com', '9876543101', '1990-03-22', 'HealthCare Ltd.', 'Doctor', '456 Park Avenue', 'Delhi', 'Delhi', '110002', 1200000, 800),"
				+"(3, 'Arjun', 'Singh', 'arjun.singh@example.com', '9876543102', '1985-07-30', 'FinServe Pvt. Ltd.', 'Financial Analyst', '789 Hilltop Road', 'Bengaluru', 'Karnataka', '560002', 750000, 720),"
				+"(4, 'Priya', 'Nair', 'priya.nair@example.com', '9876543103', '1992-06-17', 'EduSmart', 'Teacher', '101 Lake View', 'Chennai', 'Tamil Nadu', '600003', 500000, 680),"
				+"(5, 'Kabir', 'Mishra', 'kabir.mishra@example.com', '9876543104', '1991-05-08', 'AutoWorks', 'Engineer', '202 Maple Street', 'Pune', 'Maharashtra', '411004', 800000, 760),"
				+"(6, 'Ananya', 'Patel', 'ananya.patel@example.com', '9876543105', '1983-12-25', 'Retail Solutions', 'Manager', '303 Birch Avenue', 'Ahmedabad', 'Gujarat', '380005', 650000, 700),"
				+"(7, 'Vikram', 'Kumar', 'vikram.kumar@example.com', '9876543106', '1987-09-13', 'SmartBuild', 'Architect', '404 Oak Lane', 'Hyderabad', 'Telangana', '500006', 1100000, 780),"
				+"(8, 'Tanya', 'Gupta', 'tanya.gupta@example.com', '9876543107', '1994-02-28', 'Legal Corp', 'Lawyer', '505 Palm Drive', 'Jaipur', 'Rajasthan', '302007', 950000, 820),"
				+"(9, 'Raj', 'Kapoor', 'raj.kapoor@example.com', '9876543108', '1993-11-21', 'AdBiz Agency', 'Marketing Executive', '606 Cedar Road', 'Lucknow', 'Uttar Pradesh', '226008', 600000, 690),"
				+"(10, 'Aisha', 'Desai', 'aisha.desai@example.com', '9876543109', '1989-04-19', 'Media House', 'Journalist', '707 Willow Drive', 'Kochi', 'Kerala', '682009', 700000, 710),"
				+"(11, 'Ravi', 'Yadav', 'ravi.yadav@example.com', '9876543110', '1986-08-15', 'Agro Foods', 'Sales Manager', '808 Poplar Street', 'Surat', 'Gujarat', '395010', 850000, 730),"
				+"(12, 'Megha', 'Bose', 'megha.bose@example.com', '9876543111', '1995-01-10', 'IT Solutions', 'Data Analyst', '909 Sycamore Lane', 'Bhopal', 'Madhya Pradesh', '462011', 550000, 670),"
				+"(13, 'Aditya', 'Joshi', 'aditya.joshi@example.com', '9876543112', '1984-11-05', 'Green Energy', 'Consultant', '1010 Ashwood Blvd', 'Patna', 'Bihar', '800012', 1150000, 800),"
				+"(14, 'Sanya', 'Pandit', 'sanya.pandit@example.com', '9876543113', '1998-09-25', 'Wellness Inc.', 'Pharmacist', '1111 Redwood Place', 'Indore', 'Madhya Pradesh', '452013', 400000, 640),"
				+"(15, 'Rishabh', 'Ahuja', 'rishabh.ahuja@example.com', '9876543114', '1997-03-30', 'Ecom Ventures', 'Product Manager', '1212 Spruce Circle', 'Chandigarh', 'Chandigarh', '160014', 850000, 780),"
				+"(16, 'Anika', 'Rao', 'anika.rao@example.com', '9876543115', '1982-07-20', 'Global Exports', 'Trader', '1313 Magnolia Street', 'Gurgaon', 'Haryana', '122015', 900000, 710),"
				+"(17, 'Karan', 'Shetty', 'karan.shetty@example.com', '9876543116', '1996-10-05', 'Aviation Ltd.', 'Pilot', '1414 Cypress Avenue', 'Noida', 'Uttar Pradesh', '201316', 1500000, 860),"
				+"(18, 'Pooja', 'Khan', 'pooja.khan@example.com', '9876543117', '1988-06-18', 'Hotel Grand', 'Chef', '1515 Aspen Road', 'Faridabad', 'Haryana', '121017', 650000, 690),"
				+"(19, 'Arav', 'Dutta', 'arav.dutta@example.com', '9876543118', '1985-02-11', 'Luxury Cars', 'Car Dealer', '1616 Elm Place', 'Guwahati', 'Assam', '781018', 1200000, 810),"
				+"(20, 'Diya', 'Bansal', 'diya.bansal@example.com', '9876543119', '1999-12-02', 'EcoPlan', 'Environmentalist', '1717 Willow Way', 'Thane', 'Maharashtra', '400019', 700000, 720);";

				try {
					Connection connection = null;
					System.out.println("Connection established");
					connection = DriverManager.getConnection(ClientEnum.URL.getValue(), ClientEnum.USERNAME.getValue(),
							ClientEnum.PASSWORD.getValue());
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
