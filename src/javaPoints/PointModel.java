package javaPoints;

import java.util.Vector;

public class PointModel {
	
	int diffPointsToWin;
	int playedRounds;
	boolean playersAreRanked = false;

	Vector<Player> players;

	Vector<Player> playersRanked;

	public PointModel(int diffPointsToWin) {

		this.diffPointsToWin = diffPointsToWin;
		playedRounds = 0;
		players = new Vector<Player>();
		playersRanked = new Vector<Player>();
	}

	public void addPlayer(Player player){
		players.add(player);
		playersRanked = players;
		playersAreRanked = false;
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

			playersAreRanked = false;

		}
		else
		{
			System.out.println("keine player -> bitte erst player erstellen");

		}



	}

	public void rankPlayers(){
		if( (players==null) || (players.size()<2) ){
			System.out.println("cannot sort -> null or to low players");
			return;
		}
		else
		{

			Player temp;

			for(int i=1; i<playersRanked.size(); i++) {
				for(int j=0; j<playersRanked.size()-i; j++) {
					if(playersRanked.elementAt(j).getSumPoints()<playersRanked.elementAt(j+1).getSumPoints()) {
						temp=playersRanked.elementAt(j);
						playersRanked.set(j,playersRanked.elementAt(j+1));
						playersRanked.set(j+1,temp);
					}
				}
			}
			playersAreRanked = true;
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
