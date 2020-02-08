package javaPoints.newGameWindow;

import javax.swing.*;
import java.awt.*;

public class PlayerInputLine extends JPanel{

    JLabel playerNumberLabel;
    JTextField playerNameInput;

    public PlayerInputLine(String labelText, int offsetLeft, int yPosInputLine, int heightOfLine){
        this.setBackground(Color.lightGray);
        this.setBounds(offsetLeft,yPosInputLine,350,heightOfLine);
        this.setLayout(null);

        playerNumberLabel = new JLabel(labelText);

        System.out.println(playerNumberLabel.getWidth());
        playerNumberLabel.setBounds(20,0,100,heightOfLine);


        this.add(playerNumberLabel);

        playerNameInput = new JTextField();
        playerNameInput.setBounds(100,0,250,heightOfLine);
        playerNameInput.setHorizontalAlignment(JTextField.CENTER);

        playerNameInput.setBackground(new Color(99, 63,100));
        playerNameInput.setOpaque(true);

        this.add(playerNameInput);

    }

    public void enableInputLine(boolean enable){
        this.setEnabled(enable);
        playerNameInput.setEnabled(enable);
        playerNumberLabel.setEnabled(enable);
    }

}
