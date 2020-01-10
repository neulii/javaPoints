package javaPoints;

public class RummyPoints {

	Controller controller;
	MainWindow window;
	PointModel model;
	
	
	public RummyPoints() {
		
		model = new PointModel(2, 1000);
		window = new MainWindow();
		
		controller = new Controller(model, window);

	}
	
	public static void main(String[] args) {
		
		new RummyPoints();
	}

}
