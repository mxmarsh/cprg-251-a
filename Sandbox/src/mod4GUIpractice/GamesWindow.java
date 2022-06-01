package mod4GUIpractice;

import javax.swing.*;

/**
 * Class description: create a combo box
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class GamesWindow extends JFrame {

	public GamesWindow() {
		super("Option B");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = createPanel();
		this.add(panel);
	}

	private JPanel createPanel() {

		JPanel panel = new JPanel();

		String[] games = { "Settlers of Catan", "Monopoly", "Risk", "Ticket to Ride", "Life" };

		JComboBox comboBox = new JComboBox(games);
		comboBox.setEditable(true); // makes it possible to type in another option
		panel.add(comboBox);

		return panel;

	}

}
