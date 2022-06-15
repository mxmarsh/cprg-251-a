package mod7exceptions;

/**
 * 
 * Class description: a very silly little class to play around with Exceptions
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */
public class AppDriver {

	public static void main(String[] args) {

		int age;

		try {
			// code before
			age = setAge(-5);
			// code after
		} catch (NumberFormatException e) {
			// fix it somehow
		} catch (Exception e) {
			System.out.println(e.getMessage()); // print out the message within the Exception
			e.printStackTrace(); // print out the steps that occurred before the exception was thrown
			System.out.println(e); // print out the name & message
			// prompt them again for a valid input..
			age = 0;
		} finally {
			// this code runs NO MATTER WHAT
		}
	}

	public static void rethrow() throws Exception {
		try {
			setAge(-2);
		} catch (NumberFormatException e) {
			// can fix this
		} catch (Exception e) {
			// can't fix this, gonna re-throw it
			throw e;
		}
	}

	/**
	 * This method sets the age
	 * 
	 * @param age The new age
	 * @return Who knows, this method makes no sense
	 * @throws Exception If the age < 0
	 */
	public static int setAge(int age) throws Exception {
		if (age < 0)
			throw new Exception("Age cannot be a negative number.");
		else
			throw new NumberFormatException("something bad happened");
	}

}
