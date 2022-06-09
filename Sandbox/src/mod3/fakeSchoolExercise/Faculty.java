package mod3.fakeSchoolExercise;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Faculty extends Employee {

	private String specialty;

	/**
	 * Getter method for specialty
	 * 
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * Setter method for specialty
	 * 
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	/**
	 * Initializes the newly created Faculty
	 */
	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	public Faculty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return this.getName() + " specialized in " + specialty;
	}

}
