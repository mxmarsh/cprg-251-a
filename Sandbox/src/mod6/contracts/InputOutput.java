package mod6.contracts;

/**
 * Class description: Interface representing input/output functionality.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public interface InputOutput {

	/**
	 * Displays text to the user.
	 * 
	 * @param text Text to be displayed.
	 */
	public void display(String text);

	/**
	 * Prompts the user for input
	 * 
	 * @param text Text the user will see
	 * @return The user's input
	 */
	public String prompt(String text);

	public default void displayError(String text) {
		System.out.println("ERROR!");
	};

}
