package javaPoints;

import javax.swing.*;
import java.util.Vector;

public class MainWindow {

	private PointModel model;
	private JFrame window;
	private Vector<JLabel> playerNames;

	public MainWindow(PointModel model) {

		this.model = model;
		playerNames = new Vector<>();

		initializeWindow();
	}

	public void initializeWindow(){
		
		window = new JFrame("rummyPoints");
		window.setSize(800, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setLocationRelativeTo(null);

		System.out.println(model);

		window.setVisible(true);
		
	}

	public void addPlayerField(Player player){
		JLabel tempPlayer = new JLabel(player.getPlayerName());

		int labelWidth = window.getHeight();

		if(playerNames.size()>1)
			labelWidth = window.getWidth()/(playerNames.size());

		tempPlayer.setSize(labelWidth,30);

		window.add(tempPlayer);
		playerNames.add(tempPlayer);

		window.revalidate();





	}
}
