package javaPoints;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class SettingsWindow {

	private JDialog playerChooser;
	
	private JTextField playerOneNameInput;
	private JTextField playerTwoNameInput;
	private JTextField playerThreeNameInput;
	private JTextField playerFourNameInput;
	private JTextField playerFiveNameInput;
	
	private JTextField diffPointsInput;
	
	private JCheckBox playerOneCheckBox;
	private JCheckBox playerTwoCheckBox;
	private JCheckBox playerThreeCheckbox;
	private JCheckBox playerFourCheckBox;
	private JCheckBox playerFiveCheckBox;
	private JButton cancelButton;
	private JButton okButton;
	
	private Vector<JCheckBox> checkBoxes;
	private Vector<JTextField> nameTextFields;
	
	
	
	public SettingsWindow(PointModel model, MainWindow window) {
		
		playerChooser = new JDialog(window.getFrame(),"Spieler Einstellungen",true);
		
		playerChooser.setSize(745,516);
		playerChooser.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		playerChooser.setLocationRelativeTo(window.getFrame());
		playerChooser.getContentPane().setLayout(null);
		
		playerOneCheckBox = new JCheckBox("Spieler 1");
		playerOneCheckBox.setBounds(35, 60, 97, 23);
		playerChooser.getContentPane().add(playerOneCheckBox);
		
		playerTwoCheckBox = new JCheckBox("Spieler 2");
		playerTwoCheckBox.setBounds(35, 143, 97, 23);
		playerChooser.getContentPane().add(playerTwoCheckBox);
		
		playerThreeCheckbox = new JCheckBox("Spieler 3");
		playerThreeCheckbox.setBounds(35, 226, 97, 23);
		playerChooser.getContentPane().add(playerThreeCheckbox);
		
		playerFourCheckBox = new JCheckBox("Spieler 4");
		playerFourCheckBox.setBounds(35, 309, 97, 23);
		playerChooser.getContentPane().add(playerFourCheckBox);
		
		playerFiveCheckBox = new JCheckBox("Spieler 5");
		playerFiveCheckBox.setBounds(35, 392, 97, 23);
		playerChooser.getContentPane().add(playerFiveCheckBox);
		
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
		
		playerFiveNameInput = new JTextField();
		playerFiveNameInput.setEnabled(false);
		playerFiveNameInput.setColumns(10);
		playerFiveNameInput.setBounds(138, 393, 257, 20);
		playerChooser.getContentPane().add(playerFiveNameInput);
		
		JLabel lblNewLabel = new JLabel("Punktedifferenz zum Gewinn");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(479, 64, 185, 19);
		playerChooser.getContentPane().add(lblNewLabel);
		
		diffPointsInput = new JTextField();
		//diffPointsInput.setEnabled(false);
		diffPointsInput.setHorizontalAlignment(SwingConstants.CENTER);
		diffPointsInput.setBounds(528, 94, 86, 20);
		playerChooser.getContentPane().add(diffPointsInput);
		diffPointsInput.setColumns(10);
		
		cancelButton = new JButton("Abbrechen");
		cancelButton.setBounds(459, 392, 95, 23);
		playerChooser.getContentPane().add(cancelButton);
		
		okButton = new JButton("OK");
		okButton.setBounds(582, 392, 95, 23);
		playerChooser.getContentPane().add(okButton);
		
		checkBoxes = new Vector<JCheckBox>();
		checkBoxes.add(playerOneCheckBox);
		checkBoxes.add(playerTwoCheckBox);
		checkBoxes.add(playerThreeCheckbox);
		checkBoxes.add(playerFourCheckBox);
		checkBoxes.add(playerFiveCheckBox);
		
		nameTextFields = new Vector<JTextField>();
		nameTextFields.add(playerOneNameInput);
		nameTextFields.add(playerTwoNameInput);
		nameTextFields.add(playerThreeNameInput);
		nameTextFields.add(playerFourNameInput);
		nameTextFields.add(playerFiveNameInput);
	
	}
	
	public void addListener(SettingsWindowListener listener) {
		playerOneCheckBox.addActionListener(listener);
		playerTwoCheckBox.addActionListener(listener);
		playerThreeCheckbox.addActionListener(listener);
		playerFourCheckBox.addActionListener(listener);
		playerFiveCheckBox.addActionListener(listener);
		
		okButton.addActionListener(listener);
		cancelButton.addActionListener(listener);
		
	}
	
	public void setVisible(boolean visible) {
		playerChooser.setVisible(visible);
	}
	
	public void checkInputFieldsToBeEnabled(String actionCommand) {
		
		for(int i = 0;i<checkBoxes.size();i++) {
			
			nameTextFields.elementAt(i).setEnabled((checkBoxes.elementAt(i).isSelected()));
			
			//set focus to activated nametextfield
			if(checkBoxes.elementAt(i).getActionCommand().equals(actionCommand)) {
				nameTextFields.elementAt(i).grabFocus();
			}	
		}
	}
}