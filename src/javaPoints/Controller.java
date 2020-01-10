package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	
	public Controller(PointModel model, MainWindow window) {
		
		this.model = model;
		this.window = window;


		model.addPlayer(new Player("stefan"));
		model.addPlayer(new Player("herbert"));


		model.addPoints(30,45);
		model.addPoints(100,55);
		model.addPoints(10,2);
		model.addPoints(144,222);


	}
	
	

}
