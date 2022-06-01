package mod4GUIpractice;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

/**
 * Class description: This represents our home window
 *
 * @author Dana Marsh (dana.marsh@sait.ca) & class
 *
 */

public class OurWindow extends JFrame {

	// fields
	JButton buttonA;
	JButton buttonB;

	/**
	 * Initializes the newly created OurWindow
	 */
	public OurWindow() {

		// calling the superclass constructor
		super("Home");

		// set the size of the window
		setSize(300, 100); // setting the width and height of our new window

		// set the process to terminate when the window is closed:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// call the method to create 2 new panels
		JPanel topPanel = createTopPanel();
		JPanel bottomPanel = createBottomPanel();

		// add those new panel to our windowframe
		this.add(topPanel, BorderLayout.NORTH);
		this.add(bottomPanel, BorderLayout.SOUTH);

	}

	private JPanel createTopPanel() {
		JPanel panel = new JPanel();

		// add stuff to it
		JLabel label = new JLabel("Which window would you like to see?");
		panel.add(label);

		return panel;
	}

	private JPanel createBottomPanel() {
		JPanel panel = new JPanel();

		// add stuff to it
		buttonA = new JButton("A");
		buttonB = new JButton("B");

		ActionListener al = new OurActionListener();
		buttonA.addActionListener(al);
		buttonB.addActionListener(al);

		panel.add(buttonA);
		panel.add(buttonB);

		return panel;
	}

	private class OurActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// if button A was clicked, launch a new window
			if (e.getSource() == buttonA) {
				// open new window
				buttonA.setText("clicked!");
				CheckListWindow checklist = new CheckListWindow();
				checklist.setVisible(true);
			} // otherwise, if button B was clicked, launch the other new window
			else if (e.getSource() == buttonB) {
				// open the other window
				buttonB.setText("clicked!");
				GamesWindow gamesWindow = new GamesWindow();
				gamesWindow.setVisible(true);

			}

		}

	}
}
