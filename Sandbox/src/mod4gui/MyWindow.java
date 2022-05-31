package mod4gui;

import java.awt.event.*;

import javax.swing.*;

/**
 * Class description: This represents our specialized JFrame
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class MyWindow extends JFrame {

	JButton button1;

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
		// private because it's only needed from within the MyWindow class

		// create a panel object:
		JPanel panel = new JPanel();

		// create a label:
		JLabel label1 = new JLabel("this is a label");
		// add the label to our panel
		panel.add(label1);

		// if we want to change the layout of the panel:
		// panel.setLayout(new BorderLayout());

		// the following lines only work with BorderLayout
		// panel.add(new JButton("north"), BorderLayout.NORTH);
		// panel.add(new JButton("south"), BorderLayout.SOUTH);
		// panel.add(new JButton("east"), BorderLayout.EAST);
		// panel.add(new JButton("west"), BorderLayout.WEST);

		// create a button
		button1 = new JButton("click me!");
		// add the button to the panel
		panel.add(button1);

		/*
		 * // create an action listener object as an anonymous class: ActionListener al
		 * = new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * button1.setText("hey, you clicked me!"); }
		 * 
		 * };
		 * 
		 * // attach that listener to our button: button1.addActionListener(al);
		 */

		// how to attach the listener as a component class:
		// button1.addActionListener(this);

		// attach a new action listener to our button:
		button1.addActionListener(new MyActionListener());

		// return the panel
		return panel;
	}

	// creating an inner class:
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// if button1 was clicked:
			button1.setText("hey, you clicked me!");
			// else if button2 was clicked:
			// do something else...
		}
	}

	/*
	 * // creating actionPerformed as a component class
	 * 
	 * @Override public void actionPerformed(ActionEvent e) {
	 * button1.setText("hey, you clicked me!");
	 * 
	 * }
	 */
}
