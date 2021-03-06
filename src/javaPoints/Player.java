package javaPoints;

import java.util.Vector;

public class Player {

    private String playerName;
    private int sumPoints = 0;
    private Vector<Integer> playerPoints;


    public Player(String playerName){
        this.playerName = playerName;
        playerPoints = new Vector<Integer>();
    }

    public int getSumPoints(){
        updatePlayerPoints();
        return sumPoints;
    }

    public Vector<Integer> getPlayerPoints(){
        return playerPoints;
    }

    public void addPoints(int points){
        playerPoints.add(points);

        updatePlayerPoints();
        System.out.println(sumPoints + "  " + playerName);

    }

    public void updatePlayerPoints(){
        sumPoints = 0;

        for(int i = 0; i<playerPoints.size(); i++){

            sumPoints = sumPoints + playerPoints.elementAt(i);

        }
    }

    public String getPlayerName(){

        return playerName;
    }

}


