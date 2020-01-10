package javaPoints;

import java.util.Vector;

public class PointModel {
	
	int diffPointsToWin;
	int playedRounds;

	Vector<Player> players;

	public PointModel(int diffPointsToWin) {

		this.diffPointsToWin = diffPointsToWin;
		playedRounds = 0;
		players = new Vector<Player>();
	}

	public void addPlayer(Player player){
		players.add(player);
	}

	public void addPoints(int ... points){
		if(players!=null){
			if(points.length!=players.size()) {

				System.out.println("falsche anzahl an punkten");
				return;
			}

				for(int i = 0; i<points.length; i++) {

					players.elementAt(i).addPoints(points[i]);

			}

		}
		else
		{
			System.out.println("keine player -> bitte erst player erstellen");

		}



	}
	//TODO check winner must be implemented
	public Player checkWinner(){

		if(players.size()<2){
			System.out.println("zuwenige spieler");
			return null;
		}

		return null;
	}

}
