package mod12.application;

import java.sql.SQLException;

import mod12.drivers.*;

public class UpdateTest {

	public static void main(String[] args) {
		DatabaseDriver driver = new MariaDBDriver();

		try {
			// connect to the db
			driver.connect();

			// insert: add 2 new students
			int numStudentsAdded = driver
					.update("INSERT INTO student (id, name, gpa) VALUES (5, 'John Doe', 3.5), (6, 'Jane Doe', 3.0)");
			if (numStudentsAdded == 0)
				System.out.println("No students were added.");
			else
				System.out.println(numStudentsAdded + " students were added.");

			// update: change any student below 2.0 to have a GPA of 2.0
			int numStudentsUpdated = driver.update("UPDATE student SET gpa = 2.0 WHERE gpa < 2.0");
			if (numStudentsUpdated == 0)
				System.out.println("No students were updated.");
			else
				System.out.println(numStudentsUpdated + " students were updated.");

			// delete: delete at least the 2 students we added earlier.
			int numStudentsDeleted = driver.update("DELETE FROM student WHERE name LIKE '%DOE'");
			if (numStudentsDeleted == 0)
				System.out.println("No students were deleted.");
			else
				System.out.println(numStudentsDeleted + " students were deleted.");

			// disconnect
			driver.disconnect();

		} catch (SQLException e) {
			System.out.println("Something went wrong in SQL.");
			e.printStackTrace();
		}

	}

}
