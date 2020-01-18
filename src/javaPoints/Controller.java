package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	private PlayerChooser settingsWindow;
	private SettingsWindowListener chooserListener;
	
	public Controller() {
		
		this.model = new PointModel(1000);
		this.window = new MainWindow(model);
		
		
		
		window.addMenuListener(new MenuListener(this));
		
		
		//window.addPlayersFields(model.getPlayers());

		

	}

	public void newGameItemAction() {
		//TODO neues spiel dialog -> wieviele spieler, spielernamen und punkte 
		
		chooserListener = new SettingsWindowListener(this);
		
		settingsWindow= new PlayerChooser(model, window);
		settingsWindow.addListener(chooserListener);
		
		
		
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
