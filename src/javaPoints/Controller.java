package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	
	public Controller() {
		
		this.model = new PointModel(1000);
		this.window = new MainWindow(model);

		model.addPlayer(new Player("Stefan"));
		model.addPlayer(new Player("Birgit"));
		model.addPlayer(new Player("Florian"));

		window.addPlayersFields(model.getPlayers());

		window.getPlayerFields().elementAt(0).getPointsInputField().requestFocus();


		window.repaint();

	}
	
	

}
