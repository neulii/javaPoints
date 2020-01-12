package javaPoints;

import javax.swing.*;
import java.util.Vector;

public class MainWindow {

	private PointModel model;
	private JFrame window;
	private Vector<PlayerPanel> playerFields;

	public MainWindow(PointModel model) {

		this.model = model;
		playerFields= new Vector<PlayerPanel>();
		initializeWindow();


	}

	public void initializeWindow(){
		
		window = new JFrame("rummyPoints");
		window.setSize(800, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setLocationRelativeTo(null);

		window.setVisible(true);
		
	}

	public void addPlayersFields(Vector<Player> players) {

		if(players.size()>1){
			int topOffset = 100;
			int height = 30;
			int numberOfPlayers = players.size();
			int width = window.getWidth()/numberOfPlayers;

			//For every player
			for (int i = 0; i<numberOfPlayers; i++){
				PlayerPanel tempPanel = new PlayerPanel(players.elementAt(i),width,height);
				tempPanel.setLocation(i*width,topOffset);
				playerFields.add(tempPanel);

				window.add(tempPanel);
			}
		}
		else
			System.out.println("too few players");





	}
}
