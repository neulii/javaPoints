package javaPoints;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Vector;

public class MainWindow {

	private PointModel model;
	private JFrame window;
	private Vector<PlayerPanel> playerFields;
	private JLabel leadingPoints;

	JMenuBar menuBar;

	private JMenu gameMenu;
	private JMenu infoMenu;

	private JMenuItem gameMenu_NewGame;
	private JMenuItem gameMenu_ExitGame;
	private JMenuItem gameMenu_OpenGame;
	private JMenuItem gameMenu_SaveGame;


	int topOffset = 100;

	public MainWindow(PointModel model) {

		this.model = model;
		playerFields= new Vector<PlayerPanel>();
		initializeWindow();

	}
	public void repaint(){

			window.repaint();
	}
	public void initializeWindow(){
		
		window = new JFrame("rummyPoints");
		window.setSize(800, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);

		leadingPoints = new JLabel("0");
		leadingPoints.setSize(window.getWidth(),100);
		leadingPoints.setHorizontalAlignment(SwingConstants.CENTER);
		leadingPoints.setVerticalAlignment(SwingConstants.CENTER);
		//leadingPoints.setBackground(Color.blue);
		leadingPoints.setOpaque(true);
		leadingPoints.setFont(new Font("Dialog.bold", Font.PLAIN, 30));
		leadingPoints.setLocation(0,0);


		window.add(leadingPoints);

		window.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				super.componentResized(e);
				sizingPlayerFields();
			}
		});

		menuBar = new JMenuBar();

		gameMenu = new JMenu("Spiel");
		menuBar.add(gameMenu);

		gameMenu_NewGame = new JMenuItem("Neues Spiel");
		gameMenu.add(gameMenu_NewGame);
		gameMenu_NewGame.addActionListener(new MenuListener());

		gameMenu_SaveGame = new JMenuItem("Spiel Speichern");
		gameMenu.add(gameMenu_SaveGame);
		gameMenu_SaveGame.addActionListener(new MenuListener());

		gameMenu_OpenGame = new JMenuItem("Spiel Öffnen");
		gameMenu.add(gameMenu_OpenGame);
		gameMenu_OpenGame.addActionListener(new MenuListener());

		gameMenu_ExitGame = new JMenuItem("Beenden");
		gameMenu.add(gameMenu_ExitGame);
		gameMenu_ExitGame.addActionListener(new MenuListener());




		window.setJMenuBar(menuBar);




		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
	}

	public void addPlayersFields(Vector<Player> players) {

		if(players.size()>1){
			int topOffset = 100;
			int height = 300;
			int numberOfPlayers = players.size();
			float width = window.getWidth()/numberOfPlayers;

			window.setMinimumSize(new Dimension(150*players.size(),window.getHeight()));
			//window.setSize(players.size()*200,window.getHeight());
			//For every player
			for (int i = 0; i<numberOfPlayers; i++){
				PlayerPanel tempPanel = new PlayerPanel(players.elementAt(i),(int)width,height);
				tempPanel.setLocation(i*(int)width,topOffset);
				playerFields.add(tempPanel);

				window.add(tempPanel);
			}
			sizingPlayerFields();

		}
		else
			System.out.println("too few players");

	}

	public void sizingPlayerFields(){
		if(playerFields.size()<2)
			return;
		int numberOfPlayers = playerFields.size();
		float width = window.getWidth()/numberOfPlayers;

		leadingPoints.setSize(window.getWidth(),leadingPoints.getHeight());

		//For every player
		for (int i = 0; i<numberOfPlayers; i++){
			PlayerPanel tempPanel = playerFields.elementAt(i);
			tempPanel.setSize((int)width,tempPanel.getHeight());
			tempPanel.setLocation(i*(int)width,topOffset);
		}
		window.repaint();
	}

	public Vector<PlayerPanel> getPlayerFields(){
		return playerFields;
	}
}
