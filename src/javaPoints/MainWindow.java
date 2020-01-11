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

		int labelWidth = 0;

		if(playerNames.size()==0)
			labelWidth = window.getWidth();
		else
			labelWidth = window.getWidth()/(playerNames.size());

		tempPlayer.setSize(labelWidth,30);
		tempPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		window.add(tempPlayer);
		playerNames.add(tempPlayer);

		//TODO calculate new Positions

		window.revalidate();





	}
}
