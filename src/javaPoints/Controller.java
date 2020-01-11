package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	
	public Controller() {
		
		this.model = new PointModel(1000);
		this.window = new MainWindow(model);

		window.addPlayersFields(model.getPlayers());










	}
	
	

}
