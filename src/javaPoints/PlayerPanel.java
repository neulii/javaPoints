package javaPoints;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PlayerPanel extends JPanel {

    private JLabel playerNameLabel;
    Border border;

    public PlayerPanel(Player player,int width, int height){
        this.setLayout(null);
        playerNameLabel = new JLabel(player.getPlayerName());
        this.setSize(width, height);
        playerNameLabel.setSize(width,30);

        playerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBackground(Color.red);
        this.add(playerNameLabel);

        border = BorderFactory.createLineBorder(Color.black,2);

        playerNameLabel.setBorder(border);

    }

}
