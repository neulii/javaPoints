package javaPoints;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class PlayerChooser {

	JDialog playerChooser;
	
	public PlayerChooser(PointModel model, MainWindow window) {
		
		playerChooser = new JDialog(window.getFrame(),"Spieler Einstellungen",true);
		
		playerChooser.setSize(500,300);
		playerChooser.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		playerChooser.setLocationRelativeTo(window.getFrame());
		
		playerChooser.setVisible(true);
			
	}
}
