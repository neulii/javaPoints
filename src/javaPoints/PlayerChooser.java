package javaPoints;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;


public class PlayerChooser {

	JDialog playerChooser;
	private JTextField playerOneNameInput;
	private JTextField playerTwoNameInput;
	private JTextField playerThreeNameInput;
	private JTextField playerFourNameInput;
	private JTextField playerSixNameInput;
	private JTextField diffPointsInput;
	
	public PlayerChooser(PointModel model, MainWindow window) {
		
		playerChooser = new JDialog(window.getFrame(),"Spieler Einstellungen",true);
		
		playerChooser.setSize(745,516);
		playerChooser.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		playerChooser.setLocationRelativeTo(window.getFrame());
		playerChooser.getContentPane().setLayout(null);
		
		JCheckBox playerOneCheckBox = new JCheckBox("Spieler 1");
		playerOneCheckBox.setBounds(35, 60, 97, 23);
		playerChooser.getContentPane().add(playerOneCheckBox);
		
		JCheckBox playerTwoCheckBox = new JCheckBox("Spieler 2");
		playerTwoCheckBox.setBounds(35, 143, 97, 23);
		playerChooser.getContentPane().add(playerTwoCheckBox);
		
		JCheckBox playerThreeCheckbox = new JCheckBox("Spieler 3");
		playerThreeCheckbox.setBounds(35, 226, 97, 23);
		playerChooser.getContentPane().add(playerThreeCheckbox);
		
		JCheckBox PlayerFourCheckBox = new JCheckBox("Spieler 4");
		PlayerFourCheckBox.setBounds(35, 309, 97, 23);
		playerChooser.getContentPane().add(PlayerFourCheckBox);
		
		JCheckBox PlayerFiveCheckBox = new JCheckBox("Spieler 5");
		PlayerFiveCheckBox.setBounds(35, 392, 97, 23);
		playerChooser.getContentPane().add(PlayerFiveCheckBox);
		
		playerOneNameInput = new JTextField();
		playerOneNameInput.setEnabled(false);
		playerOneNameInput.setBounds(138, 61, 257, 20);
		playerChooser.getContentPane().add(playerOneNameInput);
		playerOneNameInput.setColumns(10);
		
		playerTwoNameInput = new JTextField();
		playerTwoNameInput.setEnabled(false);
		playerTwoNameInput.setColumns(10);
		playerTwoNameInput.setBounds(138, 144, 257, 20);
		playerChooser.getContentPane().add(playerTwoNameInput);
		
		playerThreeNameInput = new JTextField();
		playerThreeNameInput.setEnabled(false);
		playerThreeNameInput.setColumns(10);
		playerThreeNameInput.setBounds(138, 227, 257, 20);
		playerChooser.getContentPane().add(playerThreeNameInput);
		
		playerFourNameInput = new JTextField();
		playerFourNameInput.setEnabled(false);
		playerFourNameInput.setColumns(10);
		playerFourNameInput.setBounds(138, 310, 257, 20);
		playerChooser.getContentPane().add(playerFourNameInput);
		
		playerSixNameInput = new JTextField();
		playerSixNameInput.setEnabled(false);
		playerSixNameInput.setColumns(10);
		playerSixNameInput.setBounds(138, 393, 257, 20);
		playerChooser.getContentPane().add(playerSixNameInput);
		
		JLabel lblNewLabel = new JLabel("Punktedifferenz zum Gewinn");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(479, 64, 185, 19);
		playerChooser.getContentPane().add(lblNewLabel);
		
		diffPointsInput = new JTextField();
		diffPointsInput.setEnabled(false);
		diffPointsInput.setHorizontalAlignment(SwingConstants.CENTER);
		diffPointsInput.setBounds(528, 94, 86, 20);
		playerChooser.getContentPane().add(diffPointsInput);
		diffPointsInput.setColumns(10);
		
		JButton cancelButton = new JButton("Abbrechen\r\n");
		cancelButton.setBounds(459, 392, 89, 23);
		playerChooser.getContentPane().add(cancelButton);
		
		JButton okButton = new JButton("OK\r\n");
		okButton.setBounds(582, 392, 89, 23);
		playerChooser.getContentPane().add(okButton);
		
		playerChooser.setVisible(true);
			
	}
}