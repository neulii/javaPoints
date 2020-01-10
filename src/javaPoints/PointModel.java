package javaPoints;

public class PointModel {
	
	int diffPointsToWin;
	int numberOfPLayers;
	
	
	public PointModel(int numberOfPlayers, int diffPointsToWin) {
		this.numberOfPLayers = numberOfPlayers;
		this.diffPointsToWin = diffPointsToWin;
	}
	
	public int getNumberOfPlayers() {
		return numberOfPLayers;
	}

}
