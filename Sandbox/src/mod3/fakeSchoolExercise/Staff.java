package mod3.fakeSchoolExercise;

public class Staff extends Employee {

	private String title;

	/**
	 * Getter method for title
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter method for title
	 * 
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return getName() + ": " + title;
	}

}
