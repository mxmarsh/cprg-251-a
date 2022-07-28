package mod12.application;

public class UpdateTest {

	public static void main(String[] args) {
		// connect to the db

		// insert: add 2 new students
		int numberOfStudentsAdded = driver.update(query);
		if (numberOfStudentsAdded == 0)
			System.out.println("No students were added.");
		else
			System.out.println(numberOfStudentsAdded + " students were added.");

		// update: change any student below 2.0 to have a GPA of 2.0

		// delete: delete at least the 2 students we added earlier.

		// disconnect

	}

}
