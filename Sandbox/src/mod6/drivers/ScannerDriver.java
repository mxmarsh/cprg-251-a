package mod6.drivers;

import java.util.Scanner;

import mod6.contracts.InputOutput;

/**
 * Class description: An implementation of the InputOutput interface using
 * Scanner.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class ScannerDriver implements InputOutput {

	private Scanner keyboard;

	/**
	 * Initializes the newly created ScannerDriver
	 */
	public ScannerDriver() {
		this.keyboard = new Scanner(System.in);
	}

	@Override
	public void display(String text) {
		System.out.println(text);
	}

	@Override
	public String prompt(String text) {
		// show the user the prompt
		System.out.println(text);
		// get their input
		String userInput = this.keyboard.nextLine();
		// return input
		return userInput;
	}

}
