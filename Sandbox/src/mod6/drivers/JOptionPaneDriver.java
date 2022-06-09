package mod6.drivers;

import javax.swing.JOptionPane;

import mod6.contracts.InputOutput;

/**
 * Class description: An implementation of the InputOutput interface using
 * JOptionPane.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class JOptionPaneDriver implements InputOutput {

	@Override
	public void display(String text) {
		JOptionPane.showMessageDialog(null, text);
	}

	@Override
	public String prompt(String text) {
		String userInput = JOptionPane.showInputDialog(text);
		return userInput;
	}

}
