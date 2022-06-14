package mod4gui.practice;

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

		/* NEW STUFF STARTS HERE */

		// create a list model that contains all the games
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("Settlers of Catan");
		listModel.addElement("Monopoly");
		listModel.addElement("Risk");
		listModel.addElement("Ticket to Ride");
		listModel.addElement("Life");
		listModel.addElement("Monopoly");
		listModel.addElement("Risk");
		listModel.addElement("Ticket to Ride");
		listModel.addElement("Life");

		// use that list model to create a JList
		JList listOfGames = new JList(listModel);

		// add a scrollbar to that list
		JScrollPane scrolly = new JScrollPane(listOfGames);

		// add the whole thing to our panel
		panel.add(scrolly);

		/* NEW STUFF OVER */

		return panel;

	}

}
