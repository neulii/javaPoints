package javaPoints;

public class Controller {
	
	private PointModel model;
	private MainWindow window;
	
	public Controller(PointModel model, MainWindow window) {
		
		this.model = model;
		this.window = window;


		model.addPlayer(new Player("stefan"));
		model.addPlayer(new Player("herbert"));
		model.addPlayer(new Player("superneuli"));
		model.addPlayer(new Player("schatz"));



		model.addPoints(30,45,0,1000);
		model.addPoints(100,55,40,1);
		model.addPoints(10,2,500,3);
		model.addPoints(144,222,55,4);

		model.rankPlayers();

		Player winner = model.checkWinner();

		if(winner!=null)
			System.out.println(winner.getPlayerName());
		else
			System.out.println("kein gewinner");



	}
	
	

}
