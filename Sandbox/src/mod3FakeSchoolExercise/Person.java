package mod3FakeSchoolExercise;

/**
 * Class description: This represents a person.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Person {

	// fields:
	private String name;
	private String email;
	private double cardBalance; // default value is already 0

	// constructors:

	/**
	 * Getter method for name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for email
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method for email
	 * 
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Setter method for cardBalance
	 * 
	 * @param cardBalance the cardBalance to set
	 */
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}

	// accessor & mutator methods:
	/**
	 * Getter method for cardBalance
	 * 
	 * @return the cardBalance
	 */
	public final double getCardBalance() {
		return cardBalance;
	}

	// any other methods:
	@Override
	public String toString() {
		return String.format("%s: $%f", name, cardBalance); // Name: $1.23
	}

}
