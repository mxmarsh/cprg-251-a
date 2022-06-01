package mod4GUIpractice;

import javax.swing.*;

/**
 * Class description: This represents our home window
 *
 * @author Dana Marsh (dana.marsh@sait.ca) & class
 *
 */

public class OurWindow extends JFrame {

	/**
	 * Initializes the newly created OurWindow
	 */
	public OurWindow() {

		// calling the superclass constructor
		super("Home");

		// set the size of the window
		setSize(500, 200); // setting the width and height of our new window

		// set the process to terminate when the window is closed:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// call the method to create 2 new panels
		JPanel topPanel = createTopPanel();
		JPanel bottomPanel = createBottomPanel();

		// add those new panel to our windowframe
		this.add(topPanel);
		this.add(bottomPanel);

	}

	private JPanel createTopPanel() {
		JPanel panel = new JPanel();

		// add stuff to it

		return panel;
	}

	private JPanel createBottomPanel() {
		JPanel panel = new JPanel();

		// add stuff to it

		return panel;
	}

}
