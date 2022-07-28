package mod12.application;

import java.sql.*;

public class PreparedStatementTest {

	private static final String SERVER = "localhost";
	private static final int PORT = 3306;
	private static final String DATABASE = "cprg251";
	private static final String USERNAME = "cprg251";
	private static final String PASSWORD = "password";

	public static void main(String[] args) {
		// connect to the db
		String dsn = getDsn();
		try {
			Connection connection = DriverManager.getConnection(dsn);

			// create a PreparedStatement
			String query = "SELECT * FROM student WHERE gpa <= ? OR name = ?";
			PreparedStatement ps = connection.prepareStatement(query);

			// replace the placeholders
			double placeholderGPA = 2.0;
			String placeholderName = "Joe Blow"; // TO DO : replace this with user inputs
			ps.setDouble(1, placeholderGPA);
			ps.setString(2, placeholderName);

			// execute the statement
			ResultSet rs = ps.executeQuery();

			// display our results
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
			connection.close();
		} catch (SQLException e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}

	}

	private static String getDsn() {
		// Data source name is formatted as follows (for MariaDB):
		// jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword
		String dataSourceName = String.format("jdbc:mariadb://%s:%d/%s?user=%s&password=%s", SERVER, PORT, DATABASE,
				USERNAME, PASSWORD);

		return dataSourceName;
	}

}
