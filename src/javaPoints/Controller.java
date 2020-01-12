package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	
	public Controller() {
		
		this.model = new PointModel(1000);
		this.window = new MainWindow(model);

		model.addPlayer(new Player("stefan"));
		model.addPlayer(new Player("birgit"));
		model.addPlayer(new Player("florian"));


		window.addPlayersFields(model.getPlayers());

		window.repaint();








	}
	
	

}
