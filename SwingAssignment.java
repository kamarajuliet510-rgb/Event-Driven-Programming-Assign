import javax.swing.*;
import java.awt.*;

public class SwingAssignment extends JFrame {
	// Required components
	JFrame frame;
	JPanel panel;
	JLabel label;

	// Additional components
	JLabel heading;
	JLabel iconLabel;
	JButton changeButton;
	ImageIcon icon;

	// Constructor
	public SwingAssignment() {

		// 1. JFRAME
		frame = new JFrame("Java Swing Assignment");

		frame.setSize(800, 800);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLocationRelativeTo(null);

		// Prevent resizing so the 800 x 800 layout stays consistent
		frame.setResizable(false);

		// 2. JPANEL
		panel = new JPanel();

		// GridBagLayout helps us centre everything properly
		panel.setLayout(new GridBagLayout());

		panel.setBackground(Color.WHITE);

		// GridBagConstraints controls component positions
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;

		// 3. IMAGEICON
		icon = new ImageIcon("src/images/logo2.png");

		// Set icon on JFrame title bar
		frame.setIconImage(icon.getImage());

		// Resize the icon for display inside the JPanel
		Image resizedImage = icon.getImage().getScaledInstance(
				90,
				90,
				Image.SCALE_SMOOTH
		);

		ImageIcon displayIcon = new ImageIcon(resizedImage);

		iconLabel = new JLabel(displayIcon);

		iconLabel.setHorizontalAlignment(SwingConstants.CENTER);

		// Position ImageIcon
		gbc.gridy = 0;

		gbc.insets = new Insets(
				10,
				10,
				20,
				10
		);

		panel.add(iconLabel, gbc);

		// 4. HEADING
		heading = new JLabel(
				"BASIC INTERACTIVE JAVA SWING GUI"
		);

		heading.setFont(
				new Font(
						"Arial",
						Font.BOLD,
						28
				)
		);

		heading.setHorizontalAlignment(
				SwingConstants.CENTER
		);


		// Position heading
		gbc.gridy = 1;

		gbc.insets = new Insets(
				10,
				10,
				50,
				10
		);

		panel.add(heading, gbc);

		// 5. REQUIRED JLABEL
		label = new JLabel(
				"<html>"
						+ "<center>"
						+ "Welcome to Java Swing First"
						+ "<br>"
						+ "Individual Assignment by"
						+ "<br>"
						+ "JULIET J.S KAMARA"
						+ "</center>"
						+ "</html>"
		);

		label.setFont(
				new Font(
						"Arial",
						Font.BOLD,
						22
				)
		);

		// THIS CENTRES THE TEXT INSIDE THE LABEL
		label.setHorizontalAlignment(
				SwingConstants.CENTER
		);

		// Give the label enough width so its text stays centred
		label.setPreferredSize(
				new Dimension(
						500,
						110
				)
		);

		// Position JLabel
		gbc.gridy = 2;

		gbc.insets = new Insets(
				10,
				10,
				50,
				10
		);

		panel.add(label, gbc);

		// 6. JBUTTON
		changeButton = new JButton(
				"Change Display"
		);

		changeButton.setFont(
				new Font(
						"Arial",
						Font.BOLD,
						18
				)
		);


		changeButton.setPreferredSize(
				new Dimension(
						190,
						45
				)
		);


		// Position button
		gbc.gridy = 3;

		gbc.insets = new Insets(
				10,
				10,
				10,
				10
		);

		panel.add(changeButton, gbc);

		// 7. EVENT HANDLING
		changeButton.addActionListener(e -> {

			// Change JLabel text
			label.setText(
					"<html>"
							+ "<center>"
							+ "Welcome to Event Driven Programming!"
							+ "<br>"
							+ "The display has been changed."
							+ "</center>"
							+ "</html>"
			);
			// Change JPanel background
			panel.setBackground(
					new Color(
							20,
							100,
							70
					)
			);
		});

		// 8. ADD PANEL TO FRAME
		frame.add(panel);

		// 9. DISPLAY THE APPLICATION

		frame.setVisible(true);
	}

	// MAIN METHOD
	public static void main(String[] args) {

		SwingUtilities.invokeLater(
				SwingAssignment::new
		);
	}
}