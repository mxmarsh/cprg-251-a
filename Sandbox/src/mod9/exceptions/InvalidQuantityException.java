package mod9.exceptions;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class InvalidQuantityException extends Exception {

	public InvalidQuantityException() {
		super("Quantity must be a positive whole number.");
	}

	public InvalidQuantityException(String message) {
		super(message);
	}

}
