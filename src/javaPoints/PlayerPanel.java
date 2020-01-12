package javaPoints;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {

    private JLabel playerNameLabel;

    public PlayerPanel(Player player,int width, int height){

        playerNameLabel = new JLabel(player.getPlayerName());
        this.setSize(width, height);
        playerNameLabel.setSize(width,30);
        playerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBackground(Color.red);

        this.add(playerNameLabel);
    }

}
