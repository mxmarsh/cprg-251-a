package mod3.fakeSchoolExercise;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Employee extends Person {

	private boolean hasComputer;

	/**
	 * Initializes the newly created Employee
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if (hasComputer)
			return getName() + " has a computer.";
		else
			return this.getName() + " does not have a computer.";
	}

}
