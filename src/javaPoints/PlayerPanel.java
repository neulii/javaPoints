package javaPoints;

import javax.swing.*;

public class PlayerPanel extends JPanel {

    private JLabel playerNameLabel;

    public PlayerPanel(Player player,int width, int height){

        playerNameLabel = new JLabel(player.getPlayerName());
        playerNameLabel.setSize(width, height);

        this.add(playerNameLabel);
    }

}
