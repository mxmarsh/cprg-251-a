package mod4gui;

import javax.swing.*;

/**
 * Class description: This represents our specialized JFrame
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class MyWindow extends JFrame {

	/**
	 * Initializes the newly created MyWindow
	 */
	public MyWindow() {

		// calling the superclass constructor
		super("this is the window title");

		// set the size of the window
		setSize(500, 200); // setting the width and height of our new window

		// set the process to terminate when the window is closed:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// call the method to create a new panel
		JPanel panel = createPanel();

		// add that new panel to our windowframe
		add(panel);

	}

	private JPanel createPanel() {

		// create a panel object:
		JPanel panel = new JPanel();

		// create a button
		JButton button1 = new JButton("click me!");
		// add the button to the panel
		panel.add(button1);

		// return it
		return panel;

	}

}
