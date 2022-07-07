package mod9.exceptions;

/**
 * Class description: This is thrown if a price is less than $0.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class InvalidPriceException extends Exception {

	public InvalidPriceException() {
		super("Price cannot be less than $0.");
	}

	public InvalidPriceException(String message) {
		super(message);
	}

}
