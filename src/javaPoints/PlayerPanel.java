package javaPoints;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PlayerPanel extends JPanel {

    private JLabel playerNameLabel;
    private JLabel playerPointsLabel;
    private JTextField pointsInput;

    Border nameLabelBorder;

    public PlayerPanel(Player player,float width, float height){
        this.setLayout(null);
        playerNameLabel = new JLabel(player.getPlayerName());
        this.setSize((int)width, (int)height);
        playerNameLabel.setSize((int)width,30);
        playerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        //this.setBackground(Color.red);
        this.add(playerNameLabel);
        nameLabelBorder = BorderFactory.createLineBorder(Color.black,2);
        this.setBorder(nameLabelBorder);
        playerNameLabel.setBorder(nameLabelBorder);

        playerPointsLabel = new JLabel("0");
        playerPointsLabel.setSize((int)width,50);
        playerPointsLabel.setLocation(0,playerNameLabel.getHeight());
        playerPointsLabel.setVerticalAlignment(SwingConstants.CENTER);
        playerPointsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playerPointsLabel.setFont(new Font("Dialog.bold", Font.PLAIN, 30));
        this.add(playerPointsLabel);

        pointsInput = new JTextField();

        int pointsInputWidth = 100;
        pointsInput.setSize(pointsInputWidth,30);
        pointsInput.setHorizontalAlignment(SwingConstants.CENTER);
        pointsInput.setLocation((this.getWidth()-pointsInputWidth)/2,playerPointsLabel.getHeight()+ playerNameLabel.getHeight());
        this.add(pointsInput);


    }

}
