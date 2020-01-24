package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	private SettingsWindow settingsWindow;
	private SettingsWindowListener settingsListener;

	private NewGameWindow newGameWindow;
	
	public Controller() {

		this.model = new PointModel(1000);
		this.window = new MainWindow(model);

		this.newGameWindow = new NewGameWindow(window);


		window.addMenuListener(new MenuListener(this));
		
		
		settingsWindow= new SettingsWindow(model, window);
		settingsListener = new SettingsWindowListener(this, settingsWindow);
		settingsWindow.addListener(settingsListener);
		

	}

	public void newGameItemAction() {
		//TODO neues spiel dialog -> wieviele spieler, spielernamen und punkte 
		
		//settingsWindow.setVisible(true);

		newGameWindow.setVisible(true);
		
		
	}
	
	public void disposeSettingsWindow() {
		settingsWindow.setVisible(false);
	}

	public void exitProgAction() {
		
		System.exit(0);
	}

	public void saveGameAction() {
		
		
	}

	public void openGameAction() {
		
		
	}

	public void aboutProgAction() {

		
	}
	
	

}
