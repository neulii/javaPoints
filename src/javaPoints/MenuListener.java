package javaPoints;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {
	
	private Controller controller;
	
	public MenuListener(Controller controller) {
		this.controller = controller;
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {
        String menuItemText = ((JMenuItem)(e.getSource())).getText();

        switch (menuItemText){
            case "Neues Spiel":
            	controller.newGameItemAction();
                break;

            case "Beenden":

                controller.exitProgAction();
                break;

            case "Spiel Speichern":
            	controller.saveGameAction();
                break;

            case "Spiel Oeffnen":
            	controller.openGameAction();
                break;
                
            case "About":
            	controller.aboutProgAction();
            	break;
        }
    }
}
