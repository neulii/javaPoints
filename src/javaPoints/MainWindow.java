package javaPoints;

import javax.swing.JFrame;

public class MainWindow {

	private JFrame window;
	
	public MainWindow() {
		
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
}
