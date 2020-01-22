package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	private SettingsWindow settingsWindow;
	private SettingsWindowListener settingsListener;
	
	public Controller() {
		
		this.model = new PointModel(1000);
		this.window = new MainWindow(model);
		
		window.addMenuListener(new MenuListener(this));
		
		
		settingsWindow= new SettingsWindow(model, window);
		settingsListener = new SettingsWindowListener(this, settingsWindow);
		settingsWindow.addListener(settingsListener);
		

	}

	public void newGameItemAction() {
		
		settingsWindow.setVisible(true);
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
