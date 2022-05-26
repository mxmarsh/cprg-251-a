package mod3FakeSchoolExercise;

/**
 * Class description: This represents a Student.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Student extends Person {

	private int creditsEarned;

	/**
	 * Getter method for creditsEarned
	 * 
	 * @return the creditsEarned
	 */
	public int getCreditsEarned() {
		return creditsEarned;
	}

	/**
	 * Setter method for creditsEarned
	 * 
	 * @param creditsEarned the creditsEarned to set
	 */
	public void setCreditsEarned(int creditsEarned) {
		this.creditsEarned = creditsEarned;
	}

	/**
	 * Initializes the newly created Student
	 */
	public Student() {
	}

	@Override
	public String toString() {
		return String.format("%s: %d credits earned", getName(), creditsEarned);
	}

	public String useHiddenToString() {
		return super.toString(); // use the version of toString() in the superclass
	}

}
