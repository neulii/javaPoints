package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	
	public Controller() {
		
		this.model = new PointModel(1000);
		this.window = new MainWindow(model);
		
		
		
		window.addMenuListener(new MenuListener(this));
		
		
		//window.addPlayersFields(model.getPlayers());

		

	}

	public void newGameItemAction() {
		
		
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
