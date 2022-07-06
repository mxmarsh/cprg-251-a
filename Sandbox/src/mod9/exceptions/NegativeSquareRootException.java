package mod9.exceptions;

/**
 * Class description: This is thrown if we attempt to take the square root of a
 * negative number.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class NegativeSquareRootException extends Exception {

	/**
	 * Initializes the newly created NegativeSquareRootException
	 */
	public NegativeSquareRootException() {
	}

	/**
	 * Initializes the newly created NegativeSquareRootException
	 * 
	 * @param message
	 */
	public NegativeSquareRootException(String message) {
		super("Cannot take the square root of a negative number.");
	}

}
