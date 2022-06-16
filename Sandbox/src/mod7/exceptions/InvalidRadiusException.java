package mod7.exceptions;

/**
 * Class description: thrown if a negative radius is provided
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class InvalidRadiusException extends Exception {

	public InvalidRadiusException() {
		super("Radius cannot be negative.");
	}

}
