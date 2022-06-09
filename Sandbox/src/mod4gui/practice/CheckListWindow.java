package mod4gui.practice;

import javax.swing.*;

/**
 * Class description: create a checklist
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class CheckListWindow extends JFrame {

	public CheckListWindow() {
		super("Option A");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = createPanel();
		this.add(panel);
	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();

		// add stuff to it
		JCheckBox box1 = new JCheckBox("True Blood");
		JCheckBox box2 = new JCheckBox("Game of Thrones");
		JCheckBox box3 = new JCheckBox("Breaking Bad");
		JCheckBox box4 = new JCheckBox("Vampire Diaries");
		JCheckBox box5 = new JCheckBox("Silicon Valley");

		panel.add(box1);
		panel.add(box2);
		panel.add(box3);
		panel.add(box4);
		panel.add(box5);

		return panel;
	}

}
