package mod12.application;

import java.sql.*;

import mod12.drivers.*;

public class SelectTest {

	public static void main(String[] args) {

		DatabaseDriver driver = new MariaDBDriver();

		try {
			// connect to the db
			driver.connect();

			// execute the SQL query
			ResultSet rs = driver.get("SELECT * FROM student"); // TO DO: make query better

			// view the results of the query
			while (rs.next()) {
				// read and display their ID
				int id = rs.getInt(1);
				System.out.println("ID:   " + id);

				// read and display their name
				String name = rs.getString(2);
				System.out.println("Name: " + name);

				// read and display their GPA
				double gpa = rs.getDouble(3);
				System.out.println("GPA:  " + gpa);

				// TO DO: create Student objects
			}

			// disconnect
			driver.disconnect();
		} catch (SQLException e) {
			System.out.println("Could not connect to server.");
		}

	}

}
