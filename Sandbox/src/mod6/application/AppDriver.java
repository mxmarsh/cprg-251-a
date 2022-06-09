package mod6.application;

import mod6.contracts.InputOutput;
import mod6.drivers.JOptionPaneDriver;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class AppDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// InputOutput io = new ScannerDriver();
		InputOutput io = new JOptionPaneDriver();

		String name = io.prompt("What is your name?");

		io.display("Hello, " + name + "!");
	}

}
