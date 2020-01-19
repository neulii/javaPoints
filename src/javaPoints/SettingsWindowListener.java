package javaPoints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class SettingsWindowListener implements ActionListener {

	Controller controller;
	
	public SettingsWindowListener(Controller controller) {
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case "Abbrechen":
			controller.disposeSettingsWindow();
			
			break;
		
		case "OK":
		
			
			break;

		}
		
		
	}

}
