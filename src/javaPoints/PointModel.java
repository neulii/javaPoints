package javaPoints;

import java.util.Vector;

public class PointModel {
	
	int diffPointsToWin;

	Vector<Player> players;
	
	
	public PointModel(int diffPointsToWin) {

		this.diffPointsToWin = diffPointsToWin;
	}

	public void addPlayer(Player player){
		players.add(player);
	}

	public Player checkWinner(){

		return null;
	}





}
