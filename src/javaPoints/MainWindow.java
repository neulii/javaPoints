package javaPoints;

import javax.swing.*;
import java.util.Vector;

public class MainWindow {

	private PointModel model;
	private JFrame window;
	private Vector<PlayerPanel> playerFields;

	public MainWindow(PointModel model) {

		this.model = model;
		playerFields= new Vector<>();
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

		int numberOfPlayers = players.size();
		//TODO hier weitermachen


	}
}
