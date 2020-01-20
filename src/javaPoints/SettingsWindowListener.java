package javaPoints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class SettingsWindowListener implements ActionListener {

	Controller controller;
	SettingsWindow settingsWindow;
	
	public SettingsWindowListener(Controller controller, SettingsWindow settingsWindow) {
		this.controller = controller;
		this.settingsWindow = settingsWindow;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//System.out.println(e.getActionCommand());
		
		switch (e.getActionCommand()) {
		
		case "Abbrechen":
			controller.disposeSettingsWindow();
			
			break;
		
		case "OK":
		
			
			break;

		default:
			
			
		settingsWindow.checkInputFieldsToBeEnabled();
		
		}
		
		
		
	}

}
